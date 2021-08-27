package com.natamarques.weatherapp.ui.api

import com.natamarques.weatherapp.ui.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("weather/SaoPaulo")
    suspend fun getWeather() : Response<Weather>
}