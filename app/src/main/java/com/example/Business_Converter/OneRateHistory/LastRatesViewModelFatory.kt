package com.example.Business_Converter.OneRateHistory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.network.Repository

class LastRatesViewModelFatory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LastRatesViewModel(repository) as T
    }
}