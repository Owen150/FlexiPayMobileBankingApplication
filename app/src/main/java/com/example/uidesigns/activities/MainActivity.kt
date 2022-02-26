package com.example.uidesigns.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.uidesigns.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Remove the action bar so that we can scale our image in full height
        supportActionBar?.hide()
        //Set the Duration for the splash screen
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, HomeActivityOne::class.java)
            startActivity(intent)
            //To disable navigation back to the splashscreen
            finish()
        },5000)
    }
}