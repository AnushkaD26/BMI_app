package com.myapp1.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Intent iHome;  // creating intent for splash screen
        iHome=new Intent(SplashScreen.this,MainActivity.class);

        new Handler().postDelayed(new Runnable() {         //Handler class handles the asynchronous processing,i.e parallel threading.
            @Override
            public void run() {
                startActivity(iHome);
            }
        },3000);



    }
}