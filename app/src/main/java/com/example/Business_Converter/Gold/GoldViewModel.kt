package com.example.Business_Converter.Gold

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Business_Converter.network.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class GoldViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<ArrayList<GoldModelItem>>> = MutableLiveData()

    fun getGold() {
        viewModelScope.launch {
            val response = repository.getGold()
            myResponse.value = response

        }
    }
}