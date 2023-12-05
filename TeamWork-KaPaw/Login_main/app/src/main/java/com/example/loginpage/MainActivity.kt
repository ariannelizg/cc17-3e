package com.example.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.loginpage.R.id
import com.example.loginpage.R.id.LoginButton
import com.example.loginpage.R.id.Twitter
import com.example.loginpage.R.id.facebook
import com.example.loginpage.databinding.ActivityMainBinding
import com.example.loginpage.databinding.ActivityRegistersBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.LoginButton.setOnClickListener {
            val email = binding.Email.text.toString()
            val password = binding.Password.text.toString()

            if (email.isEmpty() && password.isEmpty()){
                Toast.makeText(this, "Fields Cannot be empty", Toast.LENGTH_SHORT ).show()

            }else if (email.isNotEmpty() && password.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnSuccessListener { authResult ->
                    Toast.makeText(this@MainActivity, "Login Successfully", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MainActivity, Dashboard::class.java))
                    finish()
                }
            }else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT ).show()
            }
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
