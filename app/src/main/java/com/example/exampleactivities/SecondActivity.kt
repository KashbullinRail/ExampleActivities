package com.example.exampleactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity(R.layout.activity_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tvDoubleHello = findViewById<TextView>(R.id.tvDoubleHello)
        tvDoubleHello.setOnClickListener{
            setResult(Activity.RESULT_OK, Intent().apply {
                putExtra("result", "tvDoubleHello.text")
            }
            )
            finish()
        }
    }
}