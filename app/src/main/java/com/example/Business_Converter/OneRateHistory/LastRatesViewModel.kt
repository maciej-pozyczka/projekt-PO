package com.example.Business_Converter.OneRateHistory

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Business_Converter.CoursesCalculator.models.SingleRateModel
import com.example.Business_Converter.network.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class LastRatesViewModel(private val repository: Repository): ViewModel() {

    val ratesResponse: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()

    fun getSomeRates(code: String, number: Int) {
        viewModelScope.launch {
            val response = repository.getSomeRates(code, number)
            ratesResponse.value = response
        }
    }
}