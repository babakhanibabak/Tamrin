package com.example.tamrin

fun main() {
    val onlyEvenNumber = listOf(2, 8, 4, 7, 6, 9)

    for (number in onlyEvenNumber) {
        //if (number % 2 !=0) break
        if (number % 2 != 0) continue

        println("half of $number is ${number / 2} ")
    }

    println("continue execution")
}