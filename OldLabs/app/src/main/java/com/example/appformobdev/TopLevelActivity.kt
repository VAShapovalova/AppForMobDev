package com.example.appformobdev
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class TopLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)
        val itemClickListener =
            OnItemClickListener { listView, v, position, id ->
                if (position == 0) {
                    val intent = Intent(
                        this@TopLevelActivity,
                        DrinkCategoryActivity::class.java
                    )
                    startActivity(intent)
                }
            }
        val listView = findViewById<View>(R.id.list_options) as ListView
        listView.onItemClickListener = itemClickListener
    }
}