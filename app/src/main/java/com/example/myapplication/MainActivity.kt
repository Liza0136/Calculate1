package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val win1 = findViewById<EditText>(R.id.window1)
        val win2 = findViewById<EditText>(R.id.window2)
        val result = findViewById<TextView>(R.id.textView)
        val ster = findViewById<Button>(R.id.sterka)
        val b_0 = findViewById<Button>(R.id.button0)
        val b_1 = findViewById<Button>(R.id.button1)
        val b_2 = findViewById<Button>(R.id.button2)
        val b_3 = findViewById<Button>(R.id.button3)
        val b_4 = findViewById<Button>(R.id.button4)
        val b_5 = findViewById<Button>(R.id.button5)
        val b_6 = findViewById<Button>(R.id.button6)
        val b_7 = findViewById<Button>(R.id.button7)
        val b_8 = findViewById<Button>(R.id.button8)
        val b_9 = findViewById<Button>(R.id.button9)
        val b_plus = findViewById<Button>(R.id.buttonplus)
        val b_minus = findViewById<Button>(R.id.buttonminus)
        val b_del = findViewById<Button>(R.id.buttondel)
        val b_umn = findViewById<Button>(R.id.buttonumn)


        ster.setOnClickListener {
            win1.text = null
            win2.text = null
            result.text = ""
        }
        win1.setOnClickListener {
            b_0.setOnClickListener { win1.append("0") }
            b_1.setOnClickListener { win1.append("1") }
            b_2.setOnClickListener { win1.append("2") }
            b_3.setOnClickListener { win1.append("3") }
            b_4.setOnClickListener { win1.append("4") }
            b_5.setOnClickListener { win1.append("5") }
            b_6.setOnClickListener { win1.append("6") }
            b_7.setOnClickListener { win1.append("7") }
            b_8.setOnClickListener { win1.append("8") }
            b_9.setOnClickListener { win1.append("9") }
        }
        win2.setOnClickListener {
            b_0.setOnClickListener { win2.append("0") }
            b_1.setOnClickListener { win2.append("1") }
            b_2.setOnClickListener { win2.append("2") }
            b_3.setOnClickListener { win2.append("3") }
            b_4.setOnClickListener { win2.append("4") }
            b_5.setOnClickListener { win2.append("5") }
            b_6.setOnClickListener { win2.append("6") }
            b_7.setOnClickListener { win2.append("7") }
            b_8.setOnClickListener { win2.append("8") }
            b_9.setOnClickListener { win2.append("9") }
        }
        b_plus.setOnClickListener {
            val a = win1.text.toString().toDoubleOrNull()
            val b = win2.text.toString().toDoubleOrNull()
            val res1 = a!! + b!!
            val label = getString(R.string.text_View)
            result.text = "$label$res1"
        }
        b_minus.setOnClickListener {
            val c = win1.text.toString().toDoubleOrNull()
            val d = win2.text.toString().toDoubleOrNull()
            val res2 = c!! - d!!
            val label = getString(R.string.text_View)
            result.text = "$label$res2"
        }
        b_umn.setOnClickListener {
            val e = win1.text.toString().toDoubleOrNull()
            val f = win2.text.toString().toDoubleOrNull()
            val res3 = e!! * f!!
            val label = getString(R.string.text_View)
            result.text = "$label$res3"
        }
        b_del.setOnClickListener {
            val g = win1.text.toString().toDoubleOrNull()
            val w = win2.text.toString().toDoubleOrNull()
            val res4 = g!! / w!!
            val label = getString(R.string.text_View)
            result.text = "$label$res4"
        }
    }
}




