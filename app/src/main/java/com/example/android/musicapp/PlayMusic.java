package com.example.android.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.android.musicapp.PlayList.KEY_SONG;

public class PlayMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString(KEY_SONG);
        TextView currentSongTextView = (TextView) findViewById(R.id.currentSong);
        currentSongTextView.setText(easyPuzzle);
        //actions for the buttons to get a good view also the code is repeated for each button
        // rewind button
        final ImageButton rewindButton = (ImageButton) findViewById(R.id.button_rewind_id);
        rewindButton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    rewindButton.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    rewindButton.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        // pause button
        final ImageButton pauseButton = (ImageButton) findViewById(R.id.button_pause_id);
        pauseButton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    pauseButton.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    pauseButton.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        // play button
        final ImageButton playButton = (ImageButton) findViewById(R.id.button_play_id);
        playButton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    playButton.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    playButton.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //fast forward button
        final ImageButton fastForwardButton = (ImageButton) findViewById(R.id.button_fast_forward_id);
        fastForwardButton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    fastForwardButton.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    fastForwardButton.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //fast forward button
        final ImageButton favoriteButton = (ImageButton) findViewById(R.id.button_ic_favorite_black_id);
        favoriteButton.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    favoriteButton.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    favoriteButton.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //here by clicking the the home button the app switch to mainActivity
        final TextView HomeTextView = (TextView) findViewById(R.id.home_TextView);
        HomeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivityIntent = new Intent(PlayMusic.this, MainActivity.class);
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
