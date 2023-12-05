package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Nutrition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)
        clickListener();

    }

    public fun clickListener() {
        var imageNutritionDogs = findViewById<CardView>(R.id.NutritionDog)
        var imageNutritionCats = findViewById<CardView>(R.id.NutritionCat)


        imageNutritionDogs.setOnClickListener {
            openNutritionForDogs()
        }
        imageNutritionCats.setOnClickListener {
            openNutritionForCats()
        }

    }

    public fun openNutritionForDogs() {
        startActivity(Intent(this@Nutrition, NutritionForDogs::class.java))
    }

    public fun openNutritionForCats() {
        startActivity(Intent(this@Nutrition, NutritionForCats::class.java))
    }
}