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
        mapView.setMapListener(mMapListener);
        mapView.loadMap();
    }


    private VMEMapListener mMapListener = new VMEMapListener() {
        @Override
        public void mapReadyForPlaceUpdate(VMEMapView pMapBlockView) {
            // This is where the place data update must take place (the only moment where the map
            // view can take the data into account).
            try {
                // The data comes from the visio_island_cms_update.json in the raw resources.
                InputStream resourceReader = getResources().openRawResource(R.raw.resourcescontinav);
                Writer writer = new StringWriter();
                Toast.makeText(getBaseContext(), "rzer", Toast.LENGTH_SHORT).show();
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(resourceReader, "UTF-8"));
                    String line = reader.readLine();
                    while (line != null) {
                        writer.write(line);
                        line = reader.readLine();
                    }
                } catch (Exception e) {
                } finally {
                    try {
                        resourceReader.close();
                    } catch (Exception e) {
                    }
                }
                String lJsonString = writer.toString();
                pMapBlockView.updatePlaceData(new JSONObject(lJsonString).getJSONObject("locale").getJSONObject("en"));
            } catch (JSONException e) {
            }
        }

        @Override
        public void mapDidLoad(VMEMapView vmeMapView) {

        }

        @Override
        public boolean mapDidSelectPlace(VMEMapView vmeMapView, String s, VMEPosition vmePosition) {
            return false;
        }

    };
}
