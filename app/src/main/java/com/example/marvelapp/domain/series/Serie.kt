package com.example.marvelapp.domain.series

import com.example.marvelapp.data.series.ComicData

data class Serie (
    val id: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val dates: Array<ComicData>? = null
)