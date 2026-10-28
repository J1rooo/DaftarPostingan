package com.example.daftarpostingan

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daftarpostingan.data.ApiResult
import com.example.daftarpostingan.data.Post
import com.example.daftarpostingan.data.PostRepository
import com.example.daftarpostingan.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val repository = PostRepository()
    private val adapter = PostAdapter(
        daftar = mutableListOf(),
        onKlik = { post -> tampilkanDetail(post) },
        onHapus = { posisi -> konfirmasiHapus(posisi) }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        applyWindowInsets()
        setupRecyclerView()
        binding.btnUlang.setOnClickListener { muatPosts() }
        muatPosts()
    }

    private fun applyWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
            val bars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.header.updatePadding(top = bars.top)
            binding.root.updatePadding(left = bars.left, right = bars.right, bottom = bars.bottom)
            insets
        }
    }

    private fun setupRecyclerView() = with(binding.recyclerPost) {
        layoutManager = LinearLayoutManager(this@MainActivity)
        addItemDecoration(createDivider())
        adapter = this@MainActivity.adapter
    }

    // Pemisah transparan agar kartu tampil berjarak
    private fun createDivider() =
        DividerItemDecoration(this, DividerItemDecoration.VERTICAL).also { divider ->
            ContextCompat.getDrawable(this, R.drawable.divider_spacing)?.let(divider::setDrawable)
        }

    // ---------- Pemuatan data ----------

    private fun muatPosts() {
        render(UiState.Loading)
        lifecycleScope.launch {
            val state = when (val hasil = repository.getPosts(POST_LIMIT)) {
                is ApiResult.Success -> UiState.Success(hasil.data)
                is ApiResult.Error -> UiState.Error(pesanError(hasil.httpCode))
            }
            render(state)
        }
    }

    private fun render(state: UiState) = with(binding) {
        progress.isVisible = state is UiState.Loading
        btnUlang.isVisible = state is UiState.Error

        when (state) {
            UiState.Loading -> tvStatus.setText(R.string.status_memuat)
            is UiState.Success -> {
                adapter.tampilkan(state.posts)
                tvStatus.text = getString(R.string.status_dimuat, state.posts.size)
            }
            is UiState.Error -> tvStatus.text = state.pesan
        }
    }

    // ---------- Detail & hapus ----------

    private fun tampilkanDetail(post: Post) {
        MaterialAlertDialogBuilder(this)
            .setTitle(post.title)
            .setMessage(post.body)
            .setPositiveButton(R.string.btn_tutup, null)
            .show()
    }

    private fun konfirmasiHapus(posisi: Int) {
        val post = adapter.ambil(posisi)
        val dialog = MaterialAlertDialogBuilder(this)
            .setTitle(R.string.hapus_judul)
            .setMessage(getString(R.string.hapus_pesan, post.id))
            .setPositiveButton(R.string.btn_hapus) { _, _ -> hapusPost(post) }
            .setNegativeButton(R.string.btn_batal, null)
            .show()

        dialog.getButton(DialogInterface.BUTTON_POSITIVE)
            .setTextColor(ContextCompat.getColor(this, R.color.danger))
    }

    private fun hapusPost(post: Post) {
        lifecycleScope.launch {
            when (val hasil = repository.hapusPost(post.id)) {
                is ApiResult.Success -> {
                    // Cari posisi lagi: daftar bisa berubah selama request berjalan
                    val posisi = adapter.posisiDari(post)
                    if (posisi != NO_INDEX) adapter.hapusPada(posisi)
                    toast(getString(R.string.toast_dihapus, post.id))
                }
                is ApiResult.Error -> toast(pesanGagalHapus(hasil.httpCode))
            }
        }
    }

    // ---------- Pesan ----------

    private fun pesanError(httpCode: Int?): String =
        httpCode?.let { getString(R.string.error_server, it) } ?: getString(R.string.error_jaringan)

    private fun pesanGagalHapus(httpCode: Int?): String =
        httpCode?.let { getString(R.string.toast_gagal_hapus, it) } ?: getString(R.string.error_jaringan)

    private fun toast(pesan: String) = Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()

    private companion object {
        const val POST_LIMIT = 20
        const val NO_INDEX = -1
    }
}
