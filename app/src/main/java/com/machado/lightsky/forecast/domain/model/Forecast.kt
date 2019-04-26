package com.machado.lightsky.forecast.domain.model

import java.util.*

data class Forecast(
        val currently: ForecastItem,
        val hourly: List<ForecastItem>,
        val daily: List<ForecastRangeItem>
)

data class ForecastItem(
        val time: Calendar,
        val temperature: Float,
        val summary: String,
        val iconRes: Int
)

data class ForecastRangeItem(
        val time: Calendar,
        val minTemperature: Float,
        val maxTemperature: Float,
        val iconRes: Int
)