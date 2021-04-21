package com.example.Business_Converter.network

import com.example.Business_Converter.Courses.CoursesItem
import com.example.Business_Converter.CoursesCalculator.models.SingleRateModel
import com.example.Business_Converter.Gold.GoldModelItem
import retrofit2.Response

class Repository {

    suspend fun getGold(): Response<ArrayList<GoldModelItem>> {
        return RetrofitInstance.api.getGold()
    }

    suspend fun getCourses(): Response<ArrayList<CoursesItem>> {
        return RetrofitInstance.api.getCourses()
    }

    suspend fun getCHF(): Response<SingleRateModel> {
        return RetrofitInstance.api.getCHF()
    }

    suspend fun getUSD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getUSD()
    }

    suspend fun getTHB(): Response<SingleRateModel> {
        return RetrofitInstance.api.getTHB()
    }

    suspend fun getAUD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getAUD()
    }

    suspend fun getHKD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getHKD()
    }

    suspend fun getCAD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getCAD()
    }

    suspend fun getNZD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getNZD()
    }

    suspend fun getSGD(): Response<SingleRateModel> {
        return RetrofitInstance.api.getSGD()
    }

    suspend fun getHUF(): Response<SingleRateModel> {
        return RetrofitInstance.api.getHUF()
    }

    suspend fun getEUR(): Response<SingleRateModel> {
        return RetrofitInstance.api.getEUR()
    }

    suspend fun getGBP(): Response<SingleRateModel> {
        return RetrofitInstance.api.getGBP()
    }

    suspend fun getUAH(): Response<SingleRateModel> {
        return RetrofitInstance.api.getUAH()
    }

    suspend fun getJPY(): Response<SingleRateModel> {
        return RetrofitInstance.api.getJPY()
    }

    suspend fun getCZK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getCZK()
    }

    suspend fun getDKK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getDKK()
    }

    suspend fun getISK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getISK()
    }

    suspend fun getNOK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getNOK()
    }

    suspend fun getSEK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getSEK()
    }

    suspend fun getHRK(): Response<SingleRateModel> {
        return RetrofitInstance.api.getHRK()
    }

    suspend fun getRON(): Response<SingleRateModel> {
        return RetrofitInstance.api.getRON()
    }

    suspend fun getBGN(): Response<SingleRateModel> {
        return RetrofitInstance.api.getBGN()
    }

    suspend fun getTRY(): Response<SingleRateModel> {
        return RetrofitInstance.api.getTRY()
    }

    suspend fun getILS(): Response<SingleRateModel> {
        return RetrofitInstance.api.getILS()
    }

    suspend fun getCLP(): Response<SingleRateModel> {
        return RetrofitInstance.api.getCLP()
    }

    suspend fun getPHP(): Response<SingleRateModel> {
        return RetrofitInstance.api.getPHP()
    }

    suspend fun getMXN(): Response<SingleRateModel> {
        return RetrofitInstance.api.getMXN()
    }

    suspend fun getZAR(): Response<SingleRateModel> {
        return RetrofitInstance.api.getZAR()
    }

    suspend fun getBRL(): Response<SingleRateModel> {
        return RetrofitInstance.api.getBRL()
    }

    suspend fun getMYR(): Response<SingleRateModel> {
        return RetrofitInstance.api.getMYR()
    }

    suspend fun getRUB(): Response<SingleRateModel> {
        return RetrofitInstance.api.getRUB()
    }

    suspend fun getIDR(): Response<SingleRateModel> {
        return RetrofitInstance.api.getIDR()
    }

    suspend fun getINR(): Response<SingleRateModel> {
        return RetrofitInstance.api.getINR()
    }

    suspend fun getKRW(): Response<SingleRateModel> {
        return RetrofitInstance.api.getKRW()
    }

    suspend fun getCNY(): Response<SingleRateModel> {
        return RetrofitInstance.api.getCNY()
    }
}