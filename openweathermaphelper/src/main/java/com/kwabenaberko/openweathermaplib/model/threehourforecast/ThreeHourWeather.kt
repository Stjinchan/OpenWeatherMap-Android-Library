package com.kwabenaberko.openweathermaplib.model.threehourforecast

import com.google.gson.annotations.SerializedName
import com.kwabenaberko.openweathermaplib.model.common.*

/**
 * Created by Kwabena Berko on 8/6/2017.
 */
class ThreeHourWeather {
    @SerializedName("dt")
    private var dt: Long? = null

    @SerializedName("main")
    private var mMain: Main? = null

    @SerializedName("weather")
    private var mWeatherArray: MutableList<Weather?>? = null

    @SerializedName("clouds")
    private var mClouds: Clouds? = null

    @SerializedName("wind")
    private var mWind: Wind? = null

    @SerializedName("rain")
    private var mRain: Rain? = null

    @SerializedName("snow")
    private var mSnow: Snow? = null

    @SerializedName("sys")
    private var mSys: Sys? = null

    @SerializedName("dt_txt")
    private var dtTxt: String? = null
    fun getDt(): Long? {
        return dt
    }

    fun setDt(dt: Long?) {
        this.dt = dt
    }

    fun getMain(): Main? {
        return mMain
    }

    fun setMain(main: Main?) {
        mMain = main
    }

    fun getWeatherArray(): MutableList<Weather?>? {
        return mWeatherArray
    }

    fun setWeatherArray(weatherArray: MutableList<Weather?>?) {
        mWeatherArray = weatherArray
    }

    fun getClouds(): Clouds? {
        return mClouds
    }

    fun setClouds(clouds: Clouds?) {
        mClouds = clouds
    }

    fun getWind(): Wind? {
        return mWind
    }

    fun setWind(wind: Wind?) {
        mWind = wind
    }

    fun getRain(): Rain? {
        return mRain
    }

    fun setRain(rain: Rain?) {
        mRain = rain
    }

    fun getSnow(): Snow? {
        return mSnow
    }

    fun setSnow(snow: Snow?) {
        mSnow = snow
    }

    fun getSys(): Sys? {
        return mSys
    }

    fun setSys(sys: Sys?) {
        mSys = sys
    }

    fun getDtTxt(): String? {
        return dtTxt
    }

    fun setDtTxt(dtTxt: String?) {
        this.dtTxt = dtTxt
    }
}