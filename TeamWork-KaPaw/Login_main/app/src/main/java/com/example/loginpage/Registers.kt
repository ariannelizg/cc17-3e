package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.loginpage.databinding.ActivityAdoptionsBinding
import com.example.loginpage.databinding.ActivityMainBinding
import com.example.loginpage.databinding.ActivityRegistersBinding
import com.google.firebase.auth.FirebaseAuth

class Registers : AppCompatActivity() {

    private lateinit var binding: ActivityRegistersBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registers)

        binding = ActivityRegistersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.signupButton.setOnClickListener{
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()
            val repassword = binding.repassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && repassword.isNotEmpty()){

                if (password == repassword){
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent( this, MainActivity::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this, it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this, "password does not match", Toast.LENGTH_SHORT).show()

                }
        }else{
            Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }
        binding.HaveButton.setOnClickListener {
            val mainActivity = Intent(this, MainActivity::class.java)
            startActivity(mainActivity)
        }
    }
}