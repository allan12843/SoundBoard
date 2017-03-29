package com.example.allan.mysoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound1;
    MediaPlayer mySound2;
    MediaPlayer mySound3;
    MediaPlayer mySound4;
    MediaPlayer mySound5;
    MediaPlayer mySound6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySound1=MediaPlayer.create(this, R.raw.medialint__howlingwindstorm);
        mySound2=MediaPlayer.create(this, R.raw.rutgermuller__hauntingmusic);
        mySound3=MediaPlayer.create(this, R.raw.ljudman__oska);
        mySound4=MediaPlayer.create(this, R.raw.tecstudioswalking1gravel);
        mySound5=MediaPlayer.create(this, R.raw.Let_God_sort_em_out);
        mySound6=MediaPlayer.create(this, R.raw.Whatcountryyoufrom);
    }

    public void sound1(View view) {
        mySound1.start();
    }

    public void sound2(View view) {
        mySound2.start();
    }

    public void sound3(View view) {
        mySound3.start();
    }

    public void sound4(View view) {
        mySound4.start();
    }

    public void sound5(View view) { mySound5.start(); }

    public void sound6(View view) { mySound6.start(); }

}
