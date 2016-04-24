package com.airfighters.airaware.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by alex on 24.04.2016.
 */
public class Diseases {
    @SerializedName("diseases")
    public List<Disease> diseases;
}
