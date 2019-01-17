package com.example.kibabii.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Neword extends Activity {
TextView textview, textviewb;
Button button;
EditText edittext;
ImageView imageview1;
String word, answer,value1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neword);
        textview= findViewById(R.id.textview1);
        textviewb= findViewById(R.id.textview2);
        button= findViewById(R.id.button1);
        edittext = findViewById(R.id.edittext1);
        imageview1= findViewById(R.id.imagecorrect);



    }
    public void add (View view) {
       answer = edittext.getText().toString();
        Toast.makeText(this, answer, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Home.class);
        i.putExtra("Value1", answer);
        startActivity(i);


        //textviewb.setText("wrong");


    }

    public void cheker(){
        //ord.trim().toUpperCase()==word1
        if (edittext.getText().toString().toUpperCase().trim().equals("BOY")){
           // Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            textviewb.setVisibility(View.VISIBLE);
            imageview1.setVisibility(View.VISIBLE);
            textview.setText("TYPE NEXT WORD");
            word = edittext.getText().toString();

            //textviewb.setVisibility(View.INVISIBLE);
            //imageview1.setVisibility(View.INVISIBLE);


        }
        else {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
            textviewb.setText("wrong");
            textviewb.setVisibility(View.VISIBLE);

            textviewb.setVisibility(View.INVISIBLE);

            textviewb.setText("Try again");
        }
    }


    }

