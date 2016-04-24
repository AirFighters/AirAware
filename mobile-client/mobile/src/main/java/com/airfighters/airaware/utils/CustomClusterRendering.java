package com.airfighters.airaware.utils;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.airfighters.airaware.R;
import com.airfighters.airaware.model.City;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

import java.util.Random;

/**
 * Created by alex on 23.04.2016.
 */
public class CustomClusterRendering extends DefaultClusterRenderer<City> {
    private Bitmap defaultMarker;

    private int colorRed = Color.parseColor("#F44336");
    private int colorGreen = Color.parseColor("#4CAF50");


    public CustomClusterRendering(Context context, GoogleMap map, ClusterManager<City> clusterManager) {
        super(context, map, clusterManager);

        defaultMarker = BitmapFactory.decodeResource(context.getResources(), R.drawable.flat_marker);
    }

    protected void onBeforeClusterItemRendered(City item, MarkerOptions markerOptions) {
        //markerOptions.icon(item.getIcon());
        //markerOptions.snippet(item.getSnippet());
        int color = (Integer) new ArgbEvaluator().evaluate(item.pollutionFactor, colorGreen, colorRed);
        markerOptions.title(item.name);
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(Utils.makeTintedBitmap(defaultMarker, color)));
        super.onBeforeClusterItemRendered(item, markerOptions);
    }
}
