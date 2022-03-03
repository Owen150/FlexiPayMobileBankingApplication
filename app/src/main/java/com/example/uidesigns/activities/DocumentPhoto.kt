package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidesigns.R

class DocumentPhoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document_photo)

        val intent = Intent(this@DocumentPhoto, VerificationCode::class.java)
        startActivity(intent)
    }
}