package com.airfighters.airaware;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.airfighters.airaware.model.Cities;
import com.airfighters.airaware.model.City;
import com.airfighters.airaware.model.Disease;
import com.airfighters.airaware.model.Diseases;
import com.airfighters.airaware.model.Oras;
import com.airfighters.airaware.utils.Constants;
import com.airfighters.airaware.utils.CustomClusterRendering;
import com.airfighters.airaware.utils.MultiCameraChangeListener;
import com.airfighters.airaware.utils.MultiMarkerClickListener;
import com.airfighters.airaware.utils.Utils;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.gson.Gson;
import com.google.maps.android.clustering.ClusterManager;
import com.ogaclejapan.arclayout.ArcLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, GoogleMap.OnCameraChangeListener {
    private String TAG = getClass().getSimpleName();
    private GoogleMap mMap;
    private  ClusterManager<City> mClusterManager;

    List<City> orase;

    private ArcLayout arcLayout;
    private FloatingActionButton centerItem;

    private BottomSheetBehavior behavior;
    private TextView diseaseTitle;
    private TextView affectedPeople;
    private TextView diseaseDescription;

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

        diseaseTitle = (TextView) findViewById(R.id.diseaseTitle);
        affectedPeople = (TextView) findViewById(R.id.affectedPeople);
        diseaseDescription = (TextView) findViewById(R.id.diseaseDescription);

        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_content);

        if (coordinatorLayout == null) {
            return;
        }
        // The View with the BottomSheetBehavior
        View bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.animateCamera(CameraUpdateFactory.newLatLng(new LatLng(1, 1)));

        setUpClusterer();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Log.d(TAG, "click");

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), Constants.MARKER_CLICK_ZOOM_LEVEL));
        behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        return true;
    }

    @Override
    public void onCameraChange(CameraPosition cameraPosition) {
        Log.d("zoom", "" + cameraPosition.zoom);
        boolean found = false;

        for (City city : orase) {
            if (Utils.arePointsNear(city.position, cameraPosition.target)) {
                setCurrentCity(city);

                if (!centerItem.isSelected()) {
                    return;
                }

                centerItem.setSelected(false);
                onFabClick(centerItem);
                found = true;
                break;
            }
        }

        if (!found) {
            behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
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

        MultiCameraChangeListener ml = new MultiCameraChangeListener();
        ml.addListener(mClusterManager);
        ml.addListener(this);

        // Point the map's listeners at the listeners implemented by the cluster
        // manager.
        mMap.setOnCameraChangeListener(ml);

        MultiMarkerClickListener markerClickListener = new MultiMarkerClickListener();
        //markerClickListener.addListener(mClusterManager);
        markerClickListener.addListener(this);

        mMap.setOnMarkerClickListener(markerClickListener);

        generateDummyData();
    }

    @Override
    public void onBackPressed() {
        if (behavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
            behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        } else if (behavior.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
            behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        } else if (!centerItem.isSelected()) {
            centerItem.setSelected(true);
            hideMenu();
        } else {
            super.onBackPressed();
        }
    }

    private void generateDummyData() {
        Diseases diseases = new Gson().fromJson(Constants.DISEASES_JSON, Diseases.class);
        Cities cities = new Gson().fromJson(Constants.CITIES_JSON, Cities.class);

        orase = new ArrayList<>();
        for (Oras oras : cities.cities) {
            orase.add(Utils.getCity(oras, diseases.diseases));
        }

        mClusterManager.addItems(orase);
    }

    private void setCurrentCity(final City city) {
        for (int i = 0, len = arcLayout.getChildCount(); i < len; i++) {
            setupFabClickListener(city, i);
        }
    }

    private void setupFabClickListener(final City city, final int idx) {
        FloatingActionButton fab = (FloatingActionButton) arcLayout.getChildAt(idx);
        fab.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{Color.parseColor(city.diseases.get(idx).color)}));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                diseaseTitle.setText(city.diseases.get(idx).title);
                affectedPeople.setText(Utils.coolFormat(city.diseases.get(idx).peopleAffected, 0));
                diseaseDescription.setText(city.diseases.get(idx).description);
            }
        });
    }

    private void onFabClick(View v) {
        if (v.isSelected()) {
            hideMenu();
        } else {
            showMenu();
        }
    }

    private void showMenu() {
        arcLayout.setVisibility(View.VISIBLE);
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
        animSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                arcLayout.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        animSet.start();
    }
}
