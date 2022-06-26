package com.shapovalova.attributes

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textField = findViewById<View>(R.id.text_field) as EditText
        val blackColorButton = findViewById<Button>(R.id.black_color_btn)
        val redColorButton = findViewById<Button>(R.id.red_color_btn)
        val size8Btn = findViewById<Button>(R.id.size_8_btn)
        val size24Btn = findViewById<Button>(R.id.size_24_btn)
        val whiteBackgroundBtn = findViewById<Button>(R.id.white_background_btn)
        val yellowBackgroundBtn = findViewById<Button>(R.id.yellow_background_btn)

        blackColorButton.setOnClickListener {
            textField.setTextColor(Color.BLACK)
        }
        redColorButton.setOnClickListener {
            textField.setTextColor(Color.RED)
        }
        size8Btn.setOnClickListener {
            textField.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }

        size24Btn.setOnClickListener {
            textField.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        }

        whiteBackgroundBtn.setOnClickListener {
            textField.setBackgroundColor(Color.WHITE)
        }

        yellowBackgroundBtn.setOnClickListener {
            textField.setBackgroundColor(Color.YELLOW)
        }

    }
}