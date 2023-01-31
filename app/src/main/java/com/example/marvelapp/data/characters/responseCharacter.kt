package com.example.marvelapp.data.characters

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponseForCharacters(
    val results: List<CharacterResponse>
)

@Serializable
data class CharacterResponse (
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val image: Image? = null
)

@Serializable
data class Image (
    val path: String? = null,
    val extension: String? = null
)