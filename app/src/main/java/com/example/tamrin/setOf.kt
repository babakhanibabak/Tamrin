package com.example.tamrin

fun main(){
    val numbers= setOf(1,2,8,15)
    println(numbers)

    //if do not have variable we should define type of that for example string or integer or...
    val num2= setOf<String>()
    println(num2)

    // setOf can only including one of null variable
    val num3= setOf(3,null,6,15)
    println(num3)

    /* can not add or remove anything to set
    set is not mutable */
}