package com.example.runningpro.services

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {

    fun provideNetWorkService(): NetworkService  {
        return provideRetrofit("https://api.openweathermap.org/").create(NetworkService::class.java)
    }

    private fun provideRetrofit(baseUrl: String): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(provideGson()))
            .build()
    }

    private fun provideGson(): Gson {
        return GsonBuilder().create()
    }
}