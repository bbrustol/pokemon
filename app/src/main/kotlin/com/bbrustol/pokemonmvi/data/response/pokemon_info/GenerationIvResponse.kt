package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIvResponse(
    @SerialName("diamond-pearl") val diamondPearl: DiamondPearlResponse,
    @SerialName("heartgold-soulsilver") val heartgoldSoulsilver: HeartgoldSoulsilverResponse,
    @SerialName("platinum") val platinum: PlatinumResponse
)