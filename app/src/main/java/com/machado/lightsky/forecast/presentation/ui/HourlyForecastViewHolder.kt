package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastItem
import kotlinx.android.synthetic.main.item_hourly_forecast.view.*

class HourlyForecastViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_hourly_forecast) {
    fun bind(forecast: ForecastItem) {
        itemView.hourlyForecastTemperatureTextView.text = forecast.temperature.toString()
    }
}