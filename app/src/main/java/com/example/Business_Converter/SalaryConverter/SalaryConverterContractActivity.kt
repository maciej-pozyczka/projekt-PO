package com.example.Business_Converter.SalaryConverter

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.Business_Converter.R


class SalaryConverterContractActivity:AppCompatActivity() {
    // companion object to statyczny obiekt przechowujacy statyczne obiekty, zmienne, badz metody
    companion object {
        const val CONTRACT_KEY : String = "contract_key" //
        const val IS_UNDER_26_AND_STUDENT_KEY : String = "is_under_26_and_student_key"
        const val IS_PAYING_SICKNESS : String = "is_paying_sickness"
    }

    lateinit var umowaOPraceTextView : TextView
    lateinit var umowaOZlecenieTextView : TextView
    lateinit var umowaODzieloTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_contract)

        umowaOPraceTextView = findViewById(R.id.umowaOPraceWartosc)
        umowaOZlecenieTextView = findViewById(R.id.umowaOZlecenieWartosc)
        umowaODzieloTextView = findViewById(R.id.umowaOdzieloWartosc)

        //odwolujemy sie do "paczki" ktora mogla byc przekazana do intencji uruchamiajcej nasza aktywnosc
        val intentBundle : Bundle? = intent.extras
        val salaryBruttoValue : Long?= intentBundle?.getLong(CONTRACT_KEY)
        val isUnder26AndStudent : Boolean? = intentBundle?.getBoolean(IS_UNDER_26_AND_STUDENT_KEY)
        val isPayingSickness : Boolean? = intentBundle?.getBoolean(IS_PAYING_SICKNESS)

        if(salaryBruttoValue != null) {
            umowaOPraceTextView.text = obliczenieUmowaOprace(salaryBruttoValue).toString() + " PLN"
            if(isUnder26AndStudent != null && isPayingSickness != null) {
                umowaOZlecenieTextView.text = obliczenieUmowaOZlecenie(
                    salaryBruttoValue,
                    isUnder26AndStudent,
                    isPayingSickness
                ).toString() + " PLN"
            }
            umowaODzieloTextView.text = obliczenieUmowaODzielo(salaryBruttoValue).toString() + " PLN"
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

        return kwotaNetto.toLong()
    }

    fun obliczenieUmowaODzielo(kwotaBrutto: Long) : Long{
        return (kwotaBrutto * 0.7458).toLong()
    }

    fun obliczenieUmowaOZlecenie(kwotaBrutto:Long, isUnder26AndStudent : Boolean, isPayingSickness : Boolean) : Long{
        if(!isUnder26AndStudent) {
            // Wpisujemy kwotę brutto
            // składki społeczne: dwie składki obowiązkowe : emerytalna 9,75% i rentowa 1,5%, skłądka chorobowa jest dobrowolna i wynosi 2.45%, czyli kwota brutto*13,71% lub kwota brutto*11,26
            val skladkaEmerytlna = kwotaBrutto * 0.0975
            val skladaRentowa = kwotaBrutto * 0.015

            val skladkaChorobwa: Double = if (isPayingSickness) kwotaBrutto * 0.045 else 0.00

            val skladkiSpoleczne = skladkaEmerytlna + skladaRentowa + skladkaChorobwa

            //wymiar składek zdrowotnych : brutto - składki społeczene
            val wymiarSkladekZdorowtnych = kwotaBrutto - skladkiSpoleczne
            // składka zdrowotna do potrącenia : wymiar składek zdrowotnych * 9%
            val skladkZdrowotnaDoPotracenia = wymiarSkladekZdorowtnych * 0.09
            //składka zdrowotna do obliczenia : wymiar składek zdrowotnych * 7,75%
            val skladaZdrowotnaDoObliczenia = wymiarSkladekZdorowtnych * 0.075
            // koszt uzyskania przychodu wymiar składek zdrowotnych * 20%
            val kosztUzyskaniaPrzychodu = wymiarSkladekZdorowtnych * 0.2
            // podstawa opodatkowania : wymiar składek zdrowotnyych - koszt uzyskania przychodu = kwotę zaokrąglić
            val podstawaOpodatkowania =
                Math.round(wymiarSkladekZdorowtnych - kosztUzyskaniaPrzychodu)
            // podatek należny = podstawa opodatkowania * 18%
            val podatekNalezny = podstawaOpodatkowania * 0.18
            // podatek do urzędu = podaten należny - składka zdrowotna do obliczenia zaokrąglić
            val podatekDoUrzedu = Math.round(podatekNalezny - skladaZdrowotnaDoObliczenia)
            // netto = brutto - składki społeczne - składka zdrowotna do potrącenia - podatek do urzędu skarbowego
            val kwotaNetto =
                kwotaBrutto - skladkiSpoleczne - skladkZdrowotnaDoPotracenia - podatekDoUrzedu

            return kwotaNetto.toLong()
        }else{
            return kwotaBrutto
        }
    }

}
