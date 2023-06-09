package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Call_Register_Activity extends AppCompatActivity {


    private static final int REQUEST_PHONE_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_register);
    }

    public void call(View view){
        try{
            if (ContextCompat.checkSelfPermission(Call_Register_Activity.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this,"give permission first",Toast.LENGTH_SHORT).show();
                ActivityCompat.requestPermissions(Call_Register_Activity.this, new String[]{android.Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
            }
            else
            {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+917016541653"));
                startActivity(i);
            }

        }catch(Exception e){
            Log.e("errorr","error at call_register_actibity.java as "+ e.getMessage());
        }
    }

    public void skip(View view){
        try{
            Intent i = new Intent(this, firstpage.class);
            startActivity(i);
        }catch(Exception e){
            Log.e("errorr","error at call_register_activity.java as "+ e.getMessage());
        }
    }

}