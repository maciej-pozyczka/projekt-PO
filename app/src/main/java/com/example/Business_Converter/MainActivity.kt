package com.example.Business_Converter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.Business_Converter.Courses.CoursesActivity
import com.example.Business_Converter.CoursesCalculator.CoursesConverterActivity
import com.example.Business_Converter.Gold.GoldActivity


class MainActivity : AppCompatActivity() {


    lateinit var goldButton : Button
    lateinit var coursesButton : Button
    lateinit var coursesCalculatorButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goldButton = findViewById(R.id.gold)
        coursesButton = findViewById(R.id.courses)
        coursesCalculatorButton = findViewById(R.id.coursesCalculator)

        goldButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, GoldActivity::class.java)
                startActivity(intent)
            }


        })

        coursesButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CoursesActivity::class.java)
                startActivity(intent)
            }


        })

        coursesCalculatorButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CoursesConverterActivity::class.java)
                startActivity(intent)
            }


        })


    }


}