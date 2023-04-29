package com.example.yesimfunnyapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme3: AppCompatActivity() {

    lateinit var tvprev: TextView
    lateinit var tvnext: TextView

//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvprev = findViewById(R.id.tvprev)
        tvprev.setOnClickListener {
            var intent = Intent(this, MemeActivity2::class.java)
            startActivity(intent)
        }
        tvnext= findViewById(R.id.tvnext)
        tvnext.setOnClickListener {
            var intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
    }
}