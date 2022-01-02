package com.example.exam2021.models

import java.io.Serializable

data class News(
    var categoryId:Int,
    var image: String,
    val titleNews: String,
    val description: String ?= null
): Serializable



