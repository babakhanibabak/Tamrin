package com.example.tamrin

fun main(){
    val name="Babak"
    when (name[0].uppercase()){
        "a","b","c"-> println("hello $name, welcome")
        "d","e","f" -> println("hi $name, how are you?")
        else -> print("hello")
    }
}