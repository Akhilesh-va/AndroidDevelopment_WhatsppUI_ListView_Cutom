package com.example.listviewpeoject2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val image = intent.getIntExtra("image" , R.drawable.pic0)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvPhone = findViewById<TextView>(R.id.tvPhone)
        val img = findViewById<CircleImageView>(R.id.profile_image)

        tvName.text = name
        tvPhone.text=phone
        img.setImageResource(image)
    }
}