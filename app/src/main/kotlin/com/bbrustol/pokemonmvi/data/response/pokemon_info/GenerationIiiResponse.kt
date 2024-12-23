package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIiiResponse(
    @SerialName("emerald") val emerald: EmeraldResponse,
    @SerialName("firered-leafgreen") val fireredLeafgreen: FireredLeafgreenResponse,
    @SerialName("ruby-sapphire") val rubySapphire: RubySapphireResponse
)