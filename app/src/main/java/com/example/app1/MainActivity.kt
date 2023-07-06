package com.example.app1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tv_message)
        val inputField = findViewById<EditText>(R.id.etName)
        val btn = findViewById<Button>(R.id.btnSubmit )
        btn.setOnClickListener{
            val enteredName = inputField.text.toString()
            val message = "Welcome $enteredName"
            greetingTextView.text = message
            inputField.text.clear()
        }
    }
}
