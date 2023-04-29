package com.example.yesimfunnyapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemeActivity2 : AppCompatActivity() {

    lateinit var tvmeme2prev: TextView
    lateinit var tvmeme2next: TextView

//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meme2)
        tvmeme2prev = findViewById(R.id.tvmeme2prev)
        tvmeme2prev.setOnClickListener {
            var intent = Intent(this, MemeActivity1::class.java)
            startActivity(intent)
        }
        tvmeme2next= findViewById(R.id.tvmeme2next)
        tvmeme2next.setOnClickListener {
            var intent = Intent(this, Meme3::class.java)
            startActivity(intent)
        }
    }
}