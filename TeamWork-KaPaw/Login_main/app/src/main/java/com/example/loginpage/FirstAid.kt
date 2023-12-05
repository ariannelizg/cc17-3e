package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)
        clickListener();

    }
    public fun clickListener(){
        var imageFOne = findViewById<CardView>(R.id.firstaidCard1)
        var imageFTwo = findViewById<CardView>(R.id.firstaidCard2)
        var imageFThree = findViewById<CardView>(R.id.firstaidCard3)
        var imageFFour = findViewById<CardView>(R.id.firstaidCard4)
        var imageFFive = findViewById<CardView>(R.id.firstaidCard5)
        var imageFSix = findViewById<CardView>(R.id.firstaidCard6)

        imageFOne.setOnClickListener{
            openFirstAidOne()
        }
        imageFTwo.setOnClickListener{
            openFirstAidTwo()
        }
        imageFThree.setOnClickListener{
            openFirstAidThree()
        }
        imageFFour.setOnClickListener{
            openFirstAidFour()
        }
        imageFFive.setOnClickListener{
            openFirstAidFive()
        }
        imageFSix.setOnClickListener{
            openFirstAidSix()
        }

    }
    public fun openFirstAidOne(){
        startActivity(Intent(this@FirstAid, FirstAidOne::class.java))
    }
    public fun openFirstAidTwo(){
        startActivity(Intent(this@FirstAid, FirstAidTwo::class.java))
    }
    public fun openFirstAidThree(){
        startActivity(Intent(this@FirstAid, FirstAidThree::class.java))
    }
    public fun openFirstAidFour(){
        startActivity(Intent(this@FirstAid, FirstAidFour::class.java))
    }
    public fun openFirstAidFive(){
        startActivity(Intent(this@FirstAid, FirstAidFive::class.java))
    }
    public fun openFirstAidSix(){
        startActivity(Intent(this@FirstAid, FirstAidSix::class.java))
    }
}