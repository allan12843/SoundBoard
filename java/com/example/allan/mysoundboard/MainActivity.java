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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySound1=MediaPlayer.create(this, R.raw.medialint__nord_analog_howling_wind_storm);
        mySound2=MediaPlayer.create(this, R.raw.rutgermuller__haunting_music_1);
        mySound3=MediaPlayer.create(this, R.raw.ljudman__oska);
        mySound4=MediaPlayer.create(this, R.raw.tec_studios__walking1_gravel);
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
}
