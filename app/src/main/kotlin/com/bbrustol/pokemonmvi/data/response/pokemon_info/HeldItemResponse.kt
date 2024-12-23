package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeldItemResponse(
    @SerialName("item") val item: ItemResponse,
    @SerialName("version_details") val versionDetails: List<VersionDetailResponse>
)