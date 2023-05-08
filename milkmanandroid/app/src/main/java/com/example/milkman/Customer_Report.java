package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Customer_Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_report);
    }

    public void  nexttoprovider(View view)
    {
        Intent intent = new Intent(Customer_Report.this, Provider_Profile.class);
        startActivity(intent);
        finish();
    }
}