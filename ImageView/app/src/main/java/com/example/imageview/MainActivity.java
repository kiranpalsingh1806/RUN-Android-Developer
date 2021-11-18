package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void toggleFunction(View view){
        Log.i("Info", "Button has been pressed");

        ImageView image = (ImageView) findViewById(R.id.ivCat);
        image.setImageResource(R.drawable.cat2j);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}