package com.airfighters.airaware.utils;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by alex on 23.04.2016.
 */
public class Utils {
    public static boolean arePointsNear(LatLng point1, LatLng point2) {
        double lat = (point1.latitude - point2.latitude) * (point1.latitude - point2.latitude);
        double lng = (point1.longitude - point2.longitude) * (point1.longitude - point2.longitude);
        Log.d("dw", (lat + lng)+"");
        return (lat + lng) < 1;
    }
}
