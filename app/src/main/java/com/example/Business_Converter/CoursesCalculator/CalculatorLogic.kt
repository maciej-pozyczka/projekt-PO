package com.example.Business_Converter.CoursesCalculator

import android.annotation.SuppressLint
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer

class CalculatorLogic {

    companion object {
        @SuppressLint("SetTextI18n")
        fun chfButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val newEditText: Double = editText.text.toString().toDouble()
            viewModel.singleRateRespone.observe(context, Observer { response ->
                if (response.isSuccessful) {
                    response.body()?.rates?.forEach {
                        val toCHFrate = newEditText / it.mid
                        val fromCHFrate = it.mid * newEditText

                        textViewPLN.text = "$newEditText CHF = $fromCHFrate PLN"
                        textViewOther.text = "$newEditText PLN = $toCHFrate CHF"
                    }

                } else {
                    textViewPLN.text = "Error"
                }

            })
        }


    }

}


