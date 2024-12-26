package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OtherResponse(
    @SerialName("dream_world") val dreamWorld: com.bbrustol.core.data.response.pokemon_info.DreamWorldResponse,
    @SerialName("home") val home: com.bbrustol.core.data.response.pokemon_info.HomeResponse,
    @SerialName("official-artwork") val officialArtwork: com.bbrustol.core.data.response.pokemon_info.OfficialArtworkResponse,
    @SerialName("showdown") val showdown: com.bbrustol.core.data.response.pokemon_info.ShowdownResponse
)