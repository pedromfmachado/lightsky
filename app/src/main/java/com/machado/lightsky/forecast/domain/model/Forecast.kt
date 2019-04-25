package com.machado.lightsky.forecast.domain.model

data class Forecast(
    val currently: ForecastItem,
    val hourly: List<ForecastItem>,
    val daily: List<ForecastRangeItem>
)

data class ForecastItem(
    val time: Long,
    val temperature: Float
)

data class ForecastRangeItem(
    val time: Long,
    val minTemperature: Float,
    val maxTemperature: Float
)