package com.example.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Song extends AppCompatActivity {

    private Button b11;
    private Button b12;
    MediaPlayer mp;
    MediaPlayer mp2;
    private Boolean click1=false;
    private Boolean click2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        mp2 = MediaPlayer.create(Song.this,R.raw.wakhra);
        mp = MediaPlayer.create(Song.this,R.raw.wang);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b12.isPressed()){
                    mp2.stop();
                    mp.start();
                }
                else{
                    mp.start();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b12.isPressed()){
                    mp.stop();
                    mp2.start();
                }
                else{
                    mp2.start();
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        mp.stop();
        mp2.stop();
    }

}