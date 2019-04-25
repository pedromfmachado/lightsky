package com.machado.lightsky.forecast.data.mapper

import com.machado.lightsky.forecast.data.model.ForecastItemResponse
import com.machado.lightsky.forecast.data.model.ForecastRangeItemResponse
import com.machado.lightsky.forecast.data.model.ForecastResponse
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.model.ForecastItem
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem

fun ForecastResponse.toModel() = Forecast(
    currently = currentForecast.toModel(),
    hourly = hourlyForecast?.data?.map(ForecastItemResponse::toModel) ?: emptyList(),
    daily = dailyForecast?.data?.map(ForecastRangeItemResponse::toModel) ?: emptyList()
)

fun ForecastItemResponse.toModel() = ForecastItem(
    time = time,
    temperature = temperature
)

fun ForecastRangeItemResponse.toModel() = ForecastRangeItem(
    time = time,
    minTemperature = minTemperature,
    maxTemperature = maxTemperature
)
