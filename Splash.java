package com.example.kibabii.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }
    public void start (View view){

        Intent i = new Intent(this, Neword.class);
        i.putExtra("Value1", "Re arrange this letters to make a word");


        startActivity(i);


    }

    }

