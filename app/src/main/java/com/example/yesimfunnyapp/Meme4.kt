package com.example.yesimfunnyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme4 : AppCompatActivity() {

    lateinit var tvprev4: TextView
    lateinit var tvnext4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvprev4 =findViewById(R.id.tvprev4)
        tvprev4.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
        tvnext4 =findViewById(R.id.tvnext4)
        tvnext4.setOnClickListener {
            val intent = Intent(this,meme5::class.java)
            startActivity(intent)
        }

    }
}