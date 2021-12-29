package com.example.appformobdev

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ReceiveMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

        val textMessage = findViewById<TextView>(R.id.message_text)
        textMessage.text = intent.extras?.getString("message")
    }
}