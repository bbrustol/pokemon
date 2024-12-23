package com.bbrustol.pokemonmvi.data.response

import com.bbrustol.pokemonmvi.data.response.pokemon_info.AbilityResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.CriesResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.FormResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.GameIndiceResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.HeldItemResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.MoveResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.SpeciesResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.SpritesResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.StatResponse
import com.bbrustol.pokemonmvi.data.response.pokemon_info.TypeResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonInfoResponse(
    @SerialName("abilities") val abilities: List<AbilityResponse>,
    @SerialName("base_experience") val baseExperience: Int,
    @SerialName("cries") val cries: CriesResponse,
    @SerialName("forms") val forms: List<FormResponse>,
    @SerialName("game_indices") val gameIndices: List<GameIndiceResponse>,
    @SerialName("height") val height: Int,
    @SerialName("held_items") val heldItems: List<HeldItemResponse>,
    @SerialName("id") val id: Int,
    @SerialName("is_default") val isDefault: Boolean,
    @SerialName("location_area_encounters") val locationAreaEncounters: String,
    @SerialName("moves") val moves: List<MoveResponse>,
    @SerialName("name") val name: String,
    @SerialName("order") val order: Int,
    @SerialName("past_abilities") val pastAbilities: List<AbilityResponse>,
    @SerialName("past_types") val pastTypes: List<TypeResponse>,
    @SerialName("species") val species: SpeciesResponse,
    @SerialName("sprites") val sprites: SpritesResponse,
    @SerialName("stats") val stats: List<StatResponse>,
    @SerialName("types") val types: List<TypeResponse>,
    @SerialName("weight") val weight: Int
)