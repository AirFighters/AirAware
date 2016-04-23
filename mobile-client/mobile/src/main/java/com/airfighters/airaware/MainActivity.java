package com.airfighters.airaware;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.airfighters.airaware.model.City;
import com.airfighters.airaware.utils.Constants;
import com.airfighters.airaware.utils.CustomClusterRendering;
import com.airfighters.airaware.utils.MultiListener;
import com.airfighters.airaware.utils.Utils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.ogaclejapan.arclayout.ArcLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnCameraChangeListener {
    private String TAG = getClass().getSimpleName();
    private GoogleMap mMap;
    private  ClusterManager<City> mClusterManager;
    private Marker marcu;

    List<City> orase;

    private ArcLayout arcLayout;
    private FloatingActionButton centerItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupMap();
        attachViews();
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

    private void attachViews() {
        arcLayout = (ArcLayout) findViewById(R.id.arc_layout);
        centerItem = (FloatingActionButton) findViewById(R.id.center_item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        //mMap.setOnCameraChangeListener(this);

        Log.d(TAG, mMap.getMinZoomLevel() + "\t" + mMap.getMaxZoomLevel());

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        marcu = mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        setUpClusterer();
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
        boolean found = false;
        for (City city : orase) {
            if (Utils.arePointsNear(city.position, cameraPosition.target)) {
                if (!centerItem.isSelected()) {
                    return;
                }
                centerItem.setSelected(false);
                onFabClick(centerItem);
                found = true;
            }
        }

        if (!found) {
            if (centerItem.isSelected()) {
                return;
            }
            centerItem.setSelected(true);
            onFabClick(centerItem);
        }
    }

    private void setUpClusterer() {
        // Initialize the manager with the context and the map.
        // (Activity extends context, so we can pass 'this' in the constructor.)
        mClusterManager = new ClusterManager<>(this, mMap);
        mClusterManager.setRenderer(new CustomClusterRendering(this, mMap, mClusterManager));

        MultiListener ml = new MultiListener();
        ml.addListener(mClusterManager);
        ml.addListener(this);

        // Point the map's listeners at the listeners implemented by the cluster
        // manager.
        mMap.setOnCameraChangeListener(ml);
        mMap.setOnMarkerClickListener(mClusterManager);

        generateDummyData();
    }

    private void generateDummyData() {
        orase = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orase.add(Utils.getDummyCity(i));
        }

        mClusterManager.addItems(orase);
        /*for (City city : orase) {
            mMap.addMarker(new MarkerOptions().position(city.position).title(city.name));
        }*/
    }

    private void onFabClick(View v) {
        if (v.isSelected()) {
            hideMenu();
        } else {
            showMenu();
        }
    }

    private void showMenu() {
        List<Animator> animList = new ArrayList<>();

        animList.add(Utils.createShowItemAnimator(centerItem, centerItem));

        for (int i = 0, len = arcLayout.getChildCount(); i < len; i++) {
            animList.add(Utils.createShowItemAnimator(centerItem, arcLayout.getChildAt(i)));
        }

        AnimatorSet animSet = new AnimatorSet();
        animSet.playSequentially(animList);
        animSet.start();
    }

    private void hideMenu() {
        List<Animator> animList = new ArrayList<>();

        for (int i = arcLayout.getChildCount() - 1; i >= 0; i--) {
            animList.add(Utils.createHideItemAnimator(centerItem, arcLayout.getChildAt(i)));
        }

        animList.add(Utils.createHideItemAnimator(centerItem, centerItem));


        AnimatorSet animSet = new AnimatorSet();
        animSet.playSequentially(animList);
        animSet.start();

    }
}
