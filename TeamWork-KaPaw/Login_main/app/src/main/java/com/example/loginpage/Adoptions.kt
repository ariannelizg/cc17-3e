package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Adoptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adoptions)
        clickListener();
    }
    public fun clickListener(){
        var imageAce = findViewById<CardView>(R.id.ace)
        var imageBlossom = findViewById<CardView>(R.id.blossom)
        var imageCoco = findViewById<CardView>(R.id.coco)
        var imageIkue = findViewById<CardView>(R.id.ikue)
        var imagePonpon = findViewById<CardView>(R.id.ponpon)
        var imagePumpkin = findViewById<CardView>(R.id.pumpkin)

        imageAce.setOnClickListener{
            openadoptAce()
        }
        imageBlossom.setOnClickListener{
            openadoptBlossom()
        }
        imageCoco.setOnClickListener{
            openadoptCoco()
        }
        imageIkue.setOnClickListener{
            openadoptIkue()
        }
        imagePonpon.setOnClickListener{
            openadoptPonpon()
        }
        imagePumpkin.setOnClickListener{
            openadoptPumpkin()
        }
    }
    public fun openadoptAce(){
        startActivity(Intent(this@Adoptions, adoptAce::class.java))
    }
    public fun openadoptBlossom(){
        startActivity(Intent(this@Adoptions, adoptBlossom::class.java))
    }
    public fun openadoptCoco(){
        startActivity(Intent(this@Adoptions, adoptCoco::class.java))
    }
    public fun openadoptIkue(){
        startActivity(Intent(this@Adoptions, adoptIkue::class.java))
    }
    public fun openadoptPonpon(){
        startActivity(Intent(this@Adoptions, adoptPonpon::class.java))
    }
    public fun openadoptPumpkin(){
        startActivity(Intent(this@Adoptions, adoptPumpkin::class.java))
    }
}
