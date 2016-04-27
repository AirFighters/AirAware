package com.airfighters.airaware;

import android.graphics.Color;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airfighters.airaware.model.City;
import com.airfighters.airaware.model.Disease;
import com.airfighters.airaware.model.Diseases;
import com.airfighters.airaware.model.Oras;
import com.airfighters.airaware.utils.Constants;
import com.airfighters.airaware.utils.Utils;
import com.airfighters.airaware.views.ColorView;
import com.dlazaro66.wheelindicatorview.WheelIndicatorItem;
import com.dlazaro66.wheelindicatorview.WheelIndicatorView;
import com.google.gson.Gson;

public class MainActivity extends WearableActivity {
    private WheelIndicatorView indicatorView;

    private LinearLayout detailsLayout;
    private TextView cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAmbientEnabled();
        attachViews();
        addWheelItems();
    }

    @Override
    public void onEnterAmbient(Bundle ambientDetails) {
        super.onEnterAmbient(ambientDetails);
        updateDisplay();
    }

    @Override
    public void onUpdateAmbient() {
        super.onUpdateAmbient();
        updateDisplay();
    }

    @Override
    public void onExitAmbient() {
        updateDisplay();
        super.onExitAmbient();
    }

    private void updateDisplay() {
        /*if (isAmbient()) {
            mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));
            mTextView.setTextColor(getResources().getColor(android.R.color.white));
            mClockView.setVisibility(View.VISIBLE);

            mClockView.setText(AMBIENT_DATE_FORMAT.format(new Date()));
        } else {
            mContainerView.setBackground(null);
            mTextView.setTextColor(getResources().getColor(android.R.color.black));
            mClockView.setVisibility(View.GONE);
        }*/
    }

    private void attachViews() {
        indicatorView = (WheelIndicatorView) findViewById(R.id.wheel_indicator_view);
        detailsLayout = (LinearLayout) findViewById(R.id.details_layout);
        cityName = (TextView) findViewById(R.id.city_name);
    }

    private void addWheelItems() {
        Diseases diseases = new Gson().fromJson(Constants.DISEASES_JSON, Diseases.class);
        Oras temp = new Gson().fromJson(Constants.LONDON_JSON, Oras.class);
        City london = Utils.getCity(temp, diseases.diseases, false);

        indicatorView.setFilledPercent(100);
        cityName.setText(london.name);

        float percent = 0.1f;
        for (Disease dis : london.diseases) {
            indicatorView.addWheelIndicatorItem(new WheelIndicatorItem(percent, Color.parseColor(dis.color)));
            insertDetail(dis);
            percent += 0.2f;
        }

        indicatorView.startItemsAnimation(); // Animate!
    }

    private void insertDetail(Disease disease) {
        View item = LayoutInflater.from(this).inflate(R.layout.wheel_item_info, detailsLayout, false);

        ColorView colorView = (ColorView) item.findViewById(R.id.item_color);
        TextView textView = (TextView) item.findViewById(R.id.item_text);

        colorView.setBackgroundColor(Color.parseColor(disease.color));
        textView.setText(disease.title);

        detailsLayout.addView(item);
    }
}
