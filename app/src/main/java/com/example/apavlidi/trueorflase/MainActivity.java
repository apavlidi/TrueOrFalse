package com.example.apavlidi.trueorflase;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnSinglePlayer;
    Button btnOptions;
    Button btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSinglePlayer=(Button)findViewById(R.id.btnSinglePlayer);
        btnOptions=(Button)findViewById(R.id.btnOptions);
        btnAbout=(Button)findViewById(R.id.btnAbout);


        btnSinglePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),Categories.class);
                startActivity(in);
            }
        });

        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),Options.class);
                startActivity(in);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),About.class);
                startActivity(in);
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
        System.exit(1);
    }

}
