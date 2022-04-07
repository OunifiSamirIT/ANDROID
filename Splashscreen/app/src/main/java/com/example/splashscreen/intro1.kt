package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class intro1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro1)


        val btn : Button = findViewById(R.id.btn1)
        btn.setOnClickListener {
            val intent = Intent(this, intro2:: class.java  )
            startActivity(intent)

        }
    }
}