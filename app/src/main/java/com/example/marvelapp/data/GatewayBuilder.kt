package com.example.marvelapp.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

object GatewayBuilder {
    private val contentType = "application/json".toMediaType()

    private val json = Json { ignoreUnknownKeys = true }

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
    }

    inline fun <reified T> build(): T =
        retrofit.create(T::class.java)
}