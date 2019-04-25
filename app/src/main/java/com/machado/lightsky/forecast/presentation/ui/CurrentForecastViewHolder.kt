package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.core.view.isVisible
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastItem
import kotlinx.android.synthetic.main.item_current_forecast.view.*

class CurrentForecastViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_current_forecast) {

    fun bind(forecast: ForecastItem?) {
        forecast?.let {
            itemView.currentForecastTemperatureTextView.text = it.temperature.toString()
            itemView.currentForecastTemperatureTextView.isVisible = true
            itemView.currentForecastProgressBar.isVisible = false
        } ?: run {
            itemView.currentForecastTemperatureTextView.isVisible = false
            itemView.currentForecastProgressBar.isVisible = true
        }
    }
}