package com.machado.lightsky.forecast.presentation.presenter

import com.machado.lightsky.core.ext.toSingle
import com.machado.lightsky.core.providers.TestReactiveSchedulerProvider
import com.machado.lightsky.forecast.domain.model.aForecast
import com.machado.lightsky.forecast.domain.usecase.GetForecastUseCase
import com.nhaarman.mockitokotlin2.*
import io.reactivex.Single
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString

class ForecastPresenterTest {

    private val mockedView: ForecastPresenter.View = mock()
    private val mockedUseCase: GetForecastUseCase = mock()
    private val presenter = ForecastPresenter(mockedView, mockedUseCase, TestReactiveSchedulerProvider())

    @Test
    fun `whenever the data is successfully requested it should be set on the view`() {
        val testForecast = aForecast()
        whenever(mockedUseCase.invoke(any(), any())).thenReturn(testForecast.toSingle())
        presenter.onCreate()
        verify(mockedView).showForecast(testForecast)
    }

    @Test
    fun `whenever there's an error fetching data should show it on the view`() {
        val testError = Exception("ups!")
        mockedUseCase.stub { on { invoke(anyString(), anyString()) } doReturn Single.error(testError) }
        presenter.onCreate()
        verify(mockedView).showError(testError)
    }
}