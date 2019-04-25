package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.machado.lightsky.forecast.domain.model.ForecastItem

class HourlyForecastAdapter(
        private val hourlyForecast: List<ForecastItem>
) : RecyclerView.Adapter<HourlyForecastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HourlyForecastViewHolder(parent)

    override fun getItemCount(): Int = hourlyForecast.size

    override fun onBindViewHolder(holder: HourlyForecastViewHolder, position: Int) {
        holder.bind(hourlyForecast[position])
    }
}