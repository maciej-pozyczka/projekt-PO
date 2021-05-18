package com.example.Business_Converter.Chart

import android.content.res.Resources
import android.util.Log
import androidx.lifecycle.Observer
import com.example.Business_Converter.Gold.GoldViewModel
import com.example.Business_Converter.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class ChartSetup {
    companion object{
        fun chartLogic(viewModel:GoldViewModel, context: ChartActivity, lineChart: LineChart, resources: Resources){
            viewModel.myResponse.observe(context, Observer {response ->
                if(response.isSuccessful){

                    val arrayList = ArrayList<Entry>()
                    val xvalues = ArrayList<String>()
                    val my_json = response.body()

                    if (my_json != null) {
                        for (i in 0 until my_json.size) {
                            val object0 = my_json[i]
                            val cena0 = object0.cena.toFloat()

                            val data0 = object0.data
                            xvalues.add(data0)
                            arrayList.add(Entry(cena0,i))

                            val dataset = LineDataSet(arrayList, "Ostatnie 30 kursów złota")
                            dataset.color = resources.getColor(R.color.design_default_color_primary_dark)

                            dataset.setDrawFilled(true)
                            dataset.fillColor = resources.getColor(R.color.design_default_color_primary_dark)
                            dataset.fillAlpha = 30
                            val dane = LineData(xvalues,dataset)

                            lineChart.data = dane
                            lineChart.setBackgroundColor(resources.getColor(R.color.white))
                            lineChart.animateXY(3000,3000)

                        }
                    }


                }else {
                    Log.d("Error","Error")
                }
            })
        }
    }
}