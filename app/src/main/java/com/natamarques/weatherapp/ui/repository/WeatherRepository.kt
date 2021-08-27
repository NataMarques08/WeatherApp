package com.natamarques.weatherapp.ui.repository

import com.natamarques.weatherapp.ui.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getWeather() = apiService.getWeather()
}