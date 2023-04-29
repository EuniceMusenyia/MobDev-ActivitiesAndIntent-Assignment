package com.example.yesimfunnyapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity1 : AppCompatActivity() {

    lateinit var tvprevmeme1: TextView
    lateinit var tvnextmeme1: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meme1)
        tvprevmeme1 = findViewById(R.id.tvprevmeme1)
        tvprevmeme1.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        tvnextmeme1 = findViewById(R.id.tvnextmeme1)
        tvnextmeme1.setOnClickListener {
            var intent = Intent(this, MemeActivity2::class.java)
            startActivity(intent)
        }
    }
}