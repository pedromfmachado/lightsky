package com.machado.lightsky.forecast.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForecastResponse(
    @Json(name = "timezone") val timezone: String,
    @Json(name = "currently") val currentForecast: ForecastItemResponse,
    @Json(name = "hourly") val hourlyForecast: HourlyForecastResponse?,
    @Json(name = "daily") val dailyForecast: DailyForecastResponse?
)

@JsonClass(generateAdapter = true)
data class HourlyForecastResponse(
    @Json(name = "data") val data: List<ForecastItemResponse>
)

@JsonClass(generateAdapter = true)
data class DailyForecastResponse(
    @Json(name = "data") val data: List<ForecastRangeItemResponse>
)

@JsonClass(generateAdapter = true)
data class ForecastItemResponse(
    @Json(name = "time") val time: Long,
    @Json(name = "temperature") val temperature: Float
)

@JsonClass(generateAdapter = true)
data class ForecastRangeItemResponse(
    @Json(name = "time") val time: Long,
    @Json(name = "temperatureMin") val minTemperature: Float,
    @Json(name = "temperatureMax") val maxTemperature: Float
)
