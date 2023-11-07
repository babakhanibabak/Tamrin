package com.example.tamrin

fun main(){

    val amount:Int?=4

   /*ضرب*/    println(amount?.times(3))
    /*جمع*/    println(amount?.plus(3))
    /*منها*/    println(amount?.minus(3))
    /*تقسیم*/    println(amount?.div(3))
    /*باقیمانده*/  println(amount?.rem(3))

}