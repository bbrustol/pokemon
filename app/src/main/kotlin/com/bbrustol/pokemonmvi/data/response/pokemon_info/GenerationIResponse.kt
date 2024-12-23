package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIResponse(
    @SerialName("red-blue") val redBlue: RedBlueResponse,
    @SerialName("yellow") val yellow: YellowResponse
)