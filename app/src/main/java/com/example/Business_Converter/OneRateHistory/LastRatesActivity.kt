package com.example.Business_Converter.OneRateHistory

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.R
import com.example.Business_Converter.network.Repository
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class LastRatesActivity : AppCompatActivity() {

    private lateinit var viewModel: LastRatesViewModel
    private lateinit var getButton: Button
    private lateinit var codeEditText: EditText
    private lateinit var numberEditText: EditText
    private lateinit var lineRateChart : LineChart


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_rates)

        getButton = findViewById(R.id.getRatesButton)
        codeEditText = findViewById(R.id.codeText)
        numberEditText = findViewById(R.id.numberText)
        lineRateChart = findViewById(R.id.rateChart)

        val repository = Repository()
        val viewModelFactory = LastRatesViewModelFatory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(LastRatesViewModel::class.java)

        getButton.setOnClickListener {
            val myCode = codeEditText.text.toString()
            val myNumber = numberEditText.text.toString()
            if (myCode.length > 0 && myNumber.length > 0) {
                viewModel.getSomeRates(myCode,Integer.parseInt(myNumber))
                viewModel.ratesResponse.observe(this, Observer { response ->

                    if (response.isSuccessful) {
                        val arrayList = ArrayList<Entry>()
                        val xvalues = ArrayList<String>()
                        val myJson = response.body()?.rates

                        if (myJson != null) {
                            for (i in myJson.indices) {
                                val object0 = myJson[i]
                                val cena0 = object0.mid.toFloat()

                                val data0 = object0.effectiveDate
                                xvalues.add(data0)
                                arrayList.add(Entry(cena0,i))

                                val dataset = LineDataSet(arrayList, "${myJson.size} ostatnich kursów")
                                dataset.color = resources.getColor(R.color.design_default_color_primary_dark)

                                dataset.setDrawFilled(true)
                                dataset.fillColor = resources.getColor(R.color.design_default_color_primary_dark)
                                dataset.fillAlpha = 30
                                val dane = LineData(xvalues,dataset)

                                lineRateChart.data = dane
                                lineRateChart.setBackgroundColor(resources.getColor(R.color.white))
                                lineRateChart.animateXY(3000,3000)

                            }
                        }

                    } else {
                        //resultTextView.text = "Error"

                    }

                })
            } else {
                Log.d("error", "error")
            }

        }
    }
}