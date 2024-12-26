package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationVResponse(
    @SerialName("black-white") val blackWhite: com.bbrustol.core.data.response.pokemon_info.BlackWhiteResponse
)