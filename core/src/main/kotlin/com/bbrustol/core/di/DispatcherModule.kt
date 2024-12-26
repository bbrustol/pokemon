package com.bbrustol.core.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.core.qualifier.StringQualifier
import org.koin.dsl.module

interface Dispatch {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
    val default: CoroutineDispatcher
}

val dispatchers: Dispatch = object : Dispatch {
    override val main = Dispatchers.Main.immediate
    override val io = Dispatchers.IO
    override val unconfined = Dispatchers.Unconfined
    override val default: CoroutineDispatcher = Dispatchers.Default
}

val coroutinesDispatchersModule = module {
    single(qualifier = StringQualifier("DefaultDispatcher")) { Dispatchers.Default }
    single(qualifier = StringQualifier("IoDispatcher")) { Dispatchers.IO }
    single(qualifier = StringQualifier("MainDispatcher")) { Dispatchers.Main }
    single(qualifier = StringQualifier("MainImmediateDispatcher")) { Dispatchers.Main.immediate }
    single(qualifier = StringQualifier("Unconfined")) { Dispatchers.Unconfined }
}