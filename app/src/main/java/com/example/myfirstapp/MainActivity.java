package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.media.MediaPlayer;
import android.content.Context;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lmp);
        mediaPlayer.start();
    }
}
