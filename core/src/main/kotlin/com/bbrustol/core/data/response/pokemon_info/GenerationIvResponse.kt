package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIvResponse(
    @SerialName("diamond-pearl") val diamondPearl: com.bbrustol.core.data.response.pokemon_info.DiamondPearlResponse,
    @SerialName("heartgold-soulsilver") val heartgoldSoulsilver: com.bbrustol.core.data.response.pokemon_info.HeartgoldSoulsilverResponse,
    @SerialName("platinum") val platinum: com.bbrustol.core.data.response.pokemon_info.PlatinumResponse
)