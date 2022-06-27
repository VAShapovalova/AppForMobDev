package com.shapovalova.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val colorView = view.findViewById(R.id.r_view_item_view) as View
    val textView = view.findViewById<View>(R.id.r_view_item_text_view) as TextView

}

interface CellClickListener{
    fun onCellClickListener(colorName: String)
}

class Adapter(private val context: Context,
              private val list: ArrayList<ColorData>, private val CellClickListener: CellClickListener) : RecyclerView.Adapter<ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rview_item,parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.colorView.setBackgroundColor(data.colorHex)
        holder.textView.text = data.colorName
        holder.textView.setOnClickListener { CellClickListener.onCellClickListener(data.colorName) }
    }
}