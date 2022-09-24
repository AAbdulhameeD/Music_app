package com.example.android.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class paymentAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_avtivity);
        final Button purchaseButton = (Button) findViewById(R.id.purchase_button);
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //purchasing ..

            }
        });
        //here by clicking the the home button the app switch to mainActivity
        final TextView HomeTextView = (TextView) findViewById(R.id.home_TextView);
        HomeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivityIntent = new Intent(paymentAvtivity.this, MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });
        HomeTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    HomeTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    HomeTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
    }
}
