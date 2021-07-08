package com.example.applicationlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Black_Widow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_black_widow)
        title="Black Widow"
    }
}