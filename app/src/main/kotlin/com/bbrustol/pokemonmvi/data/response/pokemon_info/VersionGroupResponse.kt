package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionGroupResponse(
    @SerialName("name") val name: String,
    @SerialName("url") val url: String
)