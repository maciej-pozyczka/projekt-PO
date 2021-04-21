package com.example.Business_Converter.CoursesCalculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Business_Converter.CoursesCalculator.models.SingleRateModel
import com.example.Business_Converter.network.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class CoursesCalculatorViewModel(private val repository: Repository): ViewModel() {

    val singleRateRespone: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()

    fun getCHF() {
        viewModelScope.launch {
            val response = repository.getCHF()
            singleRateRespone.value = response
        }
    }

    fun getUSD() {
        viewModelScope.launch {
            val response = repository.getUSD()
            singleRateRespone.value = response
        }
    }

    fun getEUR() {
        viewModelScope.launch {
            val response = repository.getEUR()
            singleRateRespone.value = response
        }
    }

    fun getTHB() {
        viewModelScope.launch {
            val response = repository.getTHB()
            singleRateRespone.value = response
        }
    }

    fun getAUD() {
        viewModelScope.launch {
            val response = repository.getAUD()
            singleRateRespone.value = response
        }
    }

    fun getHKD() {
        viewModelScope.launch {
            val response = repository.getHKD()
            singleRateRespone.value = response
        }
    }

    fun getCAD() {
        viewModelScope.launch {
            val response = repository.getCAD()
            singleRateRespone.value = response
        }
    }

    fun getNZD() {
        viewModelScope.launch {
            val response = repository.getNZD()
            singleRateRespone.value = response
        }
    }

    fun getSGD() {
        viewModelScope.launch {
            val response = repository.getSGD()
            singleRateRespone.value = response
        }
    }

    fun getHUF() {
        viewModelScope.launch {
            val response = repository.getHUF()
            singleRateRespone.value = response
        }
    }

    fun getGBP() {
        viewModelScope.launch {
            val response = repository.getGBP()
            singleRateRespone.value = response
        }
    }

    fun getUAH() {
        viewModelScope.launch {
            val response = repository.getUAH()
            singleRateRespone.value = response
        }
    }

    fun getJPY() {
        viewModelScope.launch {
            val response = repository.getJPY()
            singleRateRespone.value = response
        }
    }

    fun getCZK() {
        viewModelScope.launch {
            val response = repository.getCZK()
            singleRateRespone.value = response
        }
    }

    fun getDKK() {
        viewModelScope.launch {
            val response = repository.getDKK()
            singleRateRespone.value = response
        }
    }

    fun getISK() {
        viewModelScope.launch {
            val response = repository.getISK()
            singleRateRespone.value = response
        }
    }

    fun getNOK() {
        viewModelScope.launch {
            val response = repository.getNOK()
            singleRateRespone.value = response
        }
    }

    fun getSEK() {
        viewModelScope.launch {
            val response = repository.getSEK()
            singleRateRespone.value = response
        }
    }

    fun getHRK() {
        viewModelScope.launch {
            val response = repository.getHRK()
            singleRateRespone.value = response
        }
    }

    fun getRON() {
        viewModelScope.launch {
            val response = repository.getRON()
            singleRateRespone.value = response
        }
    }

    fun getBGN() {
        viewModelScope.launch {
            val response = repository.getBGN()
            singleRateRespone.value = response
        }
    }

    fun getTRY() {
        viewModelScope.launch {
            val response = repository.getTRY()
            singleRateRespone.value = response
        }
    }

    fun getILS() {
        viewModelScope.launch {
            val response = repository.getILS()
            singleRateRespone.value = response
        }
    }

    fun getCLP() {
        viewModelScope.launch {
            val response = repository.getCLP()
            singleRateRespone.value = response
        }
    }

    fun getPHP() {
        viewModelScope.launch {
            val response = repository.getPHP()
            singleRateRespone.value = response
        }
    }

    fun getMXN() {
        viewModelScope.launch {
            val response = repository.getMXN()
            singleRateRespone.value = response
        }
    }

    fun getZAR() {
        viewModelScope.launch {
            val response = repository.getZAR()
            singleRateRespone.value = response
        }
    }

    fun getBRL() {
        viewModelScope.launch {
            val response = repository.getBRL()
            singleRateRespone.value = response
        }
    }

    fun getMYR() {
        viewModelScope.launch {
            val response = repository.getMYR()
            singleRateRespone.value = response
        }
    }

    fun getRUB() {
        viewModelScope.launch {
            val response = repository.getRUB()
            singleRateRespone.value = response
        }
    }

    fun getIDR() {
        viewModelScope.launch {
            val response = repository.getIDR()
            singleRateRespone.value = response
        }
    }

    fun getINR() {
        viewModelScope.launch {
            val response = repository.getINR()
            singleRateRespone.value = response
        }
    }

    fun getKRW() {
        viewModelScope.launch {
            val response = repository.getKRW()
            singleRateRespone.value = response
        }
    }

    fun getCNY() {
        viewModelScope.launch {
            val response = repository.getCNY()
            singleRateRespone.value = response
        }
    }
}