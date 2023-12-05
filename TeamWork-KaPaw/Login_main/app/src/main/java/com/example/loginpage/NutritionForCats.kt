package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class NutritionForCats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_for_cats)
        clickListener();

    }
    public fun clickListener(){
        var imageAdd = findViewById<CardView>(R.id.catsaddCard)
        var imageAvoid = findViewById<CardView>(R.id.catsavoidCard)
        var imageCalcium = findViewById<CardView>(R.id.catscalciumCard)
        var imageCarbohydrates = findViewById<CardView>(R.id.catscarboCard)
        var imageOther = findViewById<CardView>(R.id.catsotherCard)
        var imageProtein = findViewById<CardView>(R.id.catsproteinCard)
        var imageVegetables = findViewById<CardView>(R.id.catsveggieCard)

        imageAdd.setOnClickListener{
            openAdd()
        }
        imageAvoid.setOnClickListener{
            openAvoid()
        }
        imageCalcium.setOnClickListener{
            openCalcium()
        }
        imageCarbohydrates.setOnClickListener{
            openCarbohydrates()
        }
        imageOther.setOnClickListener{
            openOther()
        }
        imageProtein.setOnClickListener{
            openProtein()
        }
        imageVegetables.setOnClickListener{
            openVegetables()
        }

    }
    public fun openAdd(){
        startActivity(Intent(this@NutritionForCats, NutriCatAdd::class.java))
    }
    public fun openAvoid(){
        startActivity(Intent(this@NutritionForCats, NutriCatsAvoid::class.java))
    }
    public fun openCalcium(){
        startActivity(Intent(this@NutritionForCats, NutriCatsCalcium::class.java))
    }
    public fun openCarbohydrates(){
        startActivity(Intent(this@NutritionForCats, NutriCatsCarbohydrates::class.java))
    }
    public fun openOther(){
        startActivity(Intent(this@NutritionForCats, NutriCatsOther::class.java))
    }
    public fun openProtein(){
        startActivity(Intent(this@NutritionForCats, NutriCatsProtein::class.java))
    }
    public fun openVegetables(){
        startActivity(Intent(this@NutritionForCats, NutriCatsVegetables::class.java))

    }
}