package com.shapovalova.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(this, fetchList(), this)

    }

    private fun fetchList(): ArrayList<ColorData> {

        return arrayListOf(
            ColorData(
                "MAGENTA",
                Color.MAGENTA
            ),
            ColorData(
            "YELLOW",
            Color.YELLOW
        ),
            ColorData(
                "RED",
                Color.RED
            ),
            ColorData(
                "GREEN",
                Color.GREEN
            ),

            ColorData(
                "BLUE",
                Color.BLUE
            ),
            ColorData(
                "CYAN",
                Color.CYAN
            ),
            ColorData(
                "GRAY",
                Color.GRAY
            )
        )
    }

    override fun onCellClickListener(colorName: String){
        Toast.makeText(applicationContext, "IT’S $colorName", Toast.LENGTH_SHORT).show()
    }
    }



