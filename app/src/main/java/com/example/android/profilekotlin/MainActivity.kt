package com.example.android.profilekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnProfile = findViewById<Button>(R.id.idBtnViewProfile) as Button
        btnProfile.setOnClickListener {
            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
