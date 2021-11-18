package com.example.intentsdemo1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.urlText)
        val btnS = findViewById<Button>(R.id.btnNav);

        btnS.setOnClickListener {
            var url:String = edit.text.toString()
            val intent = Intent (Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}