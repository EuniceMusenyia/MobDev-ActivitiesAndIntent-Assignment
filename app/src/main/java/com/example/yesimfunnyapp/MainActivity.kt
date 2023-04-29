package com.example.yesimfunnyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  tvnextmain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnextmain =findViewById(R.id.tvnextmain)
        tvnextmain.setOnClickListener {
            val intent = Intent(this,MemeActivity1::class.java)
            startActivity(intent)
        }
    }
}