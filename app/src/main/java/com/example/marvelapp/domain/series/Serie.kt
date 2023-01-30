package com.example.marvelapp.domain.series

data class Serie (
    val id: Int? = null,
    val title: String? = null,
    val collections: Array<ComicSummary>? = null,
    val description: String? = null,
    val dates: Array<ComicData>? = null
)