package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class intro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro2)

        val btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this, intro3:: class.java  )
            startActivity(intent)

        }
    }
}