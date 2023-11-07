package com.example.tamrin

import java.lang.IllegalStateException

@Throws(IllegalStateException::class)
fun main() {
    var amount = "books"
    try {
        println(amount.toInt())
    } catch (e: NumberFormatException) {
        println("A number format exception occurred")
    } catch (e: Exception) {
        println("A general exception occurred")
    } finally {
        println("execution has completed")
    }
   // throw IllegalStateException("I don't like this input")

    println("at continue more code here")
}