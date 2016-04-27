package com.airfighters.airaware.utils;

import com.airfighters.airaware.model.City;
import com.airfighters.airaware.model.Disease;
import com.airfighters.airaware.model.Oras;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alex on 27.04.2016.
 */
public class Utils {
    private static Random rand = new Random();

    public static City getCity(Oras oras, List<Disease> diseases, boolean isPolluted) {
        int minRand;
        int maxRand;
        if (isPolluted) {
            minRand = 1000;
            maxRand = 10000;
        } else {
            minRand = 10;
            maxRand = 1000;
        }

        List<Disease> boale = new ArrayList<>();

        for (Integer dIdx : oras.diseases) {
            Disease temp = diseases.get(dIdx);
            int ppl = rand.nextInt(maxRand) + minRand;
            boale.add(new Disease(temp.title, temp.description, temp.color, ppl));
        }

        return new City(oras.population, oras.name, boale);
    }

}
