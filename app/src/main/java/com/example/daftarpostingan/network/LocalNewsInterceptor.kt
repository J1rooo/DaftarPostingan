package com.example.daftarpostingan.network

import com.example.daftarpostingan.data.NewsData
import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

/**
 * Menjawab request GET /posts dan DELETE /posts/{id} memakai data berita lokal ([NewsData]),
 * sehingga alur Retrofit + RestClient tetap dipakai persis seperti memanggil server sungguhan.
 * Request lain diteruskan ke jaringan seperti biasa.
 */
class LocalNewsInterceptor : Interceptor {

    private val gson = Gson()

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val path = request.url.encodedPath

        return when {
            request.method == "GET" && path == "/posts" -> {
                val limit = request.url.queryParameter("_limit")?.toIntOrNull() ?: NewsData.posts.size
                respond(request, gson.toJson(NewsData.posts.take(limit)))
            }
            request.method == "DELETE" && path.startsWith("/posts/") -> respond(request, "{}")
            else -> chain.proceed(request)
        }
    }

    private fun respond(request: Request, json: String): Response {
        Thread.sleep(LATENCY_MS) // meniru waktu tunggu jaringan agar status "Memuat..." terlihat
        return Response.Builder()
            .request(request)
            .protocol(Protocol.HTTP_1_1)
            .code(200)
            .message("OK")
            .body(json.toResponseBody("application/json".toMediaType()))
            .build()
    }

    private companion object {
        const val LATENCY_MS = 500L
    }
}
