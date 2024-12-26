package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeldItemResponse(
    @SerialName("item") val item: com.bbrustol.core.data.response.pokemon_info.ItemResponse,
    @SerialName("version_details") val versionDetails: List<com.bbrustol.core.data.response.pokemon_info.VersionDetailResponse>
)