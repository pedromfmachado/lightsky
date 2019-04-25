package com.machado.lightsky.core

import android.app.Application
import com.machado.lightsky.core.injection.NetworkModule
import com.machado.lightsky.core.injection.ReactiveModule
import com.machado.lightsky.forecast.injection.ForecastModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class LightSkyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LightSkyApplication)
            modules(
                ReactiveModule,
                NetworkModule,
                ForecastModule
            )
        }
    }
}