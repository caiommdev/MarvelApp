package com.example.marvelapp.data.characters

import com.example.marvelapp.data.GatewayBuilder
import kotlinx.coroutines.withContext
import com.example.marvelapp.domain.characters.Character
import kotlinx.coroutines.Dispatchers

class CharacterService {
    private val gateway: CharacterGateway by lazy {
        GatewayBuilder.build<CharacterGateway>()
    }

    suspend fun getAllCharacters(): List<Character> =
        withContext(Dispatchers.IO) {
            gateway
                .getAllCharacters()
                .results
                .map { CharacterMapper.toDomain(it) }
        }



    suspend fun getCharacter(id: Int): Character =
        withContext(Dispatchers.IO) {
            gateway
                .getCharacter(id)
                .let { CharacterMapper.toDomain(it) }
        }
}