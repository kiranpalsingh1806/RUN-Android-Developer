package com.example.nw_timestableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ListView timesTablesListView;

    public void generateTimesTables(int timesTablesNumber) {
        ArrayList<String> timesTableContent = new ArrayList<String>();

        for(int j = 1; j <= 50; j++) {
            timesTableContent.add(Integer.toString(j * timesTablesNumber));
        }

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, timesTableContent);
        timesTablesListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final SeekBar timesTablesSeekBar =  findViewById(R.id.timesTablesSeekBar);
        timesTablesListView = findViewById(R.id.timesTablesListView);

        int max = 20;
        int startingPos = 10;

        timesTablesSeekBar.setMax(max);
        timesTablesSeekBar.setProgress(startingPos);

        generateTimesTables(startingPos);

        timesTablesSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timesTablesNumber;

                if(i < min) {
                    timesTablesNumber = min;
                    timesTablesSeekBar.setProgress(min);
                } else {
                    timesTablesNumber = i;
                }

                Log.i("Seekbar value", Integer.toString(timesTablesNumber));
                generateTimesTables(timesTablesNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}