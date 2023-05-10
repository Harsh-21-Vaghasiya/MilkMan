package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customer_Edit_Profile extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_edit_profile);
    }


    public void  next(View view)
    {
        Intent intent = new Intent(Customer_Edit_Profile.this, Provider_More.class);
        startActivity(intent);
        finish();
    }

      public void  update(View view)
    {
        Intent intent = new Intent(Customer_Edit_Profile.this, Customer_Profile.class);
        startActivity(intent);
        finish();
    }




}