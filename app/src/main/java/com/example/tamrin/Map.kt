package com.example.tamrin

fun main(){
    var attendance = hashMapOf("23 Sept" to 2837, "24 Sept" to 3726, "25 Sept" to 6253)
    attendance["26 Sept"]=552
    println(attendance)

   val peopleOn25=attendance["25 sept"]?:0
    val peopleOn26=attendance["26 sept"]?:0
    println("people on 25 , 26 sept = ${peopleOn25+peopleOn26}")

    println("is data available for 22 sept? ${attendance.containsKey("22 sept")}")
}