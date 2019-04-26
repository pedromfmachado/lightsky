package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastItem
import kotlinx.android.synthetic.main.item_hourly_forecast_row.view.*

class HourlyForecastRowViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_hourly_forecast_row) {
    fun bind(forecast: List<ForecastItem>, viewPool: RecyclerView.RecycledViewPool) {
        with(itemView.hourlyForecastRecyclerView) {
            setRecycledViewPool(viewPool)
            layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = HourlyForecastAdapter(forecast)
        }
    }
}