package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.uidesigns.R

class HomeActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_one)

        supportActionBar?.hide()

        val intent = Intent(this@HomeActivityOne, HomeActivityTwo::class.java)
        startActivity(intent)
    }
}