package com.rezzarn.uascatatan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

//  NIM     : 10119291
//  Nama    : Rezza Ramdhani Nashrullah
//  Kelas   : IF7

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override            public void run() {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        }, 2000L);
        /*Mengatur durasi Splash Screen. 2000L = 2 detik*/
    }
}