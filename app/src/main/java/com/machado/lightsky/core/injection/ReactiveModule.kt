package com.machado.lightsky.core.injection

import com.machado.lightsky.core.providers.ReactiveSchedulerProvider
import com.machado.lightsky.core.providers.ReactiveSchedulerProviderImpl
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy

val ReactiveModule = module {
    singleBy<ReactiveSchedulerProvider, ReactiveSchedulerProviderImpl>()
}