package com.example.yuhdolanpwtmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView

class SinglePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_page)

        val parallaxImage = findViewById<ImageView>(R.id.parallax_image)

        val scrollView = findViewById<ScrollView>(R.id.scroll_view)
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollY = scrollView.scrollY
            parallaxImage.translationY = scrollY.toFloat() / 2
        }
    }
}