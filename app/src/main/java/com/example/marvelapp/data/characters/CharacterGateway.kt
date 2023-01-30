package com.example.marvelapp.data.characters

import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterGateway {

    @GET("characters")
    suspend fun getAllCharacters(): ApiResponseForCharacters

    @GET("characters/{id}")
    suspend fun getCharacter(@Path("id") id: Int): CharacterResponse
}