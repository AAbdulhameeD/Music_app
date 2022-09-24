package com.example.android.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView playListTextView = (TextView) findViewById(R.id.Play_list_TextView);
        playListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, PlayList.class);
                startActivity(playListIntent);
            }
        });
        playListTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    playListTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    playListTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //purchase button
        final TextView paymentTextView = (TextView) findViewById(R.id.purchase_TextView);
        paymentTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MainActivity.this, paymentAvtivity.class);
                startActivity(playListIntent);
            }
        });
        paymentTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    paymentTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    paymentTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });

    }

}
