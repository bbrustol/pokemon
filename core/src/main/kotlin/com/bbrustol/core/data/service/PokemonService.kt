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

    suspend fun getList(
        page: Long,
    ): ApiResult<PokemonListResponse> {
        return handleApi(networkChecker) {
            httpClient.get(BuildConfig.BASE_URL) {
                url {
                    parameters.append("limit", PAGE_SIZE.toString())
                    parameters.append("offset", (page * PAGE_SIZE).toString())
                }
                contentType(ContentType.Application.Json)
            }
        }
    }

    suspend fun getPokemonByName(name: String): ApiResult<PokemonInfoResponse> {
        return handleApi(networkChecker) {
            httpClient.get(BuildConfig.BASE_URL + name) {
                contentType(ContentType.Application.Json)
            }
        }
    }

    companion object {
        private const val PAGE_SIZE = 20
    }

}
