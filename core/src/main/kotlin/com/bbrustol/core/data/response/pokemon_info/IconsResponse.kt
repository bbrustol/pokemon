package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IconsResponse(
    @SerialName("front_default") val frontDefault: String,
    @SerialName("front_female") val frontFemale: String?
)