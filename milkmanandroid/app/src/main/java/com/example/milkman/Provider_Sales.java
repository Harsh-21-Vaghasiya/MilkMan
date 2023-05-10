
package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provider_Sales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_sales);
    }

    public void  addprovider(View view)
    {
        Intent intent = new Intent(Provider_Sales.this, Provider_More.class);
        startActivity(intent);
        finish();
    }
}