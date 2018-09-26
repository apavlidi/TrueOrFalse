package com.example.apavlidi.trueorflase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

/**
 * Created by nomad on 9/12/2015.
 */



public class Options extends Activity{

    static boolean MUSIC_ON=true;
    ToggleButton tglMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        tglMusic=(ToggleButton)findViewById(R.id.tglMusic);


        tglMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MUSIC_ON)
                    MUSIC_ON=false;
                else
                    MUSIC_ON=true;
            }
        });



    }
}
