package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CriesResponse(
    @SerialName("latest") val latest: String,
    @SerialName("legacy") val legacy: String
)