package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val next1btn = findViewById<Button>(R.id.next1btn)
        next1btn.setOnClickListener {
            val intent = Intent(this,Next2Act::class.java)
            startActivity(intent)
        }

    }
}