package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.R
import com.example.myapplication.ui.viewpager.ViewPageAdapter
import com.google.android.material.tabs.TabLayout

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = ViewPageAdapter(supportFragmentManager)

        val nxtButton = findViewById<AppCompatButton>(R.id.nextBtn)
        nxtButton.setOnClickListener {
            viewPager?.currentItem = viewPager.currentItem + 1
        }

        val skipButton = findViewById<AppCompatButton>(R.id.skipBtn)
        skipButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}