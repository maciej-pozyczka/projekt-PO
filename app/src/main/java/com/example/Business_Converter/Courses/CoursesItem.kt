package com.example.Business_Converter.Courses


data class CoursesItem(

    val effectiveDate: String,
    val no: String,
    val rates: ArrayList<Rate>,
    val table: String
)
