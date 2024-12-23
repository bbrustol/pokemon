package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationViiResponse(
    @SerialName("icons") val icons: IconsResponse,
    @SerialName("ultra-sun-ultra-moon") val ultraSunUltraMoon: UltraSunUltraMoonResponse
)