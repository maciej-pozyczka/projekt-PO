package com.example.businessconverter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SalaryConverterAmountActivity : AppCompatActivity() {

    lateinit var calculateButton : Button
    lateinit var salaryEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_amount)

        calculateButton = findViewById(R.id.calculateButton)
        salaryEditText = findViewById(R.id.salaryEditText)

        calculateButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // tworzymy intencje w ktorej okreslamy nazwe klasy ktora jest nasza aktywnoscia
                val intent : Intent = Intent(this@SalaryConverterAmountActivity,SalaryConverterContractActivity::class.java)

                // tworzymy bundel czyli paczke ktora bedzie przechowywala dane ktore przekazamey wraz z intencja do docelowej klasy
                val bundle : Bundle = Bundle()

                // wyciagamy wartosc z EditText
                val bruttoSalaryValue : String = salaryEditText.text.toString()

                //wycagnieta wartosc wrzucamy do paczki pod kluczem CONTRACT_KEY ktory jest string i ma wartosc "some key"
                bundle.putString(SalaryConverterContractActivity.CONTRACT_KEY,bruttoSalaryValue)

                // wrzucamy nasza paczke do intentu jako "extra"
                intent.putExtras(bundle)

                //uzywamy metody ktora uruchomi aktynowsc przy uzyciu wyzej zdefinowanej intencji wraz z "paczka"
                startActivity(intent)
            }
        })

    }

}
