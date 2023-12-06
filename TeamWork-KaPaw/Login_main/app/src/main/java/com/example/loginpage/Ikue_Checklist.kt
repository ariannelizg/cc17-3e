package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Ikue_Checklist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikue_checklist)
        clickListener();

    }

    public fun clickListener() {
        var imageChecklistDogs = findViewById<CardView>(R.id.NutritionDog)


        imageChecklistDogs.setOnClickListener {
            opendogs_checklist()
        }

    }

    public fun opendogs_checklist() {
        startActivity(Intent(this@Ikue_Checklist, dogs_checklist::class.java))
    }

}
