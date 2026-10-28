package com.example.daftarpostingan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daftarpostingan.data.Post
import com.example.daftarpostingan.databinding.ItemPostBinding

class PostAdapter(
    private val daftar: MutableList<Post>,
    private val onKlik: (Post) -> Unit,
    private val onHapus: (Int) -> Unit
) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = daftar[position]

        with(holder.binding) {
            tvJudul.text = post.title
            tvIsi.text = post.body
            tvInfo.text = root.context.getString(R.string.post_info, post.id, post.userId)

            root.setOnClickListener { onKlik(post) }
            root.setOnLongClickListener {
                val posisi = holder.bindingAdapterPosition
                if (posisi != RecyclerView.NO_POSITION) onHapus(posisi)
                true
            }
        }
    }

    override fun getItemCount(): Int = daftar.size

    // Data baru dari server mengganti seluruh isi daftar
    fun tampilkan(baru: List<Post>) {
        daftar.clear()
        daftar.addAll(baru)
        notifyDataSetChanged()
    }

    fun ambil(posisi: Int): Post = daftar[posisi]

    fun posisiDari(post: Post): Int = daftar.indexOf(post)

    fun hapusPada(posisi: Int) {
        daftar.removeAt(posisi)
        notifyItemRemoved(posisi)
    }
}
