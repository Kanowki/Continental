package com.example.tanguygranat.continental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by tanguy.granat on 18/01/2017.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onPosClick(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);

    }

}
