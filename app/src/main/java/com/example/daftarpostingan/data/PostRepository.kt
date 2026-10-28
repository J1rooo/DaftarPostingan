package com.example.daftarpostingan.data

import com.example.daftarpostingan.network.ApiService
import com.example.daftarpostingan.network.RestClient
import retrofit2.HttpException
import java.io.IOException

class PostRepository(private val api: ApiService = RestClient.api) {

    suspend fun getPosts(limit: Int): ApiResult<List<Post>> =
        safeCall { api.getPosts(limit) }

    suspend fun hapusPost(id: Int): ApiResult<Unit> =
        safeCall {
            val respons = api.hapusPost(id)
            if (!respons.isSuccessful) throw HttpException(respons)
            Unit
        }

    /** HttpException: server menjawab error. IOException: tidak ada jawaban sama sekali. */
    private suspend fun <T> safeCall(block: suspend () -> T): ApiResult<T> =
        try {
            ApiResult.Success(block())
        } catch (e: HttpException) {
            ApiResult.Error(e.code())
        } catch (e: IOException) {
            ApiResult.Error(null)
        }
}
