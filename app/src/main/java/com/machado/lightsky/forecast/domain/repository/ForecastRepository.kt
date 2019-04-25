package com.machado.lightsky.forecast.domain.repository

import com.machado.lightsky.forecast.domain.model.Forecast
import io.reactivex.Single

interface ForecastRepository {
    fun getForecast(latitude: String, longitude: String): Single<Forecast>
}