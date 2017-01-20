package com.example.tanguygranat.continental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    protected void onMeetingClick(View view) {
        Intent intent = new Intent(this, ReunionActivity.class);
        startActivity(intent);
    }

    protected void toMap(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    protected void onOfficeClick(View view) {
        Intent intent = new Intent(this, BureauActivity.class);
        startActivity(intent);
    }
}
