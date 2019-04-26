package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.core.view.isVisible
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastItem
import kotlinx.android.synthetic.main.item_current_forecast.view.*

class CurrentForecastViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_current_forecast) {

    fun bind(forecast: ForecastItem?) {
        with(itemView) {
            forecast?.let {
                currentForecastStateAnimationView.setAnimation(it.iconRes)
                currentForecastTemperatureTextView.text = context.getString(R.string.temperature, it.temperature)
                currentForecastSummaryTextView.text = it.summary
                currentForecastStateAnimationView.isVisible = true
                currentForecastTemperatureTextView.isVisible = true
                currentForecastSummaryTextView.isVisible = true
                currentForecastProgressBar.isVisible = false
            } ?: run {
                currentForecastStateAnimationView.isVisible = false
                currentForecastTemperatureTextView.isVisible = false
                currentForecastSummaryTextView.isVisible = false
                currentForecastProgressBar.isVisible = true
            }
        }
    }
}