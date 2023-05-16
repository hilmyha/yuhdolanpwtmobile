package com.example.yuhdolanpwtmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuhdolanpwtmobile.Adapter.DestinasiAdapter
import com.example.yuhdolanpwtmobile.Fragment.DestinationFragment
import com.example.yuhdolanpwtmobile.Fragment.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var rvDestinasi: RecyclerView
    private lateinit var adapter: DestinasiAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val destinationFragment = DestinationFragment()

        val navbar = findViewById<BottomNavigationView>(R.id.navbar)

        makeCurrentFragment(homeFragment)

        navbar.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.nav_home -> makeCurrentFragment(homeFragment)
                R.id.nav_destination -> makeCurrentFragment(destinationFragment)
            }
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_navbar, fragment)
            commit()
        }
    }
}