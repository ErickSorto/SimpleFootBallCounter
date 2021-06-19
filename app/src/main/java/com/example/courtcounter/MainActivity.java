package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore = 0;
    private int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_teamA(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);

        teamAScore.setText(String.valueOf(score));
    }

    public void add_teamB(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_b_score);
        teamAScore.setText(String.valueOf(score));
    }


    public void updateScoreBTouchDown(View view){
        teamBScore = teamBScore + 6;
        add_teamB(teamBScore);
    }

    public void updateScoreB3Point(View view){
        teamBScore = teamBScore + 3;
        add_teamB(teamBScore);
    }

    public void updateScoreB2Point(View view){
        teamBScore = teamBScore + 2;
        add_teamB(teamBScore);
    }

    public void updateScoreB1Point(View view){
        teamBScore = teamBScore + 1;
        add_teamB(teamBScore);
    }
    public void updateScoreTouchDown(View view){
        teamAScore = teamAScore + 6;
        add_teamA(teamAScore);
    }

    public void updateScore3Point(View view){
        teamAScore = teamAScore + 3;
        add_teamA(teamAScore);
    }

    public void updateScore2Point(View view){
        teamAScore = teamAScore + 2;
        add_teamA(teamAScore);
    }

    public void updateScore1Point(View view){
        teamAScore = teamAScore + 1;
        add_teamA(teamAScore);
    }

    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        add_teamA(teamAScore);
        add_teamB(teamBScore);
    }


}