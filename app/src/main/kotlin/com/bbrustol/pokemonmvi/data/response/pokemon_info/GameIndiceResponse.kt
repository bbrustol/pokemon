package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameIndiceResponse(
    @SerialName("game_index") val gameIndex: Int,
    @SerialName("version") val version: VersionResponse
)