package com.example.Business_Converter.Chart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.Gold.GoldViewModel
import com.example.Business_Converter.Gold.GoldViewModelFactory
import com.example.Business_Converter.R
import com.example.Business_Converter.network.Repository
import com.github.mikephil.charting.charts.LineChart

class ChartActivity : AppCompatActivity() {

    private lateinit var lineGoldChart: LineChart
    private lateinit var viewModel: GoldViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        lineGoldChart = findViewById(R.id.lineChart)


        val repository = Repository()
        val viewModelFactory = GoldViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory ).get(GoldViewModel::class.java)
        viewModel.getGold()

        val chartSetup = ChartSetup
        ChartSetup.chartLogic(viewModel = viewModel, context = this, lineChart = lineGoldChart, resources = resources)

    }
}




