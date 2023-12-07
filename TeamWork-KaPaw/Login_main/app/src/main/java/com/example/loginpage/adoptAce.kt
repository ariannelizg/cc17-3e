package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class adoptAce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_ace)
        clickListener();

    }

    public fun clickListener() {
        var ace = findViewById<Button>(R.id.aceButton)


        ace.setOnClickListener {
            openForm()
        }

    }

    public fun openForm() {
        startActivity(Intent(this@adoptAce, Form::class.java))
    }

}
