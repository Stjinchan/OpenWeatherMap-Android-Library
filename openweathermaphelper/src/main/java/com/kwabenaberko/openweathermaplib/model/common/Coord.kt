package com.kwabenaberko.openweathermaplib.model.common

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class Coord {
    @SerializedName("lon")
    private var lon = 0.0

    @SerializedName("lat")
    private var lat = 0.0
    fun getLon(): Double {
        return lon
    }

    fun setLon(lon: Double) {
        this.lon = lon
    }

    fun getLat(): Double {
        return lat
    }

    fun setLat(lat: Double) {
        this.lat = lat
    }
}