package com.example.nw_showhideuielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myNameTextView;

    public void showClickButton(View view) {
        myNameTextView.setVisibility(myNameTextView.VISIBLE);
    }

    public void hideClickButton(View view) {
        myNameTextView.setVisibility(myNameTextView.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNameTextView = (TextView) findViewById(R.id.myNameTextView);
    }
}