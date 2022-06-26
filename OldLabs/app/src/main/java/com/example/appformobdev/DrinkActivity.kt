package com.example.appformobdev

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class DrinkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        val drinkNo = intent.extras!![EXTRA_DRINKNO] as Int
        val drink: Drink = Drink.drinks.get(drinkNo)

        val photo = findViewById<View>(R.id.photo) as ImageView
        photo.setImageResource(drink.imageResourceId)
        photo.contentDescription = drink.name

        val name = findViewById<View>(R.id.name) as TextView
        name.text = drink.name

        val description = findViewById<View>(R.id.description) as TextView
        description.setText(drink.description)
    }

    companion object {
        const val EXTRA_DRINKNO = "drinkNo"
    }
}