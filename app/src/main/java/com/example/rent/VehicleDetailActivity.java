package com.example.rent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VehicleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_detail);
    }

    public void Back(View view) {
        startActivity(new Intent(getApplicationContext(),MainMenuActivity.class));

    }

    public void BookNow(View view) {
        startActivity(new Intent(getApplicationContext(),BookingActivity.class));
    }
}
