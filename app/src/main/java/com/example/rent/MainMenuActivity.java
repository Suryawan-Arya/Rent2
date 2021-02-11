package com.example.rent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void VehicleDetail(View view) {
        startActivity(new Intent(getApplicationContext(),VehicleDetailActivity.class));

    }

    public void Profile(View view) {
        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));

    }
}
