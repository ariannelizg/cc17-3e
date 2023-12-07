package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
class Edit : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editUsername: EditText
    private lateinit var editContacts: EditText
    private lateinit var saveButton: Button
    private lateinit var reference: DatabaseReference
    private var nameUser: String? = null
    private var emailUser: String? = null
    private var usernameUser: String? = null
    private var ContactsUser: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        reference = FirebaseDatabase.getInstance().getReference("users")
        editName = findViewById(R.id.editName)
        editEmail = findViewById(R.id.editEmail)
        editUsername = findViewById(R.id.editUsername)
        editContacts = findViewById(R.id.editContact)
        saveButton = findViewById(R.id.saveButton)

        showData()

        saveButton.setOnClickListener {
            if (isNameChanged() || isContactChanged() || isEmailChanged()) {
                Toast.makeText(this@Edit, "Saved", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@Edit, "No Changes Found", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isNameChanged(): Boolean {
        if (!nameUser.equals(editName.text.toString())) {
            reference.child(usernameUser!!).child("name").setValue(editName.text.toString())
            nameUser = editName.text.toString()
            return true
        } else {
            return false
        }
    }

    private fun isEmailChanged(): Boolean {
        if (!emailUser.equals(editEmail.text.toString())) {
            reference.child(usernameUser!!).child("email").setValue(editEmail.text.toString())
            emailUser = editEmail.text.toString()
            return true
        } else {
            return false
        }
    }

    private fun isContactChanged(): Boolean {
        if (!ContactsUser.equals(editContacts.text.toString())) {
            reference.child(usernameUser!!).child("contact").setValue(editContacts.text.toString())
            ContactsUser = editContacts.text.toString()
            return true
        } else {
            return false
        }
    }

    private fun showData() {
        val intent = intent
        nameUser = intent.getStringExtra("name")
        emailUser = intent.getStringExtra("email")
        usernameUser = intent.getStringExtra("username")
        ContactsUser = intent.getStringExtra("contact")

        editName.setText(nameUser)
        editEmail.setText(emailUser)
        editUsername.setText(usernameUser)
        editContacts.setText(ContactsUser)
    }
}