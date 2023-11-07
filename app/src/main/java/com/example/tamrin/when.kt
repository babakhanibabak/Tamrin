package com.example.tamrin

fun main() {
    val name = "babak"

    when (name[0].lowercase()) {

        "a", "b", "c" -> println("hello $name, welcome")

        "d", "e", "f" -> println("hi $name, how are you?")

        else -> print("hello")
    }
}