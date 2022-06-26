package com.shapovalova.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<View>(R.id.edit_text) as EditText
        val viewText = findViewById<View>(R.id.text_view) as TextView
        val button = findViewById<Button>(R.id.button)
        val checkBox = findViewById<Button>(R.id.check_box) as CheckBox
        val progressBar = findViewById<View>(R.id.progress_bar) as ProgressBar
        button.setOnClickListener {
            if(checkBox.isChecked){
            viewText.text = editText.text.toString()
                if(progressBar.progress ==100) progressBar.progress =0
                progressBar.progress += 10

            }
        }
    }
}