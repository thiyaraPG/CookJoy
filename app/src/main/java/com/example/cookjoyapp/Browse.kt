package com.example.cookjoyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Browse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse)

        val sribtn11 = findViewById<Button>(R.id.sribtn11)
        sribtn11.setOnClickListener {
            val intent = Intent(this,Srilankn::class.java)
            startActivity(intent)
        }
        val inbtn2 = findViewById<Button>(R.id.inbtn2)
        inbtn2.setOnClickListener {
            val intent = Intent(this,indianact::class.java)
            startActivity(intent)
        }
        val inbtn3 = findViewById<Button>(R.id.inbtn3)
        inbtn3.setOnClickListener {
            val intent = Intent(this,chineseact::class.java)
            startActivity(intent)
        }
        val inbtn4 = findViewById<Button>(R.id.inbtn4)
        inbtn4.setOnClickListener {
            val intent = Intent(this,Japanese::class.java)
            startActivity(intent)
        }

    }
}