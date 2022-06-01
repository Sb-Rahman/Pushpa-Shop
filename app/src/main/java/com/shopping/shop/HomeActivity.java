package com.shopping.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    // declaring variables for images
    ImageView favourit, carttt;

    // declaring variables for textview
    TextView favourittxt, carttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        initialization();

        // setting action to send another activities
        carttxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtoCart();
            }
        });

        carttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtoCart();
            }
        });


        favourittxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTofavor();
            }
        });
        favourit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTofavor();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    private void initialization() {
        favourit = findViewById(R.id.meufav);
        carttt = findViewById(R.id.meu_cart);
        favourittxt = findViewById(R.id.meufavtxt);
        carttxt = findViewById(R.id.meu_carttxt);
    }

    private void sendtoCart() {
        Intent intent = new Intent(HomeActivity.this, CartActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    private void sendTofavor() {

        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}