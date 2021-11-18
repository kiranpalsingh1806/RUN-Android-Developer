package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText etAmount = (EditText) findViewById(R.id.etAmount);

        double money = Double.parseDouble(etAmount.getText().toString());
        money = money * 75.66;

        String converted = String.valueOf(money);

        Toast.makeText(this, "Converted Money in Indian Rupees: " + converted , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}