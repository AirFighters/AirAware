package com.airfighters.airaware.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

import java.util.List;

/**
 * Created by alex on 23.04.2016.
 */
public class City implements ClusterItem {
    public String name;
    public LatLng position;
    public List<Disease> diseases;

    public City(String name, LatLng position, List<Disease> diseases) {
        this.name = name;
        this.position = position;
        this.diseases = diseases;
    }

    @Override
    public LatLng getPosition() {
        return position;
    }
}
