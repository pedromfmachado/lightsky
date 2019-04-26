package com.machado.lightsky.forecast.data.model

import com.serjltt.moshi.adapters.FallbackEnum
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@FallbackEnum(name = "clear-day")
enum class IconType {
    @Json(name = "clear-day")
    ICON_CLEAR_DAY,
    @Json(name = "clear-night")
    ICON_CLEAR_NIGHT,
    @Json(name = "rain")
    ICON_RAIN,
    @Json(name = "snow")
    ICON_SNOW,
    @Json(name = "sleet")
    ICON_SLEET,
    @Json(name = "wind")
    ICON_WIND,
    @Json(name = "fog")
    ICON_FOG,
    @Json(name = "cloudy")
    ICON_CLOUDY,
    @Json(name = "partly-cloudy-day")
    ICON_PARTLY_CLOUDY_DAY,
    @Json(name = "partly-cloudy-night")
    ICON_PARTLY_CLOUDY_NIGHT,
}

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
        @Json(name = "temperature") val temperature: Float,
        @Json(name = "summary") val summary: String,
        @Json(name = "icon") val icon: IconType
)

@JsonClass(generateAdapter = true)
data class ForecastRangeItemResponse(
        @Json(name = "time") val time: Long,
        @Json(name = "temperatureMin") val minTemperature: Float,
        @Json(name = "temperatureMax") val maxTemperature: Float,
        @Json(name = "icon") val icon: IconType
)
