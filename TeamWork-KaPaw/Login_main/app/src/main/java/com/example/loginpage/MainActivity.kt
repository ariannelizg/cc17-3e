package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.loginpage.R.id
import com.example.loginpage.R.id.LoginButton
import com.example.loginpage.R.id.Twitter
import com.example.loginpage.R.id.facebook

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton = findViewById<Button>(id.LoginButton)
        loginbutton.setOnClickListener {
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }

        val facebook = findViewById<ImageView>(R.id.facebook)
        val gmail = findViewById<ImageView>(R.id.Gmail)
        val twitter = findViewById<ImageView>(R.id.Twitter)
        val instagram = findViewById<ImageView>(R.id.insta)

        facebook.setOnClickListener {
            openUrl("https://www.facebook.com/")
        }

        gmail.setOnClickListener {
            openUrl("https://mail.google.com/")
        }

        twitter.setOnClickListener {
            openUrl("https://www.twitter.com/")
        }

        instagram.setOnClickListener {
            openUrl("https://www.instagram.com/")
        }
    }
    private fun openUrl(link:String){
        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    }
