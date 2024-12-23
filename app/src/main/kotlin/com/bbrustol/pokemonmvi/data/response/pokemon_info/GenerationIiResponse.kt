package com.bbrustol.pokemonmvi.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIiResponse(
    @SerialName("crystal") val crystal: CrystalResponse,
    @SerialName("gold") val gold: GoldResponse,
    @SerialName("silver") val silver: SilverResponse
)