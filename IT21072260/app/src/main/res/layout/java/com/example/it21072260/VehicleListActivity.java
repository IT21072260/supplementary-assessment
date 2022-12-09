package com.example.it21072260;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class VehicleListActivity extends AppCompatActivity {

    CardView vehicleCardView1, vehicleCardView2, vehicleCardView3, vehicleCardView4;
    public static int id, image;
    public static String name, colour;
    public static  double capacity, price;
    Button viewBookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_list);

        vehicleCardView1 = findViewById(R.id.vehicleCardView1);
        vehicleCardView2 = findViewById(R.id.vehicleCardView2);


        viewBookings = findViewById(R.id.viewBookings);

        viewBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewBookingsListActivity.class));
            }
        });

        vehicleCardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = VehicleData.id[0];
                image = VehicleData.vehicleImageArray[0];
                name = VehicleData.vehicleNamesArray[0];
                colour = VehicleData.vehicleColoursArray[0];
                capacity = VehicleData.engineCapacityArray[0];
                price = VehicleData.vehiclePriceArray[0];
                startActivity(new Intent(getApplicationContext(), EnterBookingDetailsActivity.class));
            }
        });

        vehicleCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = VehicleData.id[1];
                image = VehicleData.vehicleImageArray[1];
                name = VehicleData.vehicleNamesArray[1];
                colour = VehicleData.vehicleColoursArray[1];
                capacity = VehicleData.engineCapacityArray[1];
                price = VehicleData.vehiclePriceArray[1];
                startActivity(new Intent(getApplicationContext(), EnterBookingDetailsActivity.class));
            }
        });

    }
}
