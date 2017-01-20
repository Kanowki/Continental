package com.example.tanguygranat.continental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.visioglobe.visiomoveessential.VMEMapView;
import com.visioglobe.visiomoveessential.interfaces.VMEMapListener;
import com.visioglobe.visiomoveessential.model.VMEPosition;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        VMEMapView mapView = (VMEMapView) findViewById(R.id.mapView);
        mapView.loadMap();
    }
}
