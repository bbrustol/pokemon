package com.bbrustol.pokemonmvi

import android.app.Application
import com.bbrustol.core.di.coroutinesDispatchersModule
import org.koin.core.context.startKoin
import com.bbrustol.core.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@Application)
            modules(networkModule, coroutinesDispatchersModule)
        }
    }
}