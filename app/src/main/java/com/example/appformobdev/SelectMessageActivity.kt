package com.example.appformobdev

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.content.Intent

class SelectMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_message)

        val radioGroup = findViewById<RadioGroup>(R.id.select_radio)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val returnIntent = Intent()
            val radioButton = findViewById<RadioButton>(checkedId)

            returnIntent.putExtra("text", radioButton.text)

            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}