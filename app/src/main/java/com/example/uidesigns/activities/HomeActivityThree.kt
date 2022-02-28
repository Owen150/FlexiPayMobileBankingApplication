package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesigns.R

class HomeActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_three)

        supportActionBar?.hide()

        val intent = Intent(this@HomeActivityThree, MobileNumber::class.java)
        startActivity(intent)
    }
}