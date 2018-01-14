package com.example.android.americanfootball;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {

    int TeamAScore = 0;
    int TeamBScore =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void addTeamA6points(View view){
        TeamAScore += 6;
        displayForTeamA(TeamAScore);
    }

    public void addTeamA3points(View view){
        TeamAScore += 3;
        displayForTeamA(TeamAScore);
    }

    public void addTeamA2points(View view){
        TeamAScore += 2;
        displayForTeamA(TeamAScore);
    }

    public void addTeamB6points(View view){
        TeamBScore += 6;
        displayForTeamB(TeamBScore);
    }

    public void addTeamB3points(View view){
        TeamBScore += 3;
        displayForTeamB(TeamBScore);
    }

    public void addTeamB2points(View view){
        TeamBScore += 2;
        displayForTeamB(TeamBScore);
    }

    public void ResetTheGame (View view){
        TeamAScore = 0;
        TeamBScore = 0;
        displayForTeamA(TeamAScore);
        displayForTeamB(TeamBScore);
    }
    public void displayForTeamA(int score){
        TextView textView = findViewById(R.id.TeamAScore_textview);
        textView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView textView = findViewById(R.id.TeamBScore_textview);
        textView.setText(String.valueOf(score));
    }
}
