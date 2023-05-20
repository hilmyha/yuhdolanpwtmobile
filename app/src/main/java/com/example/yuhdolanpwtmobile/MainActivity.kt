package com.example.yuhdolanpwtmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.Adapter.DestinasiAdapter
import com.example.yuhdolanpwtmobile.Fragment.DestinationFragment
import com.example.yuhdolanpwtmobile.Fragment.HomeFragment
import com.example.yuhdolanpwtmobile.Fragment.ProfileFragment
import com.example.yuhdolanpwtmobile.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.navbar.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment())
                R.id.nav_destination -> replaceFragment(DestinationFragment())
                R.id.nav_profile -> replaceFragment(ProfileFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_navbar, fragment)
        fragmentTransaction.commit()
    }
}