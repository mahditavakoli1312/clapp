package com.example.collegeapp.home

import androidx.annotation.DrawableRes

data class ArticleEntity(
    val title: String,
    @DrawableRes
    val image: Int,
    val time: String,
    val writer: String,
    val tag: String
)
