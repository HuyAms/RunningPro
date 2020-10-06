package com.example.runningpro.repositories

import com.example.runningpro.services.ServiceGenerator

class WeatherRepository {

    private val call = ServiceGenerator.provideNetWorkService()

    fun getWeather(city: String) = call.getWeather(city)
}