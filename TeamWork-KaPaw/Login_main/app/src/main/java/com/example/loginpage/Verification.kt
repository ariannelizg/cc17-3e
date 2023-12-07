package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
class Verification : AppCompatActivity() {

    private lateinit var loginUsername: EditText
    private lateinit var loginContact: EditText
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        loginUsername = findViewById(R.id.login_username)
        loginContact = findViewById(R.id.login_contact)
        loginButton = findViewById(R.id.login_button)


        loginButton.setOnClickListener {
            if (!validateUsername() or !validateContact()) {

            } else {
                checkUser()
            }
        }

    }

    private fun validateUsername(): Boolean {
        val valText = loginUsername.text.toString()
        return if (valText.isEmpty()) {
            loginUsername.error = "Username cannot be empty"
            false
        } else {
            loginUsername.error = null
            true
        }
    }

    private fun validateContact(): Boolean {
        val valText = loginContact.text.toString()
        return if (valText.isEmpty()) {
            loginContact.error = "Contact cannot be empty"
            false
        } else {
            loginContact.error = null
            true
        }
    }

    private fun checkUser() {
        val userUsername = loginUsername.text.toString().trim()
        val userContact = loginContact.text.toString().trim()
        val reference: DatabaseReference = FirebaseDatabase.getInstance().getReference("users")
        val checkUserDatabase: Query = reference.orderByChild("username").equalTo(userUsername)

        checkUserDatabase.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    loginUsername.error = null
                    val contactFromDB: String? =
                        snapshot.child(userUsername).child("contact").getValue(String::class.java)
                    if (contactFromDB == userContact) {
                        loginUsername.error = null
                        val nameFromDB: String? =
                            snapshot.child(userUsername).child("name").getValue(String::class.java)
                        val emailFromDB: String? =
                            snapshot.child(userUsername).child("email").getValue(String::class.java)
                        val usernameFromDB: String? =
                            snapshot.child(userUsername).child("username").getValue(String::class.java)
                        val intent = Intent(this@Verification,Details::class.java)
                        intent.putExtra("name", nameFromDB)
                        intent.putExtra("email", emailFromDB)
                        intent.putExtra("username", usernameFromDB)
                        intent.putExtra("contact", contactFromDB)
                        startActivity(intent)
                    } else {
                        loginContact.error = "Invalid Credentials"
                        loginContact.requestFocus()
                    }
                } else {
                    loginUsername.error = "User does not exist"
                    loginUsername.requestFocus()
                }
            }

            override fun onCancelled(error: DatabaseError) {}
        })
    }
}