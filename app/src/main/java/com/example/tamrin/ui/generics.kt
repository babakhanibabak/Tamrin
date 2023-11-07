package com.example.tamrin.ui

class Type<T>{
    fun printMessage(item:T){
        println("the item converted to a string is ${item.toString()}")
    }
}
fun main(){
    val type1=Type<Float>()
    type1.printMessage(326.42F)

    val type2=Type<HashMap<String,Int>>()
    type2.printMessage(hashMapOf("one" to 1, "two" to 2))
}