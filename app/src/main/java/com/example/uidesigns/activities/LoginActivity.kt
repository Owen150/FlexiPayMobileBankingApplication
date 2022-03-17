package com.example.uidesigns.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.uidesigns.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.btm_nav)

        val navController = Navigation.findNavController(this, R.id.host_fragment)


    }
}