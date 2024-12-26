package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmeraldResponse(
    @SerialName("front_default") val frontDefault: String,
    @SerialName("front_shiny") val frontShiny: String
)