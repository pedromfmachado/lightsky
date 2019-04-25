package com.machado.lightsky.forecast.domain.model

fun aForecast(
        currently: ForecastItem = aForecastItem(),
        hourly: List<ForecastItem> = emptyList(),
        daily: List<ForecastRangeItem> = emptyList()
) = Forecast(
        currently = currently,
        hourly = hourly,
        daily = daily
)

fun aForecastItem(
        time: Long = 0,
        temperature: Float = 0f
) = ForecastItem(
        time = time,
        temperature = temperature
)