package com.example.app1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tv_message)
        val inputField = findViewById<EditText>(R.id.etName)
        val btn = findViewById<Button>(R.id.btnSubmit )
        val btnOffers = findViewById<Button>(R.id.btnOffers)
        btn.setOnClickListener{
            val enteredName = inputField.text.toString()
            if(enteredName==""){
                btnOffers.visibility = INVISIBLE
                greetingTextView.text=""
                Toast.makeText(applicationContext,
                    "Please enter your name",
                    Toast.LENGTH_SHORT).show()
            }else{
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                btnOffers.visibility = VISIBLE
            }
        }
        btnOffers.setOnClickListener {
            greetingTextView.text = "Offers wada"
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
