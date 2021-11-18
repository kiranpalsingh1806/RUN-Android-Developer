package com.example.rp_higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void guessFunction(View view){

        EditText editText = (EditText) findViewById(R.id.etNumber);
        int number = Integer.parseInt(editText.getText().toString());

        if(number == randomNumber){
            Toast.makeText(this, "You guessed it right!! Try Again",Toast.LENGTH_SHORT).show();
            generateRandomNumber();
        }
        else if(number > randomNumber){
            Toast.makeText(this, "Try Lower Number", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Try Higher Number", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}