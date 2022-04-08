package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn : Button = findViewById(R.id.btnsingup)

        btn.setOnClickListener {
            val intent = Intent(this, LOGIN:: class.java  )
            startActivity(intent)
            finish()

        }
    }
}