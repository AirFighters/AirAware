package com.airfighters.airaware.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by alex on 24.04.2016.
 */
public class Oras {
    @SerializedName("name")
    public String name;

    @SerializedName("latitude")
    public double latitude;

    @SerializedName("longitude")
    public double longitude;

    @SerializedName("population")
    public int population;

    @SerializedName("diseases")
    public List<Integer> diseases;
}
