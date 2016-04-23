package com.airfighters.airaware.utils;

import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.model.CameraPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 23.04.2016.
 */
public class MultiCameraChangeListener implements OnCameraChangeListener {
    List<OnCameraChangeListener> mListeners = new ArrayList<>();

    public void onCameraChange(CameraPosition cameraPosition) {
        for (OnCameraChangeListener ccl : mListeners) {
            ccl.onCameraChange(cameraPosition);
        }
    }

    // Other methods to add, remove listeners

    public void addListener(OnCameraChangeListener listener) {
        mListeners.add(listener);
    }
}