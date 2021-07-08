package com.example.applicationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class logged_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)
         title="Loading...."
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
           val intent= Intent(this, Avengers_list::class.java)
           startActivity(intent)
           finish()},3400)
   }
}