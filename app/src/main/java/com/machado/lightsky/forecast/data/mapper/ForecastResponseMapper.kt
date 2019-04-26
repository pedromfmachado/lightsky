package com.machado.lightsky.forecast.data.mapper

import com.machado.lightsky.R
import com.machado.lightsky.forecast.data.model.ForecastItemResponse
import com.machado.lightsky.forecast.data.model.ForecastRangeItemResponse
import com.machado.lightsky.forecast.data.model.ForecastResponse
import com.machado.lightsky.forecast.data.model.IconType
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.model.ForecastItem
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem
import java.util.*

internal fun ForecastResponse.toModel(): Forecast {
    val timezone = TimeZone.getTimeZone(timezone)
    return Forecast(
            currently = currentForecast.toModel(timezone),
            hourly = hourlyForecast?.data?.map { it.toModel(timezone) } ?: emptyList(),
            daily = dailyForecast?.data?.map { it.toModel(timezone) } ?: emptyList()
    )
}

internal fun ForecastItemResponse.toModel(timezone: TimeZone) = ForecastItem(
        time = time.toCalendar(timezone),
        temperature = temperature,
        summary = summary,
        iconRes = icon.toRes()
)

internal fun ForecastRangeItemResponse.toModel(timezone: TimeZone) = ForecastRangeItem(
        time = time.toCalendar(timezone),
        minTemperature = minTemperature,
        maxTemperature = maxTemperature,
        iconRes = icon.toRes()
)

private fun Long.toCalendar(timezone: TimeZone) =
        Calendar.getInstance(timezone).apply { timeInMillis = this@toCalendar * 1000 }

private fun IconType.toRes(): Int = when (this) {
    IconType.ICON_CLEAR_DAY -> R.raw.weather_sunny
    IconType.ICON_CLEAR_NIGHT -> R.raw.weather_night
    IconType.ICON_RAIN -> R.raw.weather_storm
    IconType.ICON_SNOW -> R.raw.weather_snow
    IconType.ICON_SLEET -> R.raw.weather_storm
    IconType.ICON_WIND -> R.raw.weather_windy
    IconType.ICON_FOG -> R.raw.weather_foggy
    IconType.ICON_CLOUDY -> R.raw.weather_partly_cloudy
    IconType.ICON_PARTLY_CLOUDY_DAY -> R.raw.weather_partly_cloudy
    IconType.ICON_PARTLY_CLOUDY_NIGHT -> R.raw.weather_cloudynight
}
