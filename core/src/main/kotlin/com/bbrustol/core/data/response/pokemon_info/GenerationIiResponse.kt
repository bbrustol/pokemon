package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIiResponse(
    @SerialName("crystal") val crystal: com.bbrustol.core.data.response.pokemon_info.CrystalResponse,
    @SerialName("gold") val gold: com.bbrustol.core.data.response.pokemon_info.GoldResponse,
    @SerialName("silver") val silver: com.bbrustol.core.data.response.pokemon_info.SilverResponse
)