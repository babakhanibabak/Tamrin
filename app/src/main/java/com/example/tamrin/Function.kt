package com.example.tamrin

fun main() {

    double(number = 5)
    double(number = 5, message = "please put")

    double222(56, message = "correct double is")

    val r = 27
    println("${calculateCircleArea(r)}")

    double333(13f, "farzad", 10)
    double333(message = "farzad", number = 10, age = 13f)
}

// functions

fun double(message: String = "the double is", number: Int) {
    println("$message ${number * 2}")
}

fun double222(number: Int, message: String) {
    println("$message ${number * 2}")
}

fun double333(age: Float, message: String, number: Int) {

}

// function can return a argument
fun calculateCircleArea(r: Int): Double {
    val pi = 3.14
    return pi * r * r
}