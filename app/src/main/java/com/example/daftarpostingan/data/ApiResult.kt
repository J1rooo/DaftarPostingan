package com.example.daftarpostingan.data

sealed interface ApiResult<out T> {
    data class Success<T>(val data: T) : ApiResult<T>

    /** [httpCode] terisi jika server menjawab dengan error; null jika tidak ada jawaban (jaringan). */
    data class Error(val httpCode: Int?) : ApiResult<Nothing>
}
