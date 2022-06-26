package com.shapovalova.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import timber.log.Timber
import timber.log.Timber.Forest.plant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plant(Timber.DebugTree())

        val editTextField = findViewById<View>(R.id.edit_text) as EditText
        val buttonLog =  findViewById<Button>(R.id.button_log)
        val buttonTimber = findViewById<Button>(R.id.button_timber)

        buttonLog.setOnClickListener {
            Log.v("From EditText", editTextField.text.toString());
        }
        buttonTimber.setOnClickListener {
            Timber.v(editTextField.text.toString())
        }
    }
}