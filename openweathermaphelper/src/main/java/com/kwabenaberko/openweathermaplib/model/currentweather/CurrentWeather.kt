package com.kwabenaberko.openweathermaplib.model.currentweather

import com.google.gson.annotations.SerializedName
import com.kwabenaberko.openweathermaplib.model.common.*

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class CurrentWeather {
    @SerializedName("coord")
    private var mCoord: Coord? = null

    @SerializedName("weather")
    private var mWeather: MutableList<Weather?>? = null

    @SerializedName("base")
    private var base: String? = null

    @SerializedName("main")
    private var mMain: Main? = null

    @SerializedName("wind")
    private var mWind: Wind? = null

    @SerializedName("clouds")
    private var mClouds: Clouds? = null

    @SerializedName("dt")
    private var dt: Long? = null

    @SerializedName("sys")
    private var mSys: Sys? = null

    @SerializedName("id")
    private var id: Long? = null

    @SerializedName("name")
    private var name: String? = null

    fun getCoord(): Coord? {
        return mCoord
    }

    fun setCoord(coord: Coord?) {
        mCoord = coord
    }

    fun getWeather(): MutableList<Weather?>? {
        return mWeather
    }

    fun setWeather(weather: MutableList<Weather?>?) {
        mWeather = weather
    }

    fun getBase(): String? {
        return base
    }

    fun setBase(base: String?) {
        this.base = base
    }

    fun getMain(): Main? {
        return mMain
    }

    fun setMain(main: Main?) {
        mMain = main
    }

    fun getWind(): Wind? {
        return mWind
    }

    fun setWind(wind: Wind?) {
        mWind = wind
    }

    fun getClouds(): Clouds? {
        return mClouds
    }

    fun setClouds(clouds: Clouds?) {
        mClouds = clouds
    }

    fun getDt(): Long? {
        return dt
    }

    fun setDt(dt: Long?) {
        this.dt = dt
    }

    fun getSys(): Sys? {
        return mSys
    }

    fun setSys(sys: Sys?) {
        mSys = sys
    }

    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}