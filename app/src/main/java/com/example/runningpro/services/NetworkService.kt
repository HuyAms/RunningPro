package com.example.runningpro.services

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


data class WeatherResponse(
    @SerializedName("weather")
    val weather: List<Weather>
)

data class Weather(
    @SerializedName("description")
    val description: String
)

interface NetworkService {

    @GET("/data/2.5/weather/")
    fun getWeather(@Query("q") name: String,
                         @Query("appid") appid: String = "2da0853bc254f7de1b31f2def89fee70"
    ): Call<WeatherResponse>
}