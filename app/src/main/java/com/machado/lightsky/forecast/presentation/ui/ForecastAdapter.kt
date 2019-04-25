package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.model.ForecastItem
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem

private const val CURRENT_FORECAST_TYPE = 0
private const val HOURLY_FORECAST_TYPE = 1
private const val DAILY_FORECAST_TYPE = 2

class ForecastAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var currentForecast: ForecastItem? = null
    private val hourlyForecast: MutableList<ForecastItem> = mutableListOf()
    private val dailyForecast: MutableList<ForecastRangeItem> = mutableListOf()

    fun setForecast(forecast: Forecast) {
        currentForecast = forecast.currently
        hourlyForecast.clear()
        hourlyForecast.addAll(forecast.hourly)
        dailyForecast.clear()
        dailyForecast.addAll(forecast.daily)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int = when (position) {
        0 -> CURRENT_FORECAST_TYPE
        1 -> HOURLY_FORECAST_TYPE
        else -> DAILY_FORECAST_TYPE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when (viewType) {
        CURRENT_FORECAST_TYPE -> CurrentForecastViewHolder(parent)
        HOURLY_FORECAST_TYPE -> HourlyForecastRowViewHolder(parent)
        DAILY_FORECAST_TYPE -> DailyForecastViewHolder(parent)
        else -> throw IllegalStateException("Unknown view type!")
    }

    override fun getItemCount(): Int = dailyForecast.size + 2

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = when (holder) {
        is CurrentForecastViewHolder -> holder.bind(currentForecast)
        is HourlyForecastRowViewHolder -> holder.bind(hourlyForecast)
        is DailyForecastViewHolder -> holder.bind(dailyForecast[position - 2])
        else -> throw IllegalStateException("Unknown view holder!")
    }
}