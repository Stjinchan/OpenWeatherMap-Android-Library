package com.kwabenaberko.openweathermaplib.model.common

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class Sys {
    @SerializedName("message")
    private var message = 0.0

    @SerializedName("country")
    private var country: String? = null

    @SerializedName("sunrise")
    private var sunrise: Long? = null

    @SerializedName("sunset")
    private var sunset: Long? = null

    @SerializedName("pod")
    private var pod: String? = null
    fun getMessage(): Double {
        return message
    }

    fun setMessage(message: Double) {
        this.message = message
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getSunrise(): Long? {
        return sunrise
    }

    fun setSunrise(sunrise: Long?) {
        this.sunrise = sunrise
    }

    fun getSunset(): Long? {
        return sunset
    }

    fun setSunset(sunset: Long?) {
        this.sunset = sunset
    }

    fun getPod(): String? {
        return pod
    }

    fun setPod(pod: String?) {
        this.pod = pod
    }
}