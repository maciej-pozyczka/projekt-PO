package com.example.Business_Converter.SalaryConverter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.Business_Converter.R

class SalaryConverterAmountActivity : AppCompatActivity() {

    lateinit var calculateButton : Button
    lateinit var salaryEditText : EditText
    lateinit var isStudentUnder26 : CheckBox
    lateinit var sickness : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) { // metoda onCreate jest zwiazane z cyklem zycia aplikacji
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_amount)

        calculateButton = findViewById(R.id.calculateButton)
        salaryEditText = findViewById(R.id.salaryEditText)
        isStudentUnder26 = findViewById(R.id.isAgeHigherThan26)
        sickness = findViewById(R.id.sickness)

        calculateButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // tworzymy intencje w ktorej okreslamy nazwe klasy ktora jest nasza aktywnoscia
                val intent : Intent = Intent(this@SalaryConverterAmountActivity,SalaryConverterContractActivity::class.java)

                // tworzymy bundel czyli paczke ktora bedzie przechowywala dane ktore przekazamey wraz z intencja do docelowej klasy
                val bundle : Bundle = Bundle()

                // wyciagamy wartosc z EditText
                val bruttoSalaryValue : Long = getBruttoSalaryValue(salaryEditText.text.toString())

                //wycagnieta wartosc wrzucamy do paczki pod kluczem CONTRACT_KEY ktory jest string i ma wartosc "some key"
                bundle.putLong(SalaryConverterContractActivity.CONTRACT_KEY,bruttoSalaryValue)
                bundle.putBoolean(SalaryConverterContractActivity.IS_UNDER_26_AND_STUDENT_KEY,isStudentUnder26.isChecked)
                bundle.putBoolean(SalaryConverterContractActivity.IS_PAYING_SICKNESS,sickness.isChecked)

                // wrzucamy nasza paczke do intentu jako "extra"
                intent.putExtras(bundle)

                //uzywamy metody ktora uruchomi aktynowsc przy uzyciu wyzej zdefinowanej intencji wraz z "paczka"
                startActivity(intent)
            }
        })
    }

    fun getBruttoSalaryValue(bruttoValue : String) : Long{
        if(bruttoValue == "") return 0

        return bruttoValue.toLong()
    }

}
