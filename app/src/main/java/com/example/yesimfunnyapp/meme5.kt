package com.example.yesimfunnyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var tvmeme5prev: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvmeme5prev =findViewById(R.id.tvmeme5prev)
        tvmeme5prev.setOnClickListener {
            val intent = Intent(this,Meme4::class.java)
            startActivity(intent)
        }
    }
}

