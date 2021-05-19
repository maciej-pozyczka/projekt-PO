package com.example.Business_Converter.CoursesCalculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Business_Converter.CoursesCalculator.models.SingleRateModel
import com.example.Business_Converter.network.Repository
import kotlinx.coroutines.launch
import retrofit2.Response


class CoursesCalculatorViewModel(private val repository: Repository): ViewModel() {

    val singleRateResponeCHF: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeEUR: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeUSD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeTHB: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeAUD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeHKD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeCAD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeNZD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeSGD: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeHUF: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeGBP: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeUAH: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeJPY: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeCZK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeDKK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeISK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeNOK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeSEK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeHRK: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeRON: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeBGN: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeTRY: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeILS: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeCLP: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponePHP: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeMXN: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeZAR: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeBRL: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeMYR: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeRUB: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeIDR: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeINR: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeKRW: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()
    val singleRateResponeCNY: MutableLiveData<Response<SingleRateModel>> = MutableLiveData()



    fun getCHF() {
        viewModelScope.launch {
            val response = repository.getCHF()
            singleRateResponeCHF.value = response
        }
    }

    fun getUSD() {
        viewModelScope.launch {
            val response = repository.getUSD()
            singleRateResponeUSD.value = response
        }
    }

    fun getEUR() {
        viewModelScope.launch {
            val response = repository.getEUR()
            singleRateResponeEUR.value = response
        }
    }

    fun getTHB() {
        viewModelScope.launch {
            val response = repository.getTHB()
            singleRateResponeTHB.value = response
        }
    }

    fun getAUD() {
        viewModelScope.launch {
            val response = repository.getAUD()
            singleRateResponeAUD.value = response
        }
    }

    fun getHKD() {
        viewModelScope.launch {
            val response = repository.getHKD()
            singleRateResponeHKD.value = response
        }
    }

    fun getCAD() {
        viewModelScope.launch {
            val response = repository.getCAD()
            singleRateResponeCAD.value = response
        }
    }

    fun getNZD() {
        viewModelScope.launch {
            val response = repository.getNZD()
            singleRateResponeNZD.value = response
        }
    }

    fun getSGD() {
        viewModelScope.launch {
            val response = repository.getSGD()
            singleRateResponeSGD.value = response
        }
    }

    fun getHUF() {
        viewModelScope.launch {
            val response = repository.getHUF()
            singleRateResponeHUF.value = response
        }
    }

    fun getGBP() {
        viewModelScope.launch {
            val response = repository.getGBP()
            singleRateResponeGBP.value = response
        }
    }

    fun getUAH() {
        viewModelScope.launch {
            val response = repository.getUAH()
            singleRateResponeUAH.value = response
        }
    }

    fun getJPY() {
        viewModelScope.launch {
            val response = repository.getJPY()
            singleRateResponeJPY.value = response
        }
    }

    fun getCZK() {
        viewModelScope.launch {
            val response = repository.getCZK()
            singleRateResponeCZK.value = response
        }
    }

    fun getDKK() {
        viewModelScope.launch {
            val response = repository.getDKK()
            singleRateResponeDKK.value = response
        }
    }

    fun getISK() {
        viewModelScope.launch {
            val response = repository.getISK()
            singleRateResponeISK.value = response
        }
    }

    fun getNOK() {
        viewModelScope.launch {
            val response = repository.getNOK()
            singleRateResponeNOK.value = response
        }
    }

    fun getSEK() {
        viewModelScope.launch {
            val response = repository.getSEK()
            singleRateResponeSEK.value = response
        }
    }

    fun getHRK() {
        viewModelScope.launch {
            val response = repository.getHRK()
            singleRateResponeHRK.value = response
        }
    }

    fun getRON() {
        viewModelScope.launch {
            val response = repository.getRON()
            singleRateResponeRON.value = response
        }
    }

    fun getBGN() {
        viewModelScope.launch {
            val response = repository.getBGN()
            singleRateResponeBGN.value = response
        }
    }

    fun getTRY() {
        viewModelScope.launch {
            val response = repository.getTRY()
            singleRateResponeTRY.value = response
        }
    }

    fun getILS() {
        viewModelScope.launch {
            val response = repository.getILS()
            singleRateResponeILS.value = response
        }
    }

    fun getCLP() {
        viewModelScope.launch {
            val response = repository.getCLP()
            singleRateResponeCLP.value = response
        }
    }

    fun getPHP() {
        viewModelScope.launch {
            val response = repository.getPHP()
            singleRateResponePHP.value = response
        }
    }

    fun getMXN() {
        viewModelScope.launch {
            val response = repository.getMXN()
            singleRateResponeMXN.value = response
        }
    }

    fun getZAR() {
        viewModelScope.launch {
            val response = repository.getZAR()
            singleRateResponeZAR.value = response
        }
    }

    fun getBRL() {
        viewModelScope.launch {
            val response = repository.getBRL()
            singleRateResponeBRL.value = response
        }
    }

    fun getMYR() {
        viewModelScope.launch {
            val response = repository.getMYR()
            singleRateResponeMYR.value = response
        }
    }

    fun getRUB() {
        viewModelScope.launch {
            val response = repository.getRUB()
            singleRateResponeRUB.value = response
        }
    }

    fun getIDR() {
        viewModelScope.launch {
            val response = repository.getIDR()
            singleRateResponeIDR.value = response
        }
    }

    fun getINR() {
        viewModelScope.launch {
            val response = repository.getINR()
            singleRateResponeINR.value = response
        }
    }

    fun getKRW() {
        viewModelScope.launch {
            val response = repository.getKRW()
            singleRateResponeKRW.value = response
        }
    }

    fun getCNY() {
        viewModelScope.launch {
            val response = repository.getCNY()
            singleRateResponeCNY.value = response
        }
    }
}