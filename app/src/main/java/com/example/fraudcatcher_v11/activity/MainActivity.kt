package com.example.fraudcatcher_v11.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fraudcatcher_v11.R
import com.example.fraudcatcher_v11.fragment.HomeFragment
import com.example.fraudcatcher_v11.fragment.MoreFragment
import com.example.fraudcatcher_v11.fragment.ScheduleFragment
import com.example.fraudcatcher_v11.fragment.StatusFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi
        val frag_home = HomeFragment()
        val frag_sche = ScheduleFragment()
        val frag_stat = StatusFragment()
        val frag_more = MoreFragment()

        //menentukan fragment utama saat aplikasi dijalankan
        currentFragment(frag_home)

        //switch antar fragment
        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.mhome -> currentFragment(frag_home)
                R.id.mschedule -> currentFragment(frag_sche)
                R.id.mstatus -> currentFragment(frag_stat)
                R.id.mmore -> currentFragment(frag_more)
            }
            true
        }
    }

    // function untuk menentukan fragment yang aktif
    private fun currentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_nav, fragment) // frame nav => id dari frame di activity main
            commit()
        }
    }
}