package com.airfighters.airaware.model;

import java.util.List;

/**
 * Created by alex on 23.04.2016.
 */
public class City {
    public float pollutionFactor;
    public int population;
    public String name;
    public List<Disease> diseases;

    public City(int population, String name, List<Disease> diseases) {
        this.name = name;
        this.diseases = diseases;
        this.population = population;
    }
}
