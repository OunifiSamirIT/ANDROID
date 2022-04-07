package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textclassifier.TextLinks
import android.widget.Button
import android.widget.TextView

class LOGIN : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn : TextView = findViewById(R.id.btnFGMP)

        btn.setOnClickListener {
            val intent = Intent(this, restMP1:: class.java  )
            startActivity(intent)

        }
    }
}