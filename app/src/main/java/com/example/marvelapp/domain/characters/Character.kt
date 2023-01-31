package com.example.marvelapp.domain.characters

import com.example.marvelapp.data.characters.Image

data class Character (
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val image: Image? = null
)


