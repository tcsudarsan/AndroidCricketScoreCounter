package com.example.sudarsan.criccounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TeamA extends AppCompatActivity {
public int score=0;
    public int balls=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    public void addZero(){
        score=score+0;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addOne(View v){
        score=score+1;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addTwo(View view){
        score=score+2;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addThree(View v){
        score=score+3;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addFour(View v){
        score=score+4;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addSix(View v){
        score=score+6;
        balls=balls+1;
        displayForTeamA(score);
    }
    public void addExtra(View v){
        score=score+1;
        displayForTeamA(score);
    }
    public void displayForTeamA(int score) {
        EditText EditScoreA = (EditText) findViewById(R.id.scoreA);
        EditScoreA.setText(String.valueOf(score));
    }
    public void AddBalls(int balls){
        EditText EditBalls=(EditText)findViewById(R.id.DisplayBalls);
        EditBalls.setText(String.valueOf(balls));
    }
        public void EnterTeamB(View view){
            Intent k=new Intent(this, TeamB.class);
            startActivity(k);}



}

