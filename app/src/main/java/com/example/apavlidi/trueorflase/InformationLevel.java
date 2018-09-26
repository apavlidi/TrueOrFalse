package com.example.apavlidi.trueorflase;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nomad on 4/12/2015.
 */
public class InformationLevel extends Activity {

    Button btnStart;
    TextView txtQuestions;
    TextView txtLifes;
    static ArrayList<Question> ARRAY_Q=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_layout);

        btnStart=(Button)findViewById(R.id.btnStart);
        txtQuestions=(TextView)findViewById(R.id.txtQuestions);
        txtLifes=(TextView)findViewById(R.id.txtLifes);

        txtQuestions.setText(txtQuestions.getText() +  Integer.toString(Quiz.CORRECT_ANSWERS_REQUIRED));
        txtLifes.setText(txtLifes.getText() + Integer.toString(Quiz.LIFES));
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARRAY_Q=Quiz.ARRAY_Q;
                Quiz.QUESTIONS_ASKED=0;
                Quiz.CORRECT_ANSWERS=0;
                Quiz.FOLDS=3;
                Intent in=new Intent(getApplicationContext(),Quiz.class);
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
