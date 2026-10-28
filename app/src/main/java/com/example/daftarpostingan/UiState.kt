package com.example.daftarpostingan

import com.example.daftarpostingan.data.Post

sealed interface UiState {
    object Loading : UiState
    data class Success(val posts: List<Post>) : UiState
    data class Error(val pesan: String) : UiState
}
