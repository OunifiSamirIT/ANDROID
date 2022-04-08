package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class restMP1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest_mp1)

        val btn : Button = findViewById(R.id.button3)

        btn.setOnClickListener {
            val intent = Intent(this, home:: class.java  )
            startActivity(intent)
            finish()

        }
    }
}