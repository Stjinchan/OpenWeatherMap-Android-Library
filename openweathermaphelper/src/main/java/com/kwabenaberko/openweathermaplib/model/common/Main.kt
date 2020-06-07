package com.kwabenaberko.openweathermaplib.model.common

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class Main {
    @SerializedName("temp")
    private var temp = 0.0

    @SerializedName("pressure")
    private var pressure = 0.0

    @SerializedName("humidity")
    private var humidity = 0.0

    @SerializedName("temp_min")
    private var tempMin = 0.0

    @SerializedName("temp_max")
    private var tempMax = 0.0

    @SerializedName("sea_level")
    private var seaLevel = 0.0

    @SerializedName("grnd_level")
    private var grndLevel = 0.0

    @SerializedName("temp_kf")
    private var tempKf = 0.0
    fun getTemp(): Double {
        return temp
    }

    fun setTemp(temp: Double) {
        this.temp = temp
    }

    fun getPressure(): Double {
        return pressure
    }

    fun setPressure(pressure: Double) {
        this.pressure = pressure
    }

    fun getHumidity(): Double {
        return humidity
    }

    fun setHumidity(humidity: Double) {
        this.humidity = humidity
    }

    fun getTempMin(): Double {
        return tempMin
    }

    fun setTempMin(tempMin: Double) {
        this.tempMin = tempMin
    }

    fun getTempMax(): Double {
        return tempMax
    }

    fun setTempMax(tempMax: Double) {
        this.tempMax = tempMax
    }

    fun getSeaLevel(): Double {
        return seaLevel
    }

    fun setSeaLevel(seaLevel: Double) {
        this.seaLevel = seaLevel
    }

    fun getGrndLevel(): Double {
        return grndLevel
    }

    fun setGrndLevel(grndLevel: Double) {
        this.grndLevel = grndLevel
    }

    fun getTempKf(): Double {
        return tempKf
    }

    fun setTempKf(tempKf: Double) {
        this.tempKf = tempKf
    }
}