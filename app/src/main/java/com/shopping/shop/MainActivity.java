package com.shopping.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaring variables for images

    ImageView back_arrow, menu_cart, menu_homeo;

    //Declaring variables for textViews

    TextView decreseItems, increaseItems, showItemCount, menu_homeotxt, menu_carttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //initializations
        back_arrow = findViewById(R.id.back_arrow);
        decreseItems = findViewById(R.id.decreaseItem);
        increaseItems = findViewById(R.id.increaseItem);
        showItemCount = findViewById(R.id.itemsCount);
        menu_cart = findViewById(R.id.menu_cart);
        menu_homeo = findViewById(R.id.homeo);
        menu_homeotxt = findViewById(R.id.homeotxt);


        //calling action

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }


        });

        increaseItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "increase item clicked", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }

        });


        menu_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
                finish();

            }
        });
//        menu_carttxt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, CartActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        menu_homeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maintohome();
            }
        });
        menu_homeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maintohome();
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    private void maintohome() {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}