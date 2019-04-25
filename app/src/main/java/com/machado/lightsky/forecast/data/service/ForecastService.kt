package com.machado.lightsky.forecast.data.service

import com.machado.lightsky.forecast.data.model.ForecastResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ForecastService {
    @GET("forecast/{key}/{latitude},{longitude}")
    fun getForecast(
        @Path("key") apiKey: String,
        @Path("latitude") latitude: String,
        @Path("longitude") longitude: String
    ): Single<ForecastResponse>
}