package com.airfighters.airaware.utils;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 23.04.2016.
 */
public class MultiMarkerClickListener implements OnMarkerClickListener {
    List<OnMarkerClickListener> mListeners = new ArrayList<>();

    @Override
    public boolean onMarkerClick(Marker marker) {
        for (OnMarkerClickListener listener : mListeners) {
            listener.onMarkerClick(marker);
        }
        return true;
    }

    // Other methods to add, remove listeners

    public void addListener(OnMarkerClickListener listener) {
        mListeners.add(listener);
    }
}