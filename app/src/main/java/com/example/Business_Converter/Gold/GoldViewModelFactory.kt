package com.example.Business_Converter.Gold

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.network.Repository

class GoldViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GoldViewModel(repository) as T
    }
}