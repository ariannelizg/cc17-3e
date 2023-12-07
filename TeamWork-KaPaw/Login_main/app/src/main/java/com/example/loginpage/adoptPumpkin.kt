package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adoptPumpkin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_pumpkin)
        clickListener();

    }

    public fun clickListener() {
        var Pumpkin= findViewById<Button>(R.id.pumpkinButton)


        Pumpkin.setOnClickListener {
            openForm()
        }

    }

    public fun openForm() {
        startActivity(Intent(this@adoptPumpkin, Form::class.java))
    }

}
 