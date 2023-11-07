package com.example.tamrin

fun main (){

    //add or remove anything to hashSet
    val numbers= hashSetOf(3,5,47,null)
    println(numbers)
    numbers.add(23)
    numbers.remove(3)
    println(numbers)

    //define type of hashSet if don't have element
    val noNumbers= hashSetOf<Int>()
    println(noNumbers)


val newNumbers= hashSetOf(6,9)
    numbers.addAll(newNumbers)
    println(numbers)
}