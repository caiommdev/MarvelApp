package com.example.marvelapp.data.series

import com.example.marvelapp.data.GatewayBuilder
import com.example.marvelapp.domain.series.Serie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SerieService {
    private val gateway by lazy {
        GatewayBuilder.build<SerieGateway>()
    }

    suspend fun getAllSeries(): List<Serie> =
        withContext(Dispatchers.IO){
            gateway
                .getAllSeries()
                .results
                .map { SerieMapper.toDomain(it) }
        }

    suspend fun getSerie(id: Int): Serie =
        gateway
            .getSerie(id)
            .let { SerieMapper.toDomain(it) }
}