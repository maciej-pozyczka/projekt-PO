package com.example.Business_Converter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.Gold.GoldViewModel
import com.example.Business_Converter.Gold.GoldViewModelFactory
import com.example.Business_Converter.network.Repository
import com.github.mikephil.charting.charts.LineChart

class ChartActivity : AppCompatActivity() {

    private lateinit var lineChart: LineChart
    private lateinit var viewModel: GoldViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        lineChart = findViewById(R.id.lineChart)


        val repository = Repository()
        val viewModelFactory = GoldViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory ).get(GoldViewModel::class.java)
        viewModel.getGold()

        val chartSetup = ChartSetup
        chartSetup.chartLogic(viewModel = viewModel, context = this, lineChart = lineChart, resources = resources)



//        viewModel.myResponse.observe(this, Observer {response ->
//            if(response.isSuccessful){
//
//                val arrayList = ArrayList<Entry>()
//                val xvalues = ArrayList<String>()
//                val my_json = response.body()
//
//                if (my_json != null) {
//                    for (i in 0 until my_json.size) {
//                        val object0 = my_json[i]
//                        val cena0 = object0.cena.toFloat()
//                        //val dataReplace = object0.data.replace("-",".")
//                       // val data0 = dataReplace.substring(5,10).toFloat()
//                        val data0 = object0.data
//                        xvalues.add(data0)
//                        arrayList.add(Entry(cena0,i))
//
//                        val dataset = LineDataSet(arrayList, "First")
//                        dataset.color = resources.getColor(R.color.design_default_color_primary_dark)
//
//                        dataset.setDrawFilled(true)
//                        dataset.fillColor = resources.getColor(R.color.design_default_color_primary_dark)
//                        dataset.fillAlpha = 30
//                        //dataset.dra
//                        val dane = LineData(xvalues,dataset)
//
//                        lineChart.data = dane
//                        lineChart.setBackgroundColor(resources.getColor(R.color.white))
//                        lineChart.animateXY(3000,3000)
//
//                    }
//                }
//
//
//            }else {
//                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
//            }
//
//        })
    }
}




