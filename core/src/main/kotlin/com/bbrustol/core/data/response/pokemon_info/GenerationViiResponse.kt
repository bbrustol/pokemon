package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViiResponse(
    @SerialName("icons") val icons: com.bbrustol.core.data.response.pokemon_info.IconsResponse,
    @SerialName("ultra-sun-ultra-moon") val ultraSunUltraMoon: com.bbrustol.core.data.response.pokemon_info.UltraSunUltraMoonResponse
)