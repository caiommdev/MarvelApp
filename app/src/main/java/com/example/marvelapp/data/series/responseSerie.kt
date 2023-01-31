package com.example.marvelapp.data.series

import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
data class ApiResponseForSeries(
    val results: List<SerieResponse>
)

@Serializable
data class SerieResponse (
    val id: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val dates: Array<ComicData>? = null
)

@Serializable
data class ComicData(
    val type: String? = null,
    val date: Date? = null
)