package com.airfighters.airaware.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alex on 23.04.2016.
 */
public class Disease {
    @SerializedName("color")
    public String color;

    @SerializedName("name")
    public String title;

    @SerializedName("symptom")
    public String description;

    public int peopleAffected;

    public Disease(String title, String description, int peopleAffected) {
        this.title = title;
        this.description = description;
        this.peopleAffected = peopleAffected;
    }
}
