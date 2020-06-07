package com.kwabenaberko.openweathermaplib.model.common

import com.google.gson.annotations.SerializedName

/**
 * Created by Kwabena Berko on 7/25/2017.
 */
class Clouds {
    @SerializedName("all")
    private var all = 0.0
    fun getAll(): Double {
        return all
    }

    fun setAll(all: Double) {
        this.all = all
    }
}