package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MoveResponse(
    @SerialName("move") val move: com.bbrustol.core.data.response.pokemon_info.MoveResponseX,
    @SerialName("version_group_details") val versionGroupDetails: List<com.bbrustol.core.data.response.pokemon_info.VersionGroupDetailResponse>
)