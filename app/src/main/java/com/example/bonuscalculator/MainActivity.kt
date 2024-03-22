package com.example.bonuscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edName = findViewById<EditText>(R.id.edName).text
        val edEmployeeNumber = findViewById<EditText>(R.id.edNumber).text
        val edEmail = findViewById<EditText>(R.id.edEmail).text
        val edSalary =  findViewById<EditText>(R.id.edSalary).text
        val edExperience = findViewById<EditText>(R.id.edExperience).text

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        val tvResults = findViewById<TextView>(R.id.tvResults)


        btnCalculate.setOnClickListener {
            val experince = edExperience.toString().toInt()
            var bonus = 0.0
            var salary = edSalary.toString().toDouble()
            when (edExperience.toString().toInt()){
                1 -> bonus = salary + (salary * 10/100 ) - (salary *7.5/100 )
                2 -> bonus = salary + (salary +20/100 ) - (salary *7.5/100 )
                3 -> bonus = salary + (salary + 30/100) - (salary *7.5/100 )
                4 -> bonus = salary + (salary +40/100 ) - (salary * 7.5/100)
                else -> tvResults.text = "You have entered an invalid year"
            }
            tvResults.text = "Hi ${edName}. your bonus is R${bonus}. We have sent you an ${edEmail}"
        }
    }
}