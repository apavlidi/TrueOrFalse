package com.example.apavlidi.trueorflase;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by nomad on 6/12/2015.
 */
public class WinLevel extends Activity{

    Button btnNextLevel;
    Button btnMenu;

    TextView txtPassedLevel;
    TextView txtCorrectAnswers;

    static MediaPlayer winSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winlevel);

        if (Options.MUSIC_ON) {
            winSound = MediaPlayer.create(this, R.raw.win);
            winSound.start();
        }

        btnNextLevel=(Button)findViewById(R.id.btnNextLevel);
        btnMenu=(Button)findViewById(R.id.btnMenuWin);
        txtPassedLevel=(TextView)findViewById(R.id.txtPassedLevel);
        txtCorrectAnswers=(TextView)findViewById(R.id.txtCorrectAnswers);

        txtPassedLevel.setText(txtPassedLevel.getText() + Integer.toString(Quiz.CURRENT_LEVEL));
        txtCorrectAnswers.setText(txtCorrectAnswers.getText() + Integer.toString(Quiz.CORRECT_ANSWERS) + "/" + Integer.toString(Quiz.QUESTIONS_ASKED));

        btnNextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quiz.CURRENT_LEVEL++;
                Quiz.CORRECT_ANSWERS_REQUIRED++;
                if (Quiz.LIFES > 1)
                    Quiz.LIFES--;
                if (Options.MUSIC_ON)
                    winSound.stop();
                Intent in = new Intent(getApplicationContext(), InformationLevel.class);
                startActivity(in);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });
    }

    @Override
    public void onBackPressed() {
        confirmExitDialog();
    }

    private void confirmExitDialog(){
        AlertDialog.Builder alertDlg=new AlertDialog.Builder(this);
        alertDlg.setMessage("Are you sure you want to exit?");
        alertDlg.setCancelable(false);

        alertDlg.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("Exit", true);
                startActivity(intent);
            }
        });

        alertDlg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDlg.create().show();
    }


}
