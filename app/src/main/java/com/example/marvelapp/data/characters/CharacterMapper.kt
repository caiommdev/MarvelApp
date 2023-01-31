package com.example.marvelapp.data.characters

import com.example.marvelapp.domain.characters.Character

object CharacterMapper {

    fun toDomain(response: CharacterResponse) =
        with(response){
            Character(
                id = id,
                name = name,
                description = description,
                image = image
            )
        }

}
