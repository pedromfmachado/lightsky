package com.machado.lightsky.forecast.data.datasource

import com.machado.lightsky.forecast.data.mapper.toModel
import com.machado.lightsky.forecast.data.service.ForecastService
import com.machado.lightsky.forecast.domain.model.Forecast
import io.reactivex.Single

class ForecastRemoteResource(private val forecastService: ForecastService) : ForecastRemoteDataSource {
    override fun getForecast(latitude: String, longitude: String): Single<Forecast> =
        forecastService.getForecast("13667e708b2ac17790876dda421045ef", latitude, longitude).map { it.toModel() }
}