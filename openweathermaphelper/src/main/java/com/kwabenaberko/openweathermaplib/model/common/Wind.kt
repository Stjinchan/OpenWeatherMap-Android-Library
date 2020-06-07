package com.kwabenaberko.openweathermaplib.model.common

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class Wind {
    @SerializedName("speed")
    private var speed = 0.0

    @SerializedName("deg")
    private var deg = 0.0
    fun getSpeed(): Double {
        return speed
    }

    fun setSpeed(speed: Double) {
        this.speed = speed
    }

    fun getDeg(): Double {
        return deg
    }

    fun setDeg(deg: Double) {
        this.deg = deg
    }
}