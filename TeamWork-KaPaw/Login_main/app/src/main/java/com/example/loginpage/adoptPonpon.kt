package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adoptPonpon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_ponpon)
        clickListener();

    }

    public fun clickListener() {
        var Ponpon = findViewById<Button>(R.id.ponponButton)


        Ponpon.setOnClickListener {
            openForm()
        }

    }

    public fun openForm() {
        startActivity(Intent(this@adoptPonpon, Form::class.java))
    }

}

