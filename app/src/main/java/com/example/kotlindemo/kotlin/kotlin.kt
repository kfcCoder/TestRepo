package com.example.kotlindemo.kotlin

import kotlin.math.round


fun main() {

    val list = listOf(1,2, 3)
    val mapList = list.map { it * it } // 1, 4, 9
    println(mapList)
}

