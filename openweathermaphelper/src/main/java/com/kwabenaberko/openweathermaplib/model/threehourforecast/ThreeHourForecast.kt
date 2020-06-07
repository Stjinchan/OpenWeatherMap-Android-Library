package com.kwabenaberko.openweathermaplib.model.threehourforecast

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 8/6/2017.
 */
class ThreeHourForecast {
    @SerializedName("cod")
    private var cod: String? = null

    @SerializedName("message")
    private var message = 0.0

    @SerializedName("cnt")
    private var cnt = 0

    @SerializedName("list")
    private var mList: MutableList<ThreeHourWeather?>? = null

    @SerializedName("city")
    private var mCity: City? = null
    fun getCod(): String? {
        return cod
    }

    fun setCod(cod: String?) {
        this.cod = cod
    }

    fun getMessage(): Double {
        return message
    }

    fun setMessage(message: Double) {
        this.message = message
    }

    fun getCnt(): Int {
        return cnt
    }

    fun setCnt(cnt: Int) {
        this.cnt = cnt
    }

    fun getList(): MutableList<ThreeHourWeather?>? {
        return mList
    }

    fun setList(list: MutableList<ThreeHourWeather?>?) {
        mList = list
    }

    fun getCity(): City? {
        return mCity
    }

    fun setCity(city: City?) {
        mCity = city
    }
}