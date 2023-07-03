package com.example.yuhdolanpwtmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.yuhdolanpwtmobile.Fragment.FavoriteFragment
import com.example.yuhdolanpwtmobile.Fragment.HomeFragment
import com.example.yuhdolanpwtmobile.Fragment.ProfileFragment
import com.example.yuhdolanpwtmobile.Fragment.UlasanFragment
import com.example.yuhdolanpwtmobile.databinding.ActivityMainBinding

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
                R.id.nav_profile -> replaceFragment(ProfileFragment())
                R.id.nav_favorite -> replaceFragment(FavoriteFragment())
                R.id.nav_ulasan -> replaceFragment(UlasanFragment())
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