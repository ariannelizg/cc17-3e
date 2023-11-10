package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        clickListener();

    }
    public fun clickListener(){
        var imageFaqs = findViewById<CardView>(R.id.faqCard)
        var imageAdoptions = findViewById<CardView>(R.id.adoptionsCard)

        imageFaqs.setOnClickListener{
            openFaqs()
        }
        imageAdoptions.setOnClickListener{
            openAdoptions()

        }
    }
    public fun openFaqs(){
        startActivity(Intent(this@Dashboard, Faqs::class.java))
    }
    public fun openAdoptions(){
        startActivity(Intent(this@Dashboard, Adoptions::class.java))
    }
}