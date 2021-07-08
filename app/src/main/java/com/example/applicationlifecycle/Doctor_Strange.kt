package com.example.applicationlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Doctor_Strange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_strange)
        title="Doctor Strange"
    }
}