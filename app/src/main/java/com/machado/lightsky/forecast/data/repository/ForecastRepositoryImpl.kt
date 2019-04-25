package com.machado.lightsky.forecast.data.repository

import com.machado.lightsky.forecast.data.datasource.ForecastRemoteDataSource
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.repository.ForecastRepository
import io.reactivex.Single

class ForecastRepositoryImpl(private val forecastRemoteDataSource: ForecastRemoteDataSource) : ForecastRepository {
    override fun getForecast(latitude: String, longitude: String): Single<Forecast> =
        forecastRemoteDataSource.getForecast(latitude, longitude)
}