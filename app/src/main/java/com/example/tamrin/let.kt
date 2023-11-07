package com.example.tamrin

fun getName(): String? = null

fun main() {
    getName()?.let { name -> println("hello $name") }


    val animals = arrayListOf("cat", "dog", "mouse")
    animals.map { it.length }
        .filter { it>3 }
        .let { println("the size of the list is ${it.size}") }
}