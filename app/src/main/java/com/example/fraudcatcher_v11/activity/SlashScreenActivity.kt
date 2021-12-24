package com.example.fraudcatcher_v11.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.fraudcatcher_v11.R

class SlashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash_screen)

        // intent mengarah ke menu login
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(this@SlashScreenActivity,
                    LoginActivity::class.java)
            )
            finish()
        }, 3000)
    }
}