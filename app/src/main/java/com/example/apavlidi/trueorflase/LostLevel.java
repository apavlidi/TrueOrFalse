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
 * Created by nomad on 7/12/2015.
 */
public class LostLevel extends Activity{
    TextView txtCorrectAnswers;
    Button btnRestartLevel;
    Button btnMenu;

    static MediaPlayer lostSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lostlevel);
        if (Options.MUSIC_ON) {
            lostSound = MediaPlayer.create(this, R.raw.lose);
            lostSound.start();
        }
        
        txtCorrectAnswers=(TextView)findViewById(R.id.txtCorrectAnswers);
        btnRestartLevel=(Button)findViewById(R.id.btnRestartLevel);
        btnMenu=(Button)findViewById(R.id.btnMenuLost);

        txtCorrectAnswers.setText(txtCorrectAnswers.getText() + Integer.toString(Quiz.CORRECT_ANSWERS) + "/" + Integer.toString(Quiz.CORRECT_ANSWERS_REQUIRED));
        btnRestartLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Options.MUSIC_ON)
                    lostSound.stop();
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
