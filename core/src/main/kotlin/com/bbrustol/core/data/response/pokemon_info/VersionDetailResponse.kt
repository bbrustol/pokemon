package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionDetailResponse(
    @SerialName("rarity") val rarity: Int,
    @SerialName("version") val version: com.bbrustol.core.data.response.pokemon_info.VersionResponse
)