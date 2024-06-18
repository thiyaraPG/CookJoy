package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chineseact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chineseact)

        val procebtn1 = findViewById<Button>(R.id.procebtn1)
        procebtn1.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }

        val procebtn2 = findViewById<Button>(R.id.procebtn2)
        procebtn2.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }

        val procebtn3 = findViewById<Button>(R.id.procebtn3)
        procebtn3.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }

        val procebtn4 = findViewById<Button>(R.id.procebtn4)
        procebtn4.setOnClickListener {
            val intent = Intent(this,Proce::class.java)
            startActivity(intent)
        }
    }
}