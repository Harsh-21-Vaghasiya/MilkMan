package com.example.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Random;

public class mobileNo_auth extends AppCompatActivity {

    TextInputEditText mobileno;
    Button sendotp_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_no_auth);

        mobileno = findViewById(R.id.mobile_no_auth_mobileno);
        sendotp_button = findViewById(R.id.sendOtpButton);


        sendotp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mobileno.length()<10){

                    Toast.makeText(mobileNo_auth.this, "Enter correct Number ", Toast.LENGTH_LONG).show();

                }
                else{

//                For Generate random otp
                Random otp = new Random();
                int otpCount = 0;
                StringBuilder sb = new StringBuilder();
                while (otpCount < 4) {
                    sb.append(otp.nextInt(10));
                    otpCount++;
                }
                String generatedOtp = sb.toString();
                Toast.makeText(mobileNo_auth.this, "Your otp is "+generatedOtp, Toast.LENGTH_LONG).show();

//                Generate otp end
                Intent intent=new Intent(mobileNo_auth.this,Otp_Validation.class);
                intent.putExtra("RandomGeneratedOtp",generatedOtp);
                startActivity(intent);
            }
            }
        });
    }
}