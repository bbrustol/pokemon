package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViiiResponse(
    @SerialName("icons") val icons: com.bbrustol.core.data.response.pokemon_info.IconsResponse
)