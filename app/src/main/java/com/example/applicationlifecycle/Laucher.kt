package com.example.applicationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.util.*

class Laucher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laucher)
        title="Launching...."
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
           val intent= Intent(this, MainActivity::class.java)
           startActivity(intent)
           finish()
        },3500)
    }
}