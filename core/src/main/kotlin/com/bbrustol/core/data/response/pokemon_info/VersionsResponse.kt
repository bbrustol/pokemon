package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionsResponse(
    @SerialName("generation-i") val generationI: com.bbrustol.core.data.response.pokemon_info.GenerationIResponse,
    @SerialName("generation-ii") val generationIi: com.bbrustol.core.data.response.pokemon_info.GenerationIiResponse,
    @SerialName("generation-iii") val generationIii: com.bbrustol.core.data.response.pokemon_info.GenerationIiiResponse,
    @SerialName("generation-iv") val generationIv: com.bbrustol.core.data.response.pokemon_info.GenerationIvResponse,
    @SerialName("generation-v") val generationV: com.bbrustol.core.data.response.pokemon_info.GenerationVResponse,
    @SerialName("generation-vi") val generationVi: com.bbrustol.core.data.response.pokemon_info.GenerationViResponse,
    @SerialName("generation-vii") val generationVii: com.bbrustol.core.data.response.pokemon_info.GenerationViiResponse,
    @SerialName("generation-viii") val generationViii: com.bbrustol.core.data.response.pokemon_info.GenerationViiiResponse
)