package com.example.applicationlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Iron_man : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iron_man)
        title="Iron Man"
    }
}