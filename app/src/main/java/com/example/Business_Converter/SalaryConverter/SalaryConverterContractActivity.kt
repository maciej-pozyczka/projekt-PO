package com.example.Business_Converter.SalaryConverter

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.Business_Converter.R


class SalaryConverterContractActivity:AppCompatActivity() {
    // companion object to statyczny obiekt przechowujacy statyczne obiekty, zmienne, badz metody
    companion object {
        const val CONTRACT_KEY : String = "contract_key" //
    }

    lateinit var umowaOPraceTextView : TextView
    lateinit var umowaOZlecenieTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_contract)

        umowaOPraceTextView = findViewById(R.id.umowaOPraceWartosc)
        umowaOZlecenieTextView = findViewById(R.id.umowaOZlecenieWartosc)

        //odwolujemy sie do "paczki" ktora mogla byc przekazana do intencji uruchamiajcej nasza aktywnosc
        val intentBundle : Bundle? = intent.extras
        val salaryBruttoValue : Long?= intentBundle?.getLong(CONTRACT_KEY)

        if(salaryBruttoValue != null) {
            umowaOPraceTextView.text = obliczenieUmowaOprace(salaryBruttoValue).toString() + " PLN"
            umowaOZlecenieTextView.text = obliczenieUmowaOprace(salaryBruttoValue).toString() + " PLN"
        }

    }

    //stworz funkcje ktora przyjmuje Int jako argument i zwraca Int
    fun obliczenieUmowaOprace(kwotaBrutto : Long) : Long {
        //2600 - 2600*13,71% = 2243,54
        val skladkiSpoleczne = 2600 * 0.1371
        Log.d("TEST", skladkiSpoleczne.toString())

        //2243,54 uzyskany wynik * 9% = 201,92
        val kwotaBruttozSkladkaSpoleczna = kwotaBrutto - skladkiSpoleczne
        Log.d("TEST", kwotaBruttozSkladkaSpoleczna.toString())
        val skladkaZdrowotnaDOPotracenia = kwotaBruttozSkladkaSpoleczna * 0.09
        Log.d("TEST", skladkaZdrowotnaDOPotracenia.toString())
        //2243,54 uzyskany wynik*7,75% = 173,87
        val skladkaZdrowotnaDoObliczenia = kwotaBruttozSkladkaSpoleczna * 0.0775
        Log.d("TEST", skladkaZdrowotnaDoObliczenia.toString())

        // 2243,54 uzyskany wynik - 250 = 1994
        val podstawaOpodatkowania = kwotaBruttozSkladkaSpoleczna - 250
        Log.d("TEST", podstawaOpodatkowania.toString())
        // 1994 x 17 % ( if zarobki roczne <85528 jeśli > 32% ) - 43,76 = 295,22
        val rocznyZarobek = kwotaBrutto * 12
        Log.d("TEST", rocznyZarobek.toString())
        val progPodatkowy = if(rocznyZarobek < 85528) podstawaOpodatkowania * 0.17 else podstawaOpodatkowania * 0.32
        Log.d("TEST", progPodatkowy.toString())
        val zaliczkaNaPodatek = progPodatkowy - 43.76
        Log.d("TEST", zaliczkaNaPodatek.toString())
        // zaokr. 295 - 173,87 = 121,35 = zaokr
        val podatekDoUrzedu = Math.round(zaliczkaNaPodatek - skladkaZdrowotnaDoObliczenia)
        Log.d("TEST", podatekDoUrzedu.toString())
       // 2600 - skladki z 1 czyli - 356,46 - 201,92 - 121 = 1920,62 netto
        val kwotaNetto = kwotaBrutto - skladkiSpoleczne - skladkaZdrowotnaDOPotracenia - podatekDoUrzedu
        return 20000
        return kwotaNetto.toLong()
    }

    fun obliczenieUmowaOZlecenie(kwotaBrutto:Long) :  Long{
        return 40000
        return (kwotaBrutto * 0.7458).toLong()
    }

}
