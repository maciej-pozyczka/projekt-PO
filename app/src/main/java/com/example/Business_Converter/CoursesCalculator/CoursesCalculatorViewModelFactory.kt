package com.example.Business_Converter.CoursesCalculator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.network.Repository

class CoursesCalculatorViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CoursesCalculatorViewModel(repository) as T
    }
}