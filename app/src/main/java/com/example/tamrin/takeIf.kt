package com.example.tamrin

import kotlin.random.Random

fun main(){
    val number=Random.nextInt()

    // takeIf
    val evenOrNull=number.takeIf { it %2 ==0 }
    println(evenOrNull)


    // takeUnless
    val oddOrNull=number.takeUnless { it % 2 ==0 }
    println(oddOrNull)
}