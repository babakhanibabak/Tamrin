package com.example.tamrin

fun main() {

    double(5)
    double(5, message = "please put")

    double222(56, message = "correct double is")

    val r=27
    println("${calculateCircleArea(r)}")
}

// functions

fun double(number: Int, message: String = "the double is") {
    println("$message ${number * 2}")
}

fun double222(number: Int, message: String) {
    println("$message ${number * 2}")
}

// function can return a argument
fun calculateCircleArea(r:Int):Double{
    val pi=3.14
    return pi*r*r
}