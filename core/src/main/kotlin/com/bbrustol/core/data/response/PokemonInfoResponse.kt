package com.bbrustol.core.data.response

import com.bbrustol.core.data.response.pokemon_info.AbilityResponse
import com.bbrustol.core.data.response.pokemon_info.CriesResponse
import com.bbrustol.core.data.response.pokemon_info.FormResponse
import com.bbrustol.core.data.response.pokemon_info.GameIndiceResponse
import com.bbrustol.core.data.response.pokemon_info.HeldItemResponse
import com.bbrustol.core.data.response.pokemon_info.MoveResponse
import com.bbrustol.core.data.response.pokemon_info.SpeciesResponse
import com.bbrustol.core.data.response.pokemon_info.SpritesResponse
import com.bbrustol.core.data.response.pokemon_info.StatResponse
import com.bbrustol.core.data.response.pokemon_info.TypeResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonInfoResponse(
    @SerialName("abilities") val abilities: List<com.bbrustol.core.data.response.pokemon_info.AbilityResponse>,
    @SerialName("base_experience") val baseExperience: Int,
    @SerialName("cries") val cries: com.bbrustol.core.data.response.pokemon_info.CriesResponse,
    @SerialName("forms") val forms: List<com.bbrustol.core.data.response.pokemon_info.FormResponse>,
    @SerialName("game_indices") val gameIndices: List<com.bbrustol.core.data.response.pokemon_info.GameIndiceResponse>,
    @SerialName("height") val height: Int,
    @SerialName("held_items") val heldItems: List<com.bbrustol.core.data.response.pokemon_info.HeldItemResponse>,
    @SerialName("id") val id: Int,
    @SerialName("is_default") val isDefault: Boolean,
    @SerialName("location_area_encounters") val locationAreaEncounters: String,
    @SerialName("moves") val moves: List<com.bbrustol.core.data.response.pokemon_info.MoveResponse>,
    @SerialName("name") val name: String,
    @SerialName("order") val order: Int,
    @SerialName("past_abilities") val pastAbilities: List<com.bbrustol.core.data.response.pokemon_info.AbilityResponse>,
    @SerialName("past_types") val pastTypes: List<com.bbrustol.core.data.response.pokemon_info.TypeResponse>,
    @SerialName("species") val species: com.bbrustol.core.data.response.pokemon_info.SpeciesResponse,
    @SerialName("sprites") val sprites: com.bbrustol.core.data.response.pokemon_info.SpritesResponse,
    @SerialName("stats") val stats: List<com.bbrustol.core.data.response.pokemon_info.StatResponse>,
    @SerialName("types") val types: List<com.bbrustol.core.data.response.pokemon_info.TypeResponse>,
    @SerialName("weight") val weight: Int
)