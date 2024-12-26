package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViResponse(
    @SerialName("omegaruby-alphasapphire") val omegarubyAlphasapphire: com.bbrustol.core.data.response.pokemon_info.OmegarubyAlphasapphireResponse,
    @SerialName("x-y") val xY: com.bbrustol.core.data.response.pokemon_info.XYResponse
)