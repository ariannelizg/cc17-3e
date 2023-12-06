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
        var imageContacts = findViewById<CardView>(R.id.contactsCard)
        var imageNutrition = findViewById<CardView>(R.id.nutritionCard)
        var imageFirstAid = findViewById<CardView>(R.id.firstCard)
        var imageChecklist = findViewById<CardView>(R.id.checkCard)

        imageFaqs.setOnClickListener{
            openFaqs()
        }
        imageAdoptions.setOnClickListener{
            openAdoptions()
        }
        imageContacts.setOnClickListener{
            openContacts()
        }
        imageNutrition.setOnClickListener{
            openNutrition()
        }
        imageFirstAid.setOnClickListener{
            openFirstAid()
        }
        imageChecklist.setOnClickListener{
            opendogs_checklist()
        }

    }
    public fun openFaqs(){
        startActivity(Intent(this@Dashboard, Faqs::class.java))
    }
    public fun openAdoptions(){
        startActivity(Intent(this@Dashboard, Adoptions::class.java))
    }
    public fun openContacts(){
        startActivity(Intent(this@Dashboard, Contacts::class.java))
    }
    public fun openNutrition(){
        startActivity(Intent(this@Dashboard, Nutrition::class.java))
    }
    public fun openFirstAid(){
        startActivity(Intent(this@Dashboard, FirstAid::class.java))
    }
    public fun opendogs_checklist(){
        startActivity(Intent(this@Dashboard, dogs_checklist::class.java))
    }
}