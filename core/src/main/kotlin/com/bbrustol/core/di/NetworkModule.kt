package com.bbrustol.core.di

import com.bbrustol.core.BuildConfig
import com.bbrustol.core.data.service.PokemonService
import com.bbrustol.core.inftastructure.DefaultNetworkChecker
import com.bbrustol.core.inftastructure.NetworkChecker
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val networkModule = module {
    single { androidContext() }
    single<NetworkChecker> { DefaultNetworkChecker(get()) }
    single { provideHttpClient() }
    single { PokemonService(get(), get()) }
}

private fun provideHttpClient(): HttpClient =
    HttpClient(CIO) {

        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true
            })
        }

        install(Logging) {
            level = if (BuildConfig.DEBUG) LogLevel.ALL else LogLevel.INFO
            logger = if (BuildConfig.DEBUG) Logger.DEFAULT else Logger.EMPTY
        }

        engine {
            requestTimeout = 15_000
            endpoint {
                connectTimeout = 15_000
                connectAttempts = 5
            }
        }
    }
