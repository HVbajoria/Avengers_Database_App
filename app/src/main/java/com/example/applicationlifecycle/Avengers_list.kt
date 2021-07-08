package com.example.applicationlifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Avengers_list : AppCompatActivity() {
    lateinit var blackpanther: Button
    lateinit var blackwidow: Button
    lateinit var captainamerica: Button
    lateinit var doctorstrange: Button
    lateinit var ironman: Button
    lateinit var scarletwitch: Button
    lateinit var spiderman: Button
    lateinit var thehulk:Button
    lateinit var thethor: Button
    lateinit var thevision: Button
    lateinit var logout2: Button
    lateinit var logout: Button
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers_list)
        title = "Your Favourite Avengers"
        logout= findViewById(R.id.logout)
        logout2=findViewById(R.id.logout2)
        blackpanther= findViewById(R.id.black_pantherbutton)
        blackwidow= findViewById(R.id.black_widowbutton)
        captainamerica= findViewById(R.id.captain_americabutton)
        doctorstrange= findViewById(R.id.doctor_strangebutton)
        ironman= findViewById(R.id.iron_manbutton)
        scarletwitch=findViewById(R.id.scarlet_witchbutton)
        spiderman=findViewById(R.id.spider_manbuttton)
        thehulk=findViewById(R.id.hulkbutton)
        thethor= findViewById(R.id.thorbutton)
        thevision=findViewById(R.id.visionbutton)
        sharedPreferences=getSharedPreferences("Avengers Preferences", Context.MODE_PRIVATE)
        logout.setOnClickListener {
            sharedPreferences.edit().putBoolean("isLoggedIn", false).apply()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        logout2.setOnClickListener{
            sharedPreferences.edit().putBoolean("isLoggedIn",false).apply()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        blackpanther.setOnClickListener{
            startActivity(Intent(this, Black_panther::class.java))
        }
        blackwidow.setOnClickListener{
            startActivity(Intent(this, Black_Widow::class.java))
        }
        captainamerica.setOnClickListener{
            startActivity(Intent(this, Captain_america::class.java))
        }
        doctorstrange.setOnClickListener{
            startActivity((Intent(this, Doctor_Strange::class.java)))
        }
        ironman.setOnClickListener{
            startActivity(Intent(this, Iron_man::class.java))
        }
        scarletwitch.setOnClickListener{
            startActivity(Intent(this, Scarlet_witch::class.java))
        }
        spiderman.setOnClickListener{
            startActivity(Intent(this, Spider_Man::class.java))
        }
        thehulk.setOnClickListener{
            startActivity(Intent(this, The_hulk::class.java))
        }
        thethor.setOnClickListener{
            startActivity(Intent(this, Thor::class.java))
        }
        thevision.setOnClickListener{
            startActivity(Intent(this, Vision::class.java))
        }
    }
}