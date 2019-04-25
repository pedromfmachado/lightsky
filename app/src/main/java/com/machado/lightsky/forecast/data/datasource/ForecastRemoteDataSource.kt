package com.machado.lightsky.forecast.data.datasource

import com.machado.lightsky.forecast.domain.model.Forecast
import io.reactivex.Single

interface ForecastRemoteDataSource {
    fun getForecast(latitude: String, longitude: String): Single<Forecast>
}