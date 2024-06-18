package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)

        val btnbrowse = findViewById<Button>(R.id.btnbrowse)
        btnbrowse.setOnClickListener {
            val intent = Intent(this,Browse::class.java)
            startActivity(intent)
    }

        val profile = findViewById<Button>(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this,Profileact::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }


}}