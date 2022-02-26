package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesigns.R

class HomeActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_two)

        supportActionBar?.hide()


        val intent = Intent(this@HomeActivityTwo, HomeActivityThree::class.java)
        startActivity(intent)
    }
}