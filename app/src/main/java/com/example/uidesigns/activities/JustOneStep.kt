package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesigns.R

class JustOneStep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_just_one_step)

        val intent = Intent(this@JustOneStep, DocumentPhoto::class.java)
        startActivity(intent)
    }
}