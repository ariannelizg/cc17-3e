package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Faqs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faqs)
        clickListener();

    }
    public fun clickListener(){
        var imageDogs = findViewById<CardView>(R.id.FaqDog)
        var imageCats = findViewById<CardView>(R.id.FaqCat)

        imageDogs.setOnClickListener{
            openforDogs()
        }
        imageCats.setOnClickListener{
            openforCats()

        }
    }
    public fun openforDogs(){
        startActivity(Intent(this@Faqs, forDogs::class.java))
    }
    public fun openforCats(){
        startActivity(Intent(this@Faqs, forCats::class.java))
    }
}