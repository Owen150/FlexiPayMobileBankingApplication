package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesigns.R

class VerificationCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)

        val intent = Intent(this@VerificationCode, LoginActivity::class.java)
        startActivity(intent)
    }
}