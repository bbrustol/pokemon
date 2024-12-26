package com.bbrustol.core.data.repository

import com.bbrustol.core.data.response.PokemonInfoResponse
import com.bbrustol.core.data.response.PokemonListResponse
import com.bbrustol.core.data.service.PokemonService
import com.bbrustol.core.inftastructure.ApiResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class PokemonRepositoryImpl(
    private val pokemonService: PokemonService,
    private val ioDispatcher: CoroutineDispatcher
) {
    override suspend fun getPokemonList(page: Long): Flow<ApiResult<PokemonListResponse>> {
        return flow {
            emit(pokemonService.getPokemonList(page))
        }.flowOn(ioDispatcher)
    }

    override suspend fun getPokemonByName(name: String): Flow<ApiResult<PokemonInfoResponse>> {
        return flow {
            emit(pokemonService.getPokemonByName(name))
        }.flowOn(ioDispatcher)
    }
}
