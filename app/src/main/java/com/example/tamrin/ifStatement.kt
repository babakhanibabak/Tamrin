package com.example.tamrin

fun main() {
    val night = true
    val sleepy = false

    if (night) println("Brush teeth and sleep") else println("be active")


    val number = 25
    if (number % 2 == 0) println("number is even") else println("number is odd")

    /// exercise

    val hasEggs = true
    val hasBacon = false
    val eggPrice = 5
    val baconPrice = 20
    var total = 0
    if (hasEggs) {
        total += 12 * eggPrice
        if (hasBacon)
            total += 2 * baconPrice
    } else {
        println("no eggs available")
    }
    println("total is $total")
}