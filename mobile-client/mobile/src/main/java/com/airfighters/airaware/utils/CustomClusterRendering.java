package com.airfighters.airaware.utils;

import android.content.Context;

import com.airfighters.airaware.model.City;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

/**
 * Created by alex on 23.04.2016.
 */
public class CustomClusterRendering extends DefaultClusterRenderer<City> {
    public CustomClusterRendering(Context context, GoogleMap map, ClusterManager<City> clusterManager) {
        super(context, map, clusterManager);
    }

    protected void onBeforeClusterItemRendered(City item, MarkerOptions markerOptions) {
        //markerOptions.icon(item.getIcon());
        //markerOptions.snippet(item.getSnippet());
        markerOptions.title(item.name);
        super.onBeforeClusterItemRendered(item, markerOptions);
    }
}
