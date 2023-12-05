package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class NutritionForDogs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_for_dogs)
        clickListener();

    }
    public fun clickListener(){
        var imageAdd = findViewById<CardView>(R.id.dogsaddCard)
        var imageAvoid = findViewById<CardView>(R.id.dogsavoidCard)
        var imageCalcium = findViewById<CardView>(R.id.dogscalciumCard)
        var imageCarbohydrates = findViewById<CardView>(R.id.dogscarboCard)
        var imageOther = findViewById<CardView>(R.id.dogsotherCard)
        var imageProtein = findViewById<CardView>(R.id.dogsproteinCard)
        var imageVegetables = findViewById<CardView>(R.id.dogsveggieCard)
        var imageSwitch = findViewById<CardView>(R.id.dogsswitchCard)

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
        imageSwitch.setOnClickListener{
            openSwitch()
        }

    }
    public fun openAdd(){
        startActivity(Intent(this@NutritionForDogs, NutriDogAdd::class.java))
    }
    public fun openAvoid(){
        startActivity(Intent(this@NutritionForDogs, NutriDogIngredients::class.java))
    }
    public fun openCalcium(){
        startActivity(Intent(this@NutritionForDogs, NutriDogCalcium::class.java))
    }
    public fun openCarbohydrates(){
        startActivity(Intent(this@NutritionForDogs, NutriDogCarbohydrates::class.java))
    }
    public fun openOther(){
        startActivity(Intent(this@NutritionForDogs, NutriDogOther::class.java))
    }
    public fun openProtein(){
        startActivity(Intent(this@NutritionForDogs, NutriDogProtein::class.java))
    }
    public fun openVegetables(){
        startActivity(Intent(this@NutritionForDogs, NutriDogVegetables::class.java))
    }
    public fun openSwitch(){
        startActivity(Intent(this@NutritionForDogs, NutriDogSwitch::class.java))

    }
}