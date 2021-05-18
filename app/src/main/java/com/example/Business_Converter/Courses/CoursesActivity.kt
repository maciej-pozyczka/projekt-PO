package com.example.Business_Converter.Courses

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Business_Converter.R
import com.example.Business_Converter.network.Repository

class CoursesActivity : AppCompatActivity() {

    private lateinit var viewModel: CoursesViewModel
    private val coursesAdapter by lazy { CoursesAdapter() }
    private lateinit var recyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        recyclerView =  findViewById(R.id.recyclerCoursesView)

        setupRecyclerView()


        val repository = Repository()
        val viewModelFactory = CoursesViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(CoursesViewModel::class.java)
        viewModel.getCourses()
        viewModel.myResponse2.observe(this, Observer { response ->
            if (response.isSuccessful) {
                val coursesItem = response.body()?.get(0)
                val rates = coursesItem?.rates
                if (rates != null) {
                    coursesAdapter.setData(rates)
                }
            } else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }


        })

    }

    private fun setupRecyclerView() {
        recyclerView.adapter = coursesAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

}

