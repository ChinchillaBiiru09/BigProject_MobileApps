package com.example.fraudcatcher_v11.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.fraudcatcher_v11.R

class ChangeProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_profile)

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                android.R.id.home ->{
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }

        fun finish() {
            super.finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}