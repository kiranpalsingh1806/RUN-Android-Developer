package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", "kiranpalsingh").apply();

        String username = sharedPreferences.getString("username", "");
        Log.i("This is the username", username);

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Kiran");
        friends.add("Aman");
        friends.add("John");

        try {
            sharedPreferences.edit().putString("friends", ObjectSerializer.serialize(friends)).apply();
            Log.i("Friends", ObjectSerializer.serialize(friends));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> newFriends = new ArrayList<>();
        try {
            newFriends = (ArrayList<String>) ObjectSerializer.deserialize(
                    sharedPreferences.getString("friends",ObjectSerializer.serialize(new ArrayList<String>())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.i("New Friends", newFriends.toString());
    }
}

