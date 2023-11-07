package com.example.tamrin

import kotlin.random.Random

fun main(){
val someLargeVariable:String by lazy { "A large Value" }

    val rand= Random.nextInt()
    if (rand % 2 == 0)
        println(someLargeVariable)
}