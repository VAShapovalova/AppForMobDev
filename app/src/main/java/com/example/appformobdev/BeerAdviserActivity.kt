package com.example.appformobdev

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appformobdev.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beer_adviser)

        val spinner = findViewById<Spinner>(R.id.beer_option)
        val findButton = findViewById<Button>(R.id.find_beer)
        val text = findViewById<TextView>(R.id.beer_names)

        val beerColors = resources.getStringArray(R.array.beer_colors);
        val beerList = mapOf(
            beerColors[0] to resources.getStringArray(R.array.light_beer),
                    beerColors[1] to resources.getStringArray(R.array.amber_beer),
                    beerColors[2] to resources.getStringArray(R.array.brown_beer),
                    beerColors[3] to resources.getStringArray(R.array.dark_beer)

        )

        findButton.setOnClickListener {
            val beerType = spinner.selectedItem.toString()
            val beerNames = beerList[beerType]

            text.text = beerNames?.joinToString("\n")
        }
    }


    fun onClickAttention(v: View) {
        val text = findViewById<TextView>(R.id.beer_names)

        text.text = resources.getText(R.string.attention_text)
    }
}