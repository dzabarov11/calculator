package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var text: TextView? = null
    private lateinit var inputText: EditText
    private lateinit var camelCase: EditText
    private lateinit var minus: Button
    private lateinit var plus: Button
    private lateinit var multiplication: Button
    private lateinit var division: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.result)
        inputText = findViewById(R.id.editTextTextPersonName1)
        camelCase = findViewById(R.id.editTextTextPersonName2)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        multiplication = findViewById(R.id.multiplication)
        division = findViewById(R.id.division)
        minus.setOnClickListener {
            try {
                val num: Double = inputText.text.toString().toDouble()
                val number: Double = camelCase.text.toString().toDouble()
                val solution: Double = (num - number)
                text?.text = solution.toString()

            } catch (e: Exception) {
                text?.text = "Error"


            }
        }
        plus.setOnClickListener {
            try {
                val num: Double = inputText.text.toString().toDouble()
                val number: Double = camelCase.text.toString().toDouble()
                val solution: Double = (num + number)
                text?.text = solution.toString()

            } catch (e: Exception) {
                text?.text = "Error"


            }
        }
        multiplication.setOnClickListener {
            try {
                val num: Double = inputText.text.toString().toDouble()
                val number: Double = camelCase.text.toString().toDouble()
                val solution: Double = (num * number)
                text?.text = solution.toString()

            } catch (e: Exception) {
                text?.text = "Error"


            }
        }
        division.setOnClickListener {
            try {
                val num: Double = inputText.text.toString().toDouble()
                val number: Double = camelCase.text.toString().toDouble()
                val solution: Double = (num / number)
                text?.text = solution.toString()

            } catch (e: Exception) {
                text?.text = "Error"


            }
        }
    }
}