package com.machado.lightsky.forecast.presentation.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.machado.lightsky.R
import com.machado.lightsky.core.presentation.ui.BaseViewHolder
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem
import kotlinx.android.synthetic.main.item_daily_forecast.view.*
import java.text.DateFormatSymbols
import java.util.*

class DailyForecastViewHolder(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_daily_forecast) {
    fun bind(forecast: ForecastRangeItem) {
        with(itemView) {

            itemView.dailyForecastWeekDayTextView.text =
                    DateFormatSymbols().weekdays[forecast.time.get(Calendar.DAY_OF_WEEK)]
            itemView.dailyForecastStateAnimationView.setAnimation(forecast.iconRes)
            itemView.dailyForecastMaxTemperatureTextView.text =
                    context.getString(R.string.temperature, forecast.maxTemperature)
            itemView.dailyForecastMinTemperatureTextView.text =
                    context.getString(R.string.temperature, forecast.minTemperature)
        }
    }
}