package com.kwabenaberko.openweathermaplib.implementation

import com.kwabenaberko.openweathermaplib.implementation.callback.CurrentWeatherCallback
import com.kwabenaberko.openweathermaplib.implementation.callback.ThreeHourForecastCallback
import com.kwabenaberko.openweathermaplib.model.currentweather.CurrentWeather
import com.kwabenaberko.openweathermaplib.model.threehourforecast.ThreeHourForecast
import com.kwabenaberko.openweathermaplib.network.OpenWeatherMapClient
import com.kwabenaberko.openweathermaplib.network.OpenWeatherMapService
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import java.net.HttpURLConnection
import java.util.*

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class OpenWeatherMapHelper(apiKey: String?) {
    private val openWeatherMapService: OpenWeatherMapService? = OpenWeatherMapClient.getClient()?.create(OpenWeatherMapService::class.java)
    private val options: MutableMap<String?, String?>?

    @Deprecated("")
    constructor() : this("") {
    }

    //SETUP METHODS
    @Deprecated("")
    fun setApiKey(appId: String?) {
        options?.set(APPID, appId)
    }

    fun setUnits(units: String?) {
        options?.set(UNITS, units)
    }

    fun setLang(lang: String?) {
        options?.set(LANGUAGE, lang)
    }

    private fun NoAppIdErrMessage(): Throwable? {
        return Throwable("UnAuthorized. Please set a valid OpenWeatherMap API KEY.")
    }

    private fun NotFoundErrMsg(str: String?): Throwable? {
        var throwable: Throwable? = null
        try {
            val obj = JSONObject(str)
            throwable = Throwable(obj.getString("message"))
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        if (throwable == null) {
            throwable = Throwable("An unexpected error occurred.")
        }
        return throwable
    }

    //    CURRENT WEATHER METHODS
    //    START
    //GET CURRENT WEATHER BY CITY NAME
    fun getCurrentWeatherByCityName(city: String?, callback: CurrentWeatherCallback?) {
        options?.set(QUERY, city)
        openWeatherMapService?.getCurrentWeatherByCityName(options)?.enqueue(object : Callback<CurrentWeather?> {
            override fun onResponse(call: Call<CurrentWeather?>, response: Response<CurrentWeather?>) {
                handleCurrentWeatherResponse(response, callback)
            }

            override fun onFailure(call: Call<CurrentWeather?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET CURRENT WEATHER BY CITY ID
    fun getCurrentWeatherByCityID(id: String?, callback: CurrentWeatherCallback?) {
        options?.set(CITY_ID, id)
        openWeatherMapService?.getCurrentWeatherByCityID(options)?.enqueue(object : Callback<CurrentWeather?> {
            override fun onResponse(call: Call<CurrentWeather?>?, response: Response<CurrentWeather?>?) {
                handleCurrentWeatherResponse(response, callback)
            }

            override fun onFailure(call: Call<CurrentWeather?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET CURRENT WEATHER BY GEOGRAPHIC COORDINATES
    fun getCurrentWeatherByGeoCoordinates(latitude: Double, longitude: Double, callback: CurrentWeatherCallback?) {
        options?.set(LATITUDE, latitude.toString())
        options?.set(LONGITUDE, longitude.toString())
        openWeatherMapService?.getCurrentWeatherByGeoCoordinates(options)?.enqueue(object : Callback<CurrentWeather?> {
            override fun onResponse(call: Call<CurrentWeather?>?, response: Response<CurrentWeather?>?) {
                handleCurrentWeatherResponse(response, callback)
            }

            override fun onFailure(call: Call<CurrentWeather?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET CURRENT WEATHER BY ZIP CODE
    fun getCurrentWeatherByZipCode(zipCode: String?, callback: CurrentWeatherCallback?) {
        options?.set(ZIP_CODE, zipCode)
        openWeatherMapService?.getCurrentWeatherByZipCode(options)?.enqueue(object : Callback<CurrentWeather?> {
            override fun onResponse(call: Call<CurrentWeather?>?, response: Response<CurrentWeather?>?) {
                handleCurrentWeatherResponse(response, callback)
            }

            override fun onFailure(call: Call<CurrentWeather?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    private fun handleCurrentWeatherResponse(response: Response<CurrentWeather?>?, callback: CurrentWeatherCallback?) {
        if (response != null) {
            if (response.code() == HttpURLConnection.HTTP_OK) {
                callback?.onSuccess(response.body())
            } else if (response.code() == HttpURLConnection.HTTP_FORBIDDEN || response.code() == HttpURLConnection.HTTP_UNAUTHORIZED) {
                callback?.onFailure(NoAppIdErrMessage())
            } else {
                try {
                    callback?.onFailure(NotFoundErrMsg(response.errorBody()?.string()))
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }

    //    CURRENT WEATHER METHODS
    //    END
    //    THREE HOUR FORECAST METHODS
    //    START
    //GET THREE HOUR FORECAST BY CITY NAME
    fun getThreeHourForecastByCityName(city: String?, callback: ThreeHourForecastCallback?) {
        options?.set(QUERY, city)
        openWeatherMapService?.getThreeHourForecastByCityName(options)?.enqueue(object : Callback<ThreeHourForecast?> {
            override fun onResponse(call: Call<ThreeHourForecast?>, response: Response<ThreeHourForecast?>) {
                handleThreeHourForecastResponse(response, callback)
            }

            override fun onFailure(call: Call<ThreeHourForecast?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET THREE HOUR FORECAST BY CITY ID
    fun getThreeHourForecastByCityID(id: String?, callback: ThreeHourForecastCallback?) {
        options?.set(CITY_ID, id)
        openWeatherMapService?.getThreeHourForecastByCityID(options)?.enqueue(object : Callback<ThreeHourForecast?> {
            override fun onResponse(call: Call<ThreeHourForecast?>, response: Response<ThreeHourForecast?>) {
                handleThreeHourForecastResponse(response, callback)
            }

            override fun onFailure(call: Call<ThreeHourForecast?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET THREE HOUR FORECAST BY GEO C0ORDINATES
    fun getThreeHourForecastByGeoCoordinates(latitude: Double, longitude: Double, callback: ThreeHourForecastCallback?) {
        options?.set(LATITUDE, latitude.toString())
        options?.set(LONGITUDE, longitude.toString())
        openWeatherMapService?.getThreeHourForecastByGeoCoordinates(options)?.enqueue(object : Callback<ThreeHourForecast?> {
            override fun onResponse(call: Call<ThreeHourForecast?>, response: Response<ThreeHourForecast?>) {
                handleThreeHourForecastResponse(response, callback)
            }

            override fun onFailure(call: Call<ThreeHourForecast?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    //GET THREE HOUR FORECAST BY ZIP CODE
    fun getThreeHourForecastByZipCode(zipCode: String?, callback: ThreeHourForecastCallback?) {
        options?.set(ZIP_CODE, zipCode)
        openWeatherMapService?.getThreeHourForecastByZipCode(options)?.enqueue(object : Callback<ThreeHourForecast?> {
            override fun onResponse(call: Call<ThreeHourForecast?>, response: Response<ThreeHourForecast?>) {
                handleThreeHourForecastResponse(response, callback)
            }

            override fun onFailure(call: Call<ThreeHourForecast?>, throwable: Throwable) {
                callback?.onFailure(throwable)
            }
        })
    }

    private fun handleThreeHourForecastResponse(response: Response<ThreeHourForecast?>?, callback: ThreeHourForecastCallback?) {
        if (response != null) {
            if (response.code() == HttpURLConnection.HTTP_OK) {
                callback?.onSuccess(response.body())
            } else if (response.code() == HttpURLConnection.HTTP_FORBIDDEN || response.code() == HttpURLConnection.HTTP_UNAUTHORIZED) {
                callback?.onFailure(NoAppIdErrMessage())
            } else {
                try {
                    callback?.onFailure(NotFoundErrMsg(response.errorBody()?.string()))
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }

    companion object {
        private val APPID: String? = "appId"
        private val UNITS: String? = "units"
        private val LANGUAGE: String? = "lang"
        private val QUERY: String? = "q"
        private val CITY_ID: String? = "id"
        private val LATITUDE: String? = "lat"
        private val LONGITUDE: String? = "lon"
        private val ZIP_CODE: String? = "zip"
    }

    init {
        options = HashMap()
        options[APPID] = apiKey ?: ""
    }
}