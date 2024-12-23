package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViResponse(
    @SerialName("omegaruby-alphasapphire") val omegarubyAlphasapphire: OmegarubyAlphasapphireResponse,
    @SerialName("x-y") val xY: XYResponse
)