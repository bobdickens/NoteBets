package com.example.notebets.models

import androidx.annotation.Keep

@Keep
data class News(
    val id: Int,
    val image: String,
    val name: String,
    val text: String
)