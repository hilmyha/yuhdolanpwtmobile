package com.example.yuhdolanpwtmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView

class SinglePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_page)

        val btnBckHome = findViewById<ImageView>(R.id.back_home)
        btnBckHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        parallaxEffect()

    }

    fun parallaxEffect() {
        val parallaxImage = findViewById<ImageView>(R.id.parallax_image)

        val scrollView = findViewById<ScrollView>(R.id.scroll_view)
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollY = scrollView.scrollY
            parallaxImage.translationY = scrollY.toFloat() / 2
        }
    }
}