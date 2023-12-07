package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adoptBlossom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_blossom)
        clickListener();

    }

    public fun clickListener() {
        var Blossom = findViewById<Button>(R.id.blossomButton)

            Blossom.setOnClickListener {
            openForm()
        }

    }

    public fun openForm() {
        startActivity(Intent(this@adoptBlossom, Form::class.java))
    }

}
