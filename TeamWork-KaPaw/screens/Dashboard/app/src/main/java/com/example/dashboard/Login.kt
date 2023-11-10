package com.example.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

            val loginbutton = findViewById<Button>(R.id.LoginButton)
            loginbutton.setOnClickListener {
                val Intent = Intent(this,Dashboard::class.java)
                startActivity(Intent)
            }
    }
}

