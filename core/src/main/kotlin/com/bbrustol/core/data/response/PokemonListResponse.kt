package com.bbrustol.core.data.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonListResponse(
    @SerialName("count") val count: Int,
    @SerialName("next") val next: String,
    @SerialName("previous") val previous: String,
    @SerialName("results") val results: List<com.bbrustol.core.data.response.ResultResponse>
)

@Serializable
data class ResultResponse(
    @SerialName("name") val name: String,
    @SerialName("url") val url: String
)