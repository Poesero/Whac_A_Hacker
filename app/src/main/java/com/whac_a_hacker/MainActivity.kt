package com.whac_a_hacker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPlay = findViewById<Button>(R.id.btnPlay)

        btnPlay.setOnClickListener{
            Log.i("btn_1","click received")

            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }


}