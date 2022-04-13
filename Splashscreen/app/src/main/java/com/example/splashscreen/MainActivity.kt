package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.splashscreen.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewpager2= findViewById<ViewPager2>(R.id.view_pager_2)
        // val tablayout= findViewById<TabLayout>(R.id.tab_layout)


        viewpager2.adapter= ViewPagerAdapter(this.supportFragmentManager,lifecycle)





    }
}