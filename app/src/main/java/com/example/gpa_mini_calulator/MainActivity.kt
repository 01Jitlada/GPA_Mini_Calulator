package com.example.gpa_mini_calulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_OK.setOnClickListener {
            val cr1 = c1.text.toString().toInt()
            val cr2 = c2.text.toString().toInt()
            val cr3 = c3.text.toString().toInt()
            val cr4 = c4.text.toString().toInt()
            val cr5 = c5.text.toString().toInt()
            val a = cr1+cr2+cr3+cr4+cr5
            ttc.setText("$a")

            val point1 = p1.text.toString().toInt()
            val point2 = p2.text.toString().toInt()
            val point3 = p3.text.toString().toInt()
            val point4 = p4.text.toString().toInt()
            val point5 = p5.text.toString().toInt()
            val b = (cr1*point1) + (cr2*point2) + (cr3*point3) + (cr4*point4) + (cr5*point5)
            ga.setText("$b")
        }

        btn_Clear.setOnClickListener{
            c1.setText("")
            c2.setText("")
            c3.setText("")
            c4.setText("")
            c5.setText("")
            p1.setText("")
            p2.setText("")
            p3.setText("")
            p4.setText("")
            p5.setText("")
        }
    }
}