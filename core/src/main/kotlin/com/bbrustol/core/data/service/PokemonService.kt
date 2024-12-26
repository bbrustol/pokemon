package com.bbrustol.core.data.service

import com.bbrustol.core.BuildConfig
import com.bbrustol.core.data.response.PokemonInfoResponse
import com.bbrustol.core.data.response.PokemonListResponse
import com.bbrustol.core.inftastructure.ApiResult
import com.bbrustol.core.inftastructure.NetworkChecker
import com.bbrustol.core.inftastructure.handleApi
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType

class PokemonService(
    private val httpClient: HttpClient,
    private val networkChecker: NetworkChecker
) {
    suspend fun getPokemonList(page: Long): ApiResult<PokemonListResponse> =
        handleApi(networkChecker) {
            httpClient.get(BuildConfig.BASE_URL + POKEMON_ENDPOINT) {
                url {
                    parameters.append(PARAM_LIMIT, PAGE_SIZE.toString())
                    parameters.append(PARAM_OFFSET, (page * PAGE_SIZE).toString())
                }
                contentType(ContentType.Application.Json)
            }
        }

    suspend fun getPokemonByName(name: String): ApiResult<PokemonInfoResponse> =
        handleApi(networkChecker) {
            httpClient.get(BuildConfig.BASE_URL + "$POKEMON_ENDPOINT$name") {
                contentType(ContentType.Application.Json)
            }
        }

    companion object {
        private const val PARAM_LIMIT = "limit"
        private const val PARAM_OFFSET = "offset"
        private const val POKEMON_ENDPOINT = "pokemon/"
        private const val PAGE_SIZE = 20
    }

}
