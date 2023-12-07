package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adoptIkue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_ikue)
        clickListener();

    }

    public fun clickListener() {
        var Ikue = findViewById<Button>(R.id.ikueButton)


        Ikue.setOnClickListener {
            openForm()
        }

    }

    public fun openForm() {
        startActivity(Intent(this@adoptIkue, Form::class.java))
    }

}
