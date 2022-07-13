package com.example.testing

sealed class DTO {
    data class Top(val main: String) : DTO()
    data class Item(val img: Int, val title: String, val msg: String) : DTO()
}

object TYPE{
     const val ZERO = 0
     const val ONE = 1
}