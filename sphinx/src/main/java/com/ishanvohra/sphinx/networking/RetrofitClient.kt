package com.ishanvohra.sphinx.networking

import com.ishanvohra.sphinx.interfaces.Api
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    val instance: Api by lazy {

        val okHttpClient: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(NetworkInterceptor())
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(100, TimeUnit.SECONDS)
            .writeTimeout(100, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.openai.com/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(Api::class.java)
    }

}