package com.kwabenaberko.openweathermaplib.model.threehourforecast

import com.google.gson.annotations.SerializedName

open class Precipitation {
    @SerializedName("3h")
    private var threeHour: Double? = null
    fun get3h(): Double? {
        return threeHour
    }

    fun set3h(threeHour: Double?) {
        this.threeHour = threeHour
    }
}