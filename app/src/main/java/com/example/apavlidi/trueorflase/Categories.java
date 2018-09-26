package com.example.apavlidi.trueorflase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nomad on 13/12/2015.
 */
public class Categories extends Activity {

    Button btnComputerScience;
    Button btnHistory;
    Button btnGeneral;

    static String CATEGORY_CHOOSE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        btnComputerScience = (Button) findViewById(R.id.btnComputerScience);
        btnHistory = (Button) findViewById(R.id.btnHistory);
        btnGeneral = (Button) findViewById(R.id.btnGeneral);

        btnComputerScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CATEGORY_CHOOSE = "ComputerScience";
                Intent in = new Intent(getApplicationContext(), InformationLevel.class);
                startActivity(in);
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CATEGORY_CHOOSE = "History";
                Intent in = new Intent(getApplicationContext(), InformationLevel.class);
                startActivity(in);
            }
        });

        btnGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CATEGORY_CHOOSE = "General";
                Intent in = new Intent(getApplicationContext(), InformationLevel.class);
                startActivity(in);
            }
        });
    }
}
