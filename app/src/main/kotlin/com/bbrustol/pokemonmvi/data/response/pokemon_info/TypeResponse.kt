package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TypeResponse(
    @SerialName("slot") val slot: Int,
    @SerialName("type") val type: TypeResponseX
)