package com.bbrustol.core.data.response.pokemon_info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VersionGroupDetailResponse(
    @SerialName("level_learned_at") val levelLearnedAt: Int,
    @SerialName("move_learn_method") val moveLearnMethod: com.bbrustol.core.data.response.pokemon_info.MoveLearnMethodResponse,
    @SerialName("version_group") val versionGroup: com.bbrustol.core.data.response.pokemon_info.VersionGroupResponse
)