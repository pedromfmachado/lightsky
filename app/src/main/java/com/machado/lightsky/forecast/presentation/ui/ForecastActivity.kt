package com.machado.lightsky.forecast.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.machado.lightsky.R
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.model.ForecastItem
import com.machado.lightsky.forecast.domain.model.ForecastRangeItem
import com.machado.lightsky.forecast.presentation.presenter.ForecastPresenter
import kotlinx.android.synthetic.main.activity_forecast.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf
import timber.log.Timber

class ForecastActivity : AppCompatActivity(), ForecastPresenter.View {

    private val presenter by inject<ForecastPresenter> { parametersOf(this) }
    private val adapter = ForecastAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        forecastRecyclerView.adapter = adapter
        forecastRecyclerView.layoutManager = LinearLayoutManager(this)

        presenter.onCreate()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showForecast(forecast: Forecast) {
        adapter.setForecast(forecast)
    }

    override fun showError(error: Throwable) {
        Timber.e(error)
    }
}