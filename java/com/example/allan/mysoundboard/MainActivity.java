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
    MediaPlayer mySound6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySound1=MediaPlayer.create(this, R.raw.medialint__howlingwindstorm);
        mySound2=MediaPlayer.create(this, R.raw.rutgermuller__hauntingmusic);
        mySound3=MediaPlayer.create(this, R.raw.ljudman__oska);
        mySound4=MediaPlayer.create(this, R.raw.tecstudioswalking1gravel);
        mySound6=MediaPlayer.create(this, R.raw.whatcountryyoufrom);
    }

    public void sound1(View view) {mySound1.start();}

    public void sound2(View view) {
        mySound2.start();
    }

    public void sound3(View view) {
        mySound3.start();
    }

    public void sound4(View view) {
        mySound4.start();
    }

    public void sound6(View view) { mySound6.start(); }

    public void stop(View view) {
        mySound1.release();
        mySound2.release();
        mySound3.release();
        mySound4.release();
        mySound6.release();
    }

}
