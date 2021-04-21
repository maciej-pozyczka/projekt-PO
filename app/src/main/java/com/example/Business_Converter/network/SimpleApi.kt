package com.example.Business_Converter.network

import com.example.Business_Converter.Courses.CoursesItem
import com.example.Business_Converter.CoursesCalculator.models.SingleRateModel
import com.example.Business_Converter.Gold.GoldModelItem
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    @GET("/api/exchangerates/tables/a/?format=json")
    suspend fun getCourses(): Response<ArrayList<CoursesItem>>
    @GET("/api/cenyzlota/last/30/?format=json")
    suspend fun getGold(): Response<ArrayList<GoldModelItem>>

    @GET("/api/exchangerates/rates/a/chf?format=json")
    suspend fun getCHF(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/usd?format=json")
    suspend fun getUSD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/eur?format=json")
    suspend fun getEUR(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/thb?format=json")
    suspend fun getTHB(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/aud?format=json")
    suspend fun getAUD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/hkd?format=json")
    suspend fun getHKD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/cad?format=json")
    suspend fun getCAD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/nzd?format=json")
    suspend fun getNZD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/sgd?format=json")
    suspend fun getSGD(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/huf?format=json")
    suspend fun getHUF(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/uah?format=json")
    suspend fun getUAH(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/jpy?format=json")
    suspend fun getJPY(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/czk?format=json")
    suspend fun getCZK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/dkk?format=json")
    suspend fun getDKK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/isk?format=json")
    suspend fun getISK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/nok?format=json")
    suspend fun getNOK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/sek?format=json")
    suspend fun getSEK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/hrk?format=json")
    suspend fun getHRK(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/ron?format=json")
    suspend fun getRON(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/bgn?format=json")
    suspend fun getBGN(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/try?format=json")
    suspend fun getTRY(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/ils?format=json")
    suspend fun getILS(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/clp?format=json")
    suspend fun getCLP(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/php?format=json")
    suspend fun getPHP(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/mxn?format=json")
    suspend fun getMXN(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/zar?format=json")
    suspend fun getZAR(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/brl?format=json")
    suspend fun getBRL(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/myr?format=json")
    suspend fun getMYR(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/rub?format=json")
    suspend fun getRUB(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/idr?format=json")
    suspend fun getIDR(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/inr?format=json")
    suspend fun getINR(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/krw?format=json")
    suspend fun getKRW(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/CNY?format=json")
    suspend fun getCNY(): Response<SingleRateModel>
    @GET("/api/exchangerates/rates/a/gbp?format=json")
    suspend fun getGBP(): Response<SingleRateModel>


}