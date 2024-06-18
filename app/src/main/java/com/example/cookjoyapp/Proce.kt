package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Proce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proce)

        val homebtn = findViewById<Button>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this,Home1::class.java)
            startActivity(intent)
        }

        val probtn = findViewById<Button>(R.id.probtn)
        probtn.setOnClickListener {
            val intent = Intent(this,Profileact::class.java)
            startActivity(intent)
        }
    }
}