package com.machado.lightsky.forecast.presentation.presenter

import com.machado.lightsky.core.ext.addTo
import com.machado.lightsky.core.ext.subscribeBy
import com.machado.lightsky.core.providers.ReactiveSchedulerProvider
import com.machado.lightsky.forecast.domain.model.Forecast
import com.machado.lightsky.forecast.domain.usecase.GetForecastUseCase
import io.reactivex.disposables.CompositeDisposable

class ForecastPresenter(
        private val view: View,
        private val getForecast: GetForecastUseCase,
        private val reactiveSchedulerProvider: ReactiveSchedulerProvider
) {

    private val compositeDisposable = CompositeDisposable()

    fun onCreate() {
        getForecast("41.1903868", "-8.5775381")
                .subscribeOn(reactiveSchedulerProvider.io)
                .observeOn(reactiveSchedulerProvider.main)
                .subscribeBy(onSuccess = view::showForecast, onError = view::showError)
                .addTo(compositeDisposable)
    }

    fun onDestroy() {
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }

    interface View {
        fun showForecast(forecast: Forecast)
        fun showError(error: Throwable)
    }
}