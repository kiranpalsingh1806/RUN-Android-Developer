package com.example.rp_numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class NumberShapes{
        int num;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(num);

            if(squareRoot - Math.floor(squareRoot) == 0){
                return true;
            } else {
                return false;
            }
        }

        public boolean isTriangular(){
            if(num < 0){
                return false;
            } else {
                int sum = 0;

                for(int n = 1; sum <= num; n++){
                    sum += n;
                    if(sum == num){
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public void clickFunction(View view){

        Log.i("Info", "Button pressed");
        String message;

        EditText editText = (EditText) findViewById(R.id.etNumber);
        if(editText.getText().toString().isEmpty()){
            message = "Amanpal, Please enter a number";
        }
        else {

            NumberShapes num1 = new NumberShapes();

            num1.num = Integer.parseInt(editText.getText().toString());


            if (num1.isSquare() && num1.isTriangular()) {
                message = editText.getText().toString() + " is both square and triangular number.";
            } else if (num1.isSquare()) {
                message = editText.getText().toString() + " is a square number.";
            } else if (num1.isTriangular()) {
                message = editText.getText().toString() + " is a triangular number.";
            } else {
                message = editText.getText().toString() + " is neither square nor triangular number.";
            }
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}