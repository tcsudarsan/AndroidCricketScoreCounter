package com.example.sudarsan.criccounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class EnterOvers extends AppCompatActivity {
    public int overs=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_overs);
    }
    public void add5(View v){
        overs=overs+5;
        displayOvers(overs);
    }
    public void add10(View v){
        overs=overs+10;
        displayOvers(overs);
    }
    public void add15(View v){
        overs=overs+15;
        displayOvers(overs);
    }
    public void add20(View v){
        overs=overs+20;
        displayOvers(overs);
    }
    public void EnterScorePage(View view){
        Intent j=new Intent(this, TeamA.class);
        startActivity(j);}
   // final EditText overs=(EditText)findViewById(R.id.EditOvers);
   public void displayOvers(int overs) {
       EditText EditOvers = (EditText) findViewById(R.id.ETEnter);
       EditOvers.setText(String.valueOf(overs));
   }
      }
