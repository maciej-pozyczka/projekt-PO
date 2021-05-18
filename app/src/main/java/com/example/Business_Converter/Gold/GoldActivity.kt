package com.example.Business_Converter.Gold

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Business_Converter.network.Repository
import com.example.Business_Converter.R

class GoldActivity : AppCompatActivity() {

    private lateinit var viewModel: GoldViewModel
    private val goldAdapter by lazy { GoldAdapter() }
    private lateinit var recyclerView: RecyclerView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gold)

        recyclerView = findViewById(R.id.goldRecyclerView)
        setupGoldRecyclerView()

        val repository = Repository()
        val viewModelFactory = GoldViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory ).get(GoldViewModel::class.java)
        viewModel.getGold()
        viewModel.myResponse.observe(this, Observer {response ->
            if(response.isSuccessful){
                response.body()?.let { goldAdapter.setData(it) }
            }else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }

        })



    }

    private fun setupGoldRecyclerView(){
        recyclerView.adapter = goldAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}