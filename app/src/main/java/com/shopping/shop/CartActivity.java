package com.shopping.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CartActivity extends AppCompatActivity {
    //declaring variables for images
    ImageView carttofav, sendtoback, cartohome;

    //declaring variables for textviews
    TextView carttofavtxt, carttohometxt, orderkoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        getSupportActionBar().hide();

        Toast.makeText(this, "Your cart items", Toast.LENGTH_LONG).show();


        //initialization of variables
        carttofav = findViewById(R.id.carttofav);
        sendtoback = findViewById(R.id.sendtobacko);
        cartohome = findViewById(R.id.carttohome);
        carttohometxt = findViewById(R.id.carttohometxt);
        carttofavtxt = findViewById(R.id.carttofavtxt);
        orderkoro = findViewById(R.id.orderkoro);


        //setting action
        orderkoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttogorder = new Intent(CartActivity.this, OrderActivity.class);
                startActivity(intenttogorder);
            }
        });

        carttofav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();
            }
        });
        carttofavtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();
            }
        });
        carttohometxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });
        cartohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

        sendtoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();


    }


    private void goToMain() {
        Intent intent = new Intent(CartActivity.this, MainActivity.class);

        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }

    private void goToHome() {
        Intent intent = new Intent(CartActivity.this, HomeActivity.class);

        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}