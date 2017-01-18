package com.example.tanguygranat.continental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.visioglobe.visiomoveessential.VMEMapView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        VMEMapView mapView = (VMEMapView) findViewById(R.id.mapView);
        mapView.loadMap();
    }
}
