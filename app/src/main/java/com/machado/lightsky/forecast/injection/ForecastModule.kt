package com.machado.lightsky.forecast.injection

import com.machado.lightsky.forecast.data.datasource.ForecastRemoteDataSource
import com.machado.lightsky.forecast.data.datasource.ForecastRemoteResource
import com.machado.lightsky.forecast.data.repository.ForecastRepositoryImpl
import com.machado.lightsky.forecast.data.service.ForecastService
import com.machado.lightsky.forecast.domain.repository.ForecastRepository
import com.machado.lightsky.forecast.domain.usecase.GetForecastUseCase
import com.machado.lightsky.forecast.presentation.presenter.ForecastPresenter
import org.koin.dsl.module
import org.koin.experimental.builder.single
import org.koin.experimental.builder.singleBy
import retrofit2.Retrofit

val ForecastModule = module {
    single { get<Retrofit>().create(ForecastService::class.java) }
    singleBy<ForecastRemoteDataSource, ForecastRemoteResource>()
    singleBy<ForecastRepository, ForecastRepositoryImpl>()
    single<GetForecastUseCase>()
    factory { (view: ForecastPresenter.View) -> ForecastPresenter(view, get(), get()) }
}