package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letsgobtn = findViewById<Button>(R.id.next1btn)
        letsgobtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}