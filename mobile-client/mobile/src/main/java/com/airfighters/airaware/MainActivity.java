package com.airfighters.airaware;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.airfighters.airaware.utils.Constants;
import com.airfighters.airaware.utils.Utils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnCameraChangeListener {
    private String TAG = getClass().getSimpleName();
    private GoogleMap mMap;
    private Marker marcu;

    private Button butoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        butoi = (Button) findViewById(R.id.button);

        setupMap();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupMap() {
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        mMap.setOnCameraChangeListener(this);

        Log.d(TAG, mMap.getMinZoomLevel() + "\t" + mMap.getMaxZoomLevel());

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        marcu = mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if (marker.equals(marcu)) {
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), Constants.MARKER_CLICK_ZOOM_LEVEL));
            return true;
        }
        return false;
    }

    @Override
    public void onCameraChange(CameraPosition cameraPosition) {
        Log.d(TAG, cameraPosition.target.latitude + "\t" + cameraPosition.target.longitude);
        if (Utils.arePointsNear(marcu.getPosition(), cameraPosition.target)) {
            Log.d(TAG, "is acolo");
            butoi.setVisibility(View.VISIBLE);
        } else {
            Log.d(TAG, "nu is acolo");
            butoi.setVisibility(View.GONE);
        }
    }
}
