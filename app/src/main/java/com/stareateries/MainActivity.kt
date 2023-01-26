package com.stareateries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        bottomNavigationView.setOnItemSelectedListener {
                item ->
            when (item.itemId) {
                R.id.nav_dairy -> {
                    // Show DairyFragment
                    true
                }
                R.id.nav_cake -> {
                    // Show CakeFragment
                    true
                }
                R.id.nav_bread -> {
                    // Show BreadFragment
                    true
                }
                else -> false
            }
        }
    }
}