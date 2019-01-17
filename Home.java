package com.example.kibabii.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Home extends AppCompatActivity {
TextView textview, textviewb;
Button button;
EditText edittext;
ImageView imageview1, imageview2;
String value1, value2, answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Bundle extras = getIntent().getExtras();
        value1 = extras.getString("Value1");
        value2=value1;
        textview= findViewById(R.id.textview1);
        textviewb= findViewById(R.id.textview2);
        button= findViewById(R.id.button1);
        edittext = findViewById(R.id.edittext1);
        imageview1= findViewById(R.id.imagecorrect);
        imageview2= findViewById(R.id.imagewrong);
        textview.setText("BYO");
        getword();


    }
    public void played (View view) {
        String answer1 = new String(edittext.getText().toString());
        //answer = edittext.getText().toString();

        String answer2= new String(answer1.toUpperCase());
        answer= new String(answer2.trim());


        //textviewb.setText("wrong");
       // Toast.makeText(this, answer, Toast.LENGTH_SHORT).show();
        cheker();
    }
    public void getword (){


        if (value1.trim().equals("Re arrange this letters to make a word")){
            Toast.makeText(getApplicationContext(),"Word is:\n First value: "+value1, Toast.LENGTH_LONG).show();

        }

        else {
                      jumbleMe(value1);


        }
    }

    private void jumbleMe(String word) {
        ArrayList<Character> al = new ArrayList<Character>();
        for (int i = 0; i < value1.length(); i++) {
            al.add(word.charAt(i));
        }
        Collections.shuffle(al);
        String result = "";
        for (Character character : al) {
            result += character;
        }

        textview.setText(result);
    }
    public void cheker(){
        //ord.trim().toUpperCase()==word1
        if (edittext.getText().toString().toUpperCase().trim().equals(value2.toUpperCase().trim())){
           // Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            textviewb.setVisibility(View.VISIBLE);
            imageview1.setVisibility(View.VISIBLE);
            textview.setText("TYPE NEXT WORD");

            Intent i = new Intent(this, Neword.class);
            startActivity(i);


            //textviewb.setVisibility(View.INVISIBLE);
            //imageview1.setVisibility(View.INVISIBLE);


        }
        else {
            Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
            textviewb.setText("wrong");
            textviewb.setVisibility(View.VISIBLE);
            imageview2.setVisibility(View.VISIBLE);
            textviewb.setVisibility(View.INVISIBLE);
            imageview2.setVisibility(View.INVISIBLE);
            textviewb.setText("Try again");
        }


    }


    }

