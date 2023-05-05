package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Testing_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
    }
    public void call_activity(View view){
        Intent i =new Intent(this,Call_Register_Activity.class);
        startActivity(i);
    }
    public void normal(View view){
        Intent i = new Intent(this, mobileNo_auth.class);
        startActivity(i);
    }
}