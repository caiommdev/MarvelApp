package com.example.marvelapp.ui.characters

import java.io.Serializable

data class Character (
    val id: String? = null,
    val title: String? = null,
    val description: String? = null
): Serializable