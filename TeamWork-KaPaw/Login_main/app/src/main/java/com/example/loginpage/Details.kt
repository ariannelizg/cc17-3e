package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
class Details : AppCompatActivity() {

    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView
    private lateinit var profileUsername: TextView
    private lateinit var profileContact: TextView
    private lateinit var editProfile: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        profileName = findViewById(R.id.profileName)
        profileEmail = findViewById(R.id.profileEmail)
        profileUsername = findViewById(R.id.profileUsername)
        profileContact = findViewById(R.id.profileContact)

        editProfile = findViewById(R.id.editButton)

        showAllUserData()

        editProfile.setOnClickListener {
            passUserData()
        }
    }

    private fun showAllUserData() {
        val intent = intent
        val nameUser = intent.getStringExtra("name")
        val emailUser = intent.getStringExtra("email")
        val usernameUser = intent.getStringExtra("username")
        val contactUser = intent.getStringExtra("contact")


        profileName.text = nameUser
        profileEmail.text = emailUser
        profileUsername.text = usernameUser
        profileContact.text = contactUser
    }

    private fun passUserData() {
        val userUsername = profileUsername.text.toString().trim()
        val reference: DatabaseReference = FirebaseDatabase.getInstance().getReference("users")
        val checkUserDatabase: Query = reference.orderByChild("username").equalTo(userUsername)

        checkUserDatabase.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    val nameFromDB = snapshot.child(userUsername).child("name").getValue(String::class.java)
                    val emailFromDB = snapshot.child(userUsername).child("email").getValue(String::class.java)
                    val usernameFromDB = snapshot.child(userUsername).child("username").getValue(String::class.java)
                    val contactFromDB = snapshot.child(userUsername).child("contact").getValue(String::class.java)

                    val intent = Intent(this@Details, Edit::class.java)
                    intent.putExtra("name", nameFromDB)
                    intent.putExtra("email", emailFromDB)
                    intent.putExtra("username", usernameFromDB)
                    intent.putExtra("contact", contactFromDB)
                    startActivity(intent)
                }
            }

            override fun onCancelled(error: DatabaseError) {}
        })
    }
}