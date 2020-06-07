package com.kwabenaberko.openweathermaplib.model.threehourforecast

import com.google.gson.annotations.SerializedName
import com.kwabenaberko.openweathermaplib.model.common.Coord

/**
 * Created by Kwabena Berko on 8/6/2017.
 */
class City {
    @SerializedName("id")
    private var id: Long = 0

    @SerializedName("name")
    private var name: String? = null

    @SerializedName("coord")
    private var mCoord: Coord? = null

    @SerializedName("country")
    private var country: String? = null

    @SerializedName("population")
    private var population: Long = 0
    fun getId(): Long {
        return id
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCoord(): Coord? {
        return mCoord
    }

    fun setCoord(coord: Coord?) {
        mCoord = coord
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getPopulation(): Long {
        return population
    }

    fun setPopulation(population: Long) {
        this.population = population
    }
}