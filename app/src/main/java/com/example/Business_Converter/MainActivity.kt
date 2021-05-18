package com.example.Business_Converter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.Business_Converter.Chart.ChartActivity
import com.example.Business_Converter.Courses.CoursesActivity
import com.example.Business_Converter.CoursesCalculator.CoursesConverterActivity
import com.example.Business_Converter.CurrencyConverter.CurrencyConverterActivity
import com.example.Business_Converter.Gold.GoldActivity
import com.example.Business_Converter.SalaryConverter.SalaryConverterAmountActivity


class MainActivity : AppCompatActivity() {


    lateinit var goldButton: Button
    lateinit var coursesButton: Button
    lateinit var coursesCalculatorButton: Button
    lateinit var chartButton: Button
    lateinit var someRatesButton: Button
    lateinit var currencyConverterButton: Button
    lateinit var salaryConverterButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goldButton = findViewById(R.id.gold)
        coursesButton = findViewById(R.id.courses)
        coursesCalculatorButton = findViewById(R.id.coursesCalculator)
        chartButton = findViewById(R.id.Chart)
        someRatesButton = findViewById(R.id.someRates)
        currencyConverterButton = findViewById(R.id.currencyConverterButton)
        salaryConverterButton = findViewById(R.id.salaryConverterButton)


        goldButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, GoldActivity::class.java)
                startActivity(intent)
            }
        })

        coursesButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CoursesActivity::class.java)
                startActivity(intent)
            }
        })

        coursesCalculatorButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CoursesConverterActivity::class.java)
                startActivity(intent)
            }
        })

        chartButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, ChartActivity::class.java)
                startActivity(intent)
            }

        })

        someRatesButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, LastRatesActivity::class.java)
                startActivity(intent)
            }

        })


        currencyConverterButton.setOnClickListener(object :
            View.OnClickListener { // po klinieciu wywolujemy cialo metody
            override fun onClick(v: View?) {
                // intent jest poleceniem dla systemu operacyjnego co ma wykonac, w tym przpyadku poleceniem jest stworzenie aktynowsci
                val intent = Intent(this@MainActivity, CurrencyConverterActivity::class.java) //
                // metoda start activity przyjmuje polecneiem ktore opisuje ktora aktywnosc ma system operacyjny uruchomic
                startActivity(intent)
            }
        })

        salaryConverterButton.setOnClickListener(object :
            View.OnClickListener { // obiekt anonimowy, bo nie ma przypisanej zmiennej
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SalaryConverterAmountActivity::class.java)

                startActivity(intent)
            }
        })
    }


}