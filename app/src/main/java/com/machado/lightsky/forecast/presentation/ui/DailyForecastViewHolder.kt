package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem
import kotlinx.android.synthetic.main.item_daily_forecast.view.*

class DailyForecastViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_daily_forecast) {
    fun bind(forecast: ForecastRangeItem) {
        itemView.dailyForecastTemperatureTextView.text = forecast.minTemperature.toString()
    }
}