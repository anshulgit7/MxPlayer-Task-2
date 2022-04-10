package com.example.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;

public class Gallery extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mp = MediaPlayer.create(Gallery.this,R.raw.bgmusic);
        mp.setLooping(true);
        mp.start();
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        mp.stop();
    }
}