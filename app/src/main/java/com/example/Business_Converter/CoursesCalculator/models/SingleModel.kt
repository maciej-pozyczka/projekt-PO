package com.example.Business_Converter.CoursesCalculator.models


data class SingleRateModel(
    val code: String,
    val currency: String,
    val rates: List<SingleFinalRate>,
    val table: String
)