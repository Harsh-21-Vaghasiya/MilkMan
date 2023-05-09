package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Customer_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile);
    }


    public void  nextcustomerreport(View view)
    {
        Intent intent = new Intent(Customer_Profile.this, Customer_Edit_Profile.class);
        startActivity(intent);
        finish();
    }
}