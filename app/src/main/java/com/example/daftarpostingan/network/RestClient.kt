package com.example.daftarpostingan.network

import com.example.daftarpostingan.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RestClient {

    // baseUrl wajib diakhiri '/'
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private const val TIMEOUT_SECONDS = 15L

    // true  = isi postingan berita lokal (NewsData), tanpa internet
    // false = ambil dari server sungguhan di BASE_URL (JSONPlaceholder berisi teks acak)
    private const val USE_LOCAL_NEWS = true

    private val logging = HttpLoggingInterceptor().apply {
        // Log request/response (tag OkHttp) hanya pada build debug
        level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
    }

    private val okHttp = OkHttpClient.Builder()
        .addInterceptor(logging)
        .apply { if (USE_LOCAL_NEWS) addInterceptor(LocalNewsInterceptor()) }
        .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .build()

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttp)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
