package com.example.android.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class PlayList extends AppCompatActivity {

    public String songText = ""; //string to show the song name
    public static final String KEY_SONG = "songText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        // the songs code repeated
        //song number 1
        final TextView firstSongTextView = (TextView) findViewById(R.id.textView_song1_id);
        firstSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) firstSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        firstSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    firstSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    firstSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 2
        final TextView secondSongTextView = (TextView) findViewById(R.id.textView_song2_id);
        secondSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) secondSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        secondSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    secondSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    secondSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
//song number 3
        final TextView thirdSongTextView = (TextView) findViewById(R.id.textView_song3_id);
        thirdSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) thirdSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        thirdSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    thirdSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    thirdSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 4
        final TextView fourthSongTextView = (TextView) findViewById(R.id.textView_song4_id);
        fourthSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) fourthSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        fourthSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    fourthSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    fourthSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 5
        final TextView fifthSongTextView = (TextView) findViewById(R.id.textView_song5_id);
        fifthSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) fifthSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        fifthSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    fifthSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    fifthSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 6
        final TextView sixthSongTextView = (TextView) findViewById(R.id.textView_song6_id);
        sixthSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) sixthSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        sixthSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    sixthSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    sixthSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 7
        final TextView seventhSongTextView = (TextView) findViewById(R.id.textView_song7_id);
        seventhSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) seventhSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        seventhSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    seventhSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    seventhSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 8
        final TextView eighthSongTextView = (TextView) findViewById(R.id.textView_song8_id);
        eighthSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) eighthSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        eighthSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    eighthSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    eighthSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 9
        final TextView ninethSongTextView = (TextView) findViewById(R.id.textView_song9_id);
        ninethSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) ninethSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        ninethSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    ninethSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    ninethSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });
        //song number 10
        final TextView tenthSongTextView = (TextView) findViewById(R.id.textView_song10_id);
        tenthSongTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                songText = (String) tenthSongTextView.getText();
                Intent playListIntent = new Intent(PlayList.this, PlayMusic.class);
                playListIntent.putExtra(KEY_SONG, songText);
                startActivity(playListIntent);
            }
        });
        tenthSongTextView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    //Button Pressed
                    tenthSongTextView.setBackgroundColor(Color.parseColor("#F2C84D"));
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //finger was lifted
                    tenthSongTextView.setBackgroundColor(Color.parseColor("#3C3E3C"));
                }
                return false;
            }
        });

    }
}
