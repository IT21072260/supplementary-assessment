package com.example.it21072260;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BookingConfirmedActivity extends AppCompatActivity {

    Button viewBookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmed);

        viewBookings = findViewById(R.id.viewBookings);

        viewBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getApplicationContext(), ViewBookingsListActivity.class));
            }
        });
    }
}