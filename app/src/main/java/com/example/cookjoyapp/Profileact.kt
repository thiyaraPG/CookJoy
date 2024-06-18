package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profileact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileact)

        val homebtn = findViewById<Button>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this,Home1::class.java)
            startActivity(intent)
        }

        val logout = findViewById<Button>(R.id.logout)
        logout.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }



    }
}