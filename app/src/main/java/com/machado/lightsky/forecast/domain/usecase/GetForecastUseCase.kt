package com.machado.lightsky.forecast.domain.usecase

import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.repository.ForecastRepository
import io.reactivex.Single

class GetForecastUseCase(private val forecastRepository: ForecastRepository) {
    operator fun invoke(latitude: String, longitude: String): Single<Forecast> =
        forecastRepository.getForecast(latitude, longitude)
}