package com.airfighters.airaware.model;

/**
 * Created by alex on 23.04.2016.
 */
public class Disease {
    public String title;
    public String description;
    public int peopleAffected;

    public Disease(String title, String description, int peopleAffected) {
        this.title = title;
        this.description = description;
        this.peopleAffected = peopleAffected;
    }
}
