package com.shopping.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();


        Thread thread = new Thread() {
            public void run() {
                try {

                    sleep(3500);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(SplashScreenActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                } finally {
                    Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();

    }
}