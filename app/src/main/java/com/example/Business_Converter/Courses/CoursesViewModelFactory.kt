package com.example.Business_Converter.Courses

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.network.Repository

class CoursesViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CoursesViewModel(repository) as T
    }

}