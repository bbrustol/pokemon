package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIResponse(
    @SerialName("red-blue") val redBlue: com.bbrustol.core.data.response.pokemon_info.RedBlueResponse,
    @SerialName("yellow") val yellow: com.bbrustol.core.data.response.pokemon_info.YellowResponse
)