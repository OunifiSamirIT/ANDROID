package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class intro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro3)

        val btn : Button = findViewById(R.id.btn2)

        btn.setOnClickListener {
            val intent = Intent(this, Register:: class.java  )
            startActivity(intent)

        }
    }
}