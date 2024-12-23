package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MoveResponse(
    @SerialName("move") val move: MoveResponseX,
    @SerialName("version_group_details") val versionGroupDetails: List<VersionGroupDetailResponse>
)