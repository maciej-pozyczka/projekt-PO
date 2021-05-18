package com.example.Business_Converter.Courses

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Business_Converter.network.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class CoursesViewModel(private val repository: Repository): ViewModel() {

    val myResponse2: MutableLiveData<Response<ArrayList<CoursesItem>>> = MutableLiveData()

    fun getCourses() {
        viewModelScope.launch {
            val response = repository.getCourses()
            myResponse2.value = response
        }
    }


}