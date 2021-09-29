package com.example.homeworkk1.ui.activity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworkk1.R
import com.example.homeworkk1.ui.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.itemIconTintList = null
        viewpager2.adapter = ViewPagerAdapter(this)
        viewpager2.isUserInputEnabled = false

        navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    viewpager2.currentItem = 0
                }
                R.id.navigation_dashboard -> {
                    viewpager2.currentItem = 1
                }
                R.id.navigation_notifications -> {
                    viewpager2.currentItem = 2
                }
                else -> viewpager2.currentItem = 0
            }
            true
        }
    }


}