package com.example.Business_Converter.CoursesCalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.R
import com.example.Business_Converter.network.Repository

class CoursesConverterActivity : AppCompatActivity() {

    private lateinit var viewModel: CoursesCalculatorViewModel
    private lateinit var coursesConverterActivity: CoursesConverterActivity
    private lateinit var editText: EditText
    private lateinit var textViewtoPLN: TextView
    private lateinit var textViewfromPLN: TextView
    private lateinit var chfButton: Button
    private lateinit var eurButton: Button
    private lateinit var usdButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_converter)

        editText = findViewById(R.id.CalculatorEditText)
        textViewtoPLN = findViewById(R.id.CalculatorTextViewPLN)
        textViewfromPLN = findViewById(R.id.CalculatorTextViewOther)
        chfButton = findViewById(R.id.buttonCHF)
        eurButton = findViewById(R.id.buttonEUR)
        usdButton = findViewById(R.id.buttonUSD)


        val repository = Repository()
        val logic = CalculatorLogic
        val viewModelFactory = CoursesCalculatorViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(CoursesCalculatorViewModel::class.java)
        viewModel.getCHF()

        chfButton.setOnClickListener {
            logic.chfButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }


    }
}