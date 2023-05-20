package com.example.yuhdolanpwtmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.yuhdolanpwtmobile.Fragment.ProfileFragment

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnBckProfile = findViewById<ImageView>(R.id.back_profile)
        btnBckProfile.setOnClickListener {
            val intent = Intent(this, ProfileFragment::class.java)
            startActivity(intent)
        }
    }
}