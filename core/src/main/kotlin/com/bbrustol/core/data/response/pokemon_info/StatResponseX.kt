package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatResponseX(
    @SerialName("name") val name: String,
    @SerialName("url") val url: String
)