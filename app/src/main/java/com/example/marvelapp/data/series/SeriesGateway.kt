package com.example.marvelapp.data.series

import retrofit2.http.GET
import retrofit2.http.Path

interface SeriesGateway {

    @GET("characters")
    suspend fun getAllSeries(): ApiResponseForSeries

    @GET("characters/{id}")
    suspend fun getSerie(@Path("id") id: Int): SerieResponse
}