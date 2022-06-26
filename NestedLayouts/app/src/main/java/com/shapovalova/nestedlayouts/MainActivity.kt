package com.shapovalova.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizText1 = findViewById<View>(R.id.horiz_text_1) as TextView
        val horizText2 = findViewById<View>(R.id.horiz_text_2) as TextView
        val horizText3 = findViewById<View>(R.id.horiz_text_3) as TextView
        val vertText1 = findViewById<View>(R.id.vert_text_1) as TextView
        val vertText2 = findViewById<View>(R.id.vert_text_2) as TextView
        val vertText3 = findViewById<View>(R.id.vert_text_3) as TextView
        val constrText1 = findViewById<View>(R.id.constr_text_1) as TextView
        val constrText2 = findViewById<View>(R.id.constr_text_2) as TextView
        val constrText3 = findViewById<View>(R.id.constr_text_3) as TextView
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            count+=1;
            when(count%3){
                1 ->{
                    horizText1.text = count.toString()
                    vertText1.text =count.toString()
                    constrText1.text = count.toString()
                    horizText2.text = ""
                    vertText2.text =""
                    constrText2.text = ""
                    horizText3.text = ""
                    vertText3.text =""
                    constrText3.text = ""
                }
                2 ->{
                    horizText1.text = ""
                    vertText1.text = ""
                    constrText1.text = ""
                    horizText2.text = count.toString()
                    vertText2.text =count.toString()
                    constrText2.text = count.toString()
                    horizText3.text = ""
                    vertText3.text =""
                    constrText3.text = ""
                }
                0 ->{

                    horizText1.text = ""
                    vertText1.text = ""
                    constrText1.text = ""
                    horizText2.text = ""
                    vertText2.text =""
                    constrText2.text = ""
                    horizText3.text = count.toString()
                    vertText3.text =count.toString()
                    constrText3.text = count.toString()
                }
            }
        }



    }
}