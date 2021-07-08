package com.example.applicationlifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var mobile: EditText
    lateinit var password: EditText
    lateinit var button: Button
    lateinit var forgot: TextView
    lateinit var register: TextView
    val phone = mutableListOf("0123456789")
    val passwords= mutableListOf("HVBAJORIA")
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences= getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val islogged= sharedPreferences.getBoolean("isLoggedIn",false)
        if(islogged) {
            startActivity(Intent(this, logged_in::class.java))
            finish()
        }
        title= "Welcome !!"
        button = findViewById(R.id.button)
        forgot=findViewById(R.id.forgot)
        register= findViewById(R.id.register)
        button.setOnClickListener {
            mobile = findViewById(R.id.txt_username)
            password= findViewById(R.id.txt_password)

            val user = mobile.text.toString()
            val p = password.text.toString()
            if (phone.contains(user) && (passwords.contains(p))) {
                save()
                val intent = Intent(this, logged_in::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_LONG).show()
            }
        }
        register.setOnClickListener {
            mobile = findViewById(R.id.txt_username)
            password= findViewById(R.id.txt_password)

            val user = mobile.text.toString()
            val p = password.text.toString()
            if (phone.contains(user) && (passwords.contains(p))) {
                Toast.makeText(this, "User Exists", Toast.LENGTH_LONG).show()
            } else {
                phone.add(user)
                passwords.add(p)
                Toast.makeText(this, "User Registered", Toast.LENGTH_LONG).show()
            }
        }
       forgot.setOnClickListener {
            mobile = findViewById(R.id.txt_username)
            password= findViewById(R.id.txt_password)

            val user = mobile.text.toString()
           var a="User Not Found"
            if (phone.contains(user)) {
                val c=phone.indexOf(user)
                a=passwords[c]
                Toast.makeText(this, "Your Password Is:\n $a", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "User Not Found", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun save(){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }
}