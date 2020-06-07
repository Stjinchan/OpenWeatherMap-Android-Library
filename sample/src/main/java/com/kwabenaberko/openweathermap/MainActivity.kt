package com.kwabenaberko.openweathermap

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kwabenaberko.openweathermaplib.constant.Lang
import com.kwabenaberko.openweathermaplib.constant.Units
import com.kwabenaberko.openweathermaplib.implementation.OpenWeatherMapHelper
import com.kwabenaberko.openweathermaplib.implementation.callback.CurrentWeatherCallback
import com.kwabenaberko.openweathermaplib.model.currentweather.CurrentWeather

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instantiate Class With Your ApiKey As The Parameter
        val helper = OpenWeatherMapHelper(getString(R.string.OPEN_WEATHER_MAP_API_KEY))

        //Set Units
        helper.setUnits(Units.IMPERIAL)

        //Set lang
        helper.setLang(Lang.ENGLISH)


        /*
        This Example Only Shows how to get current weather by city name
        Check the docs for more methods [https://github.com/KwabenBerko/OpenWeatherMap-Android-Library/]
        */helper.getCurrentWeatherByCityName("Accra", object : CurrentWeatherCallback {
            override fun onSuccess(currentWeather: CurrentWeather?) {
                if (currentWeather != null) {
                    Log.v(TAG,
                            """
                                    Coordinates: ${currentWeather.getCoord()?.getLat()}, ${currentWeather.getCoord()?.getLon()}
                                    Weather Description: ${currentWeather.getWeather()?.get(0)?.getDescription()}
                                    Temperature: ${currentWeather.getMain()?.getTempMax()}
                                    Wind Speed: ${currentWeather.getWind()?.getSpeed()}
                                    City, Country: ${currentWeather.getName()}, ${currentWeather.getSys()?.getCountry()}
                                    """.trimIndent()
                    )
                }
            }

            override fun onFailure(throwable: Throwable?) {
                if (throwable != null) {
                    Log.v(TAG, throwable.message)
                }
            }
        })
    }

    companion object {
        val TAG: String? = MainActivity::class.java.simpleName
    }
}