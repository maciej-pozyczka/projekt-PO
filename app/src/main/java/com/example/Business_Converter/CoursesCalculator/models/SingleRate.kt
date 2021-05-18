package com.example.Business_Converter.CoursesCalculator.models

import java.math.BigDecimal


data class SingleFinalRate(
    val effectiveDate: String,
    val mid: BigDecimal,
    val no: String
)