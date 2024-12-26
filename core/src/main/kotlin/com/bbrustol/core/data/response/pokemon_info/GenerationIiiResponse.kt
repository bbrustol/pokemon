package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIiiResponse(
    @SerialName("emerald") val emerald: com.bbrustol.core.data.response.pokemon_info.EmeraldResponse,
    @SerialName("firered-leafgreen") val fireredLeafgreen: com.bbrustol.core.data.response.pokemon_info.FireredLeafgreenResponse,
    @SerialName("ruby-sapphire") val rubySapphire: com.bbrustol.core.data.response.pokemon_info.RubySapphireResponse
)