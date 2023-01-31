package com.example.marvelapp.data.series

import com.example.marvelapp.domain.series.Serie

object SerieMapper {
    fun toDomain(response: SerieResponse) =
        with(response) {
            Serie(
                id = id,
                title = title,
                description = description,
                dates = dates
            )
        }
}