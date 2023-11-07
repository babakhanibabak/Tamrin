package com.example.tamrin

class Car4 {
    companion object {
        fun getDrivingInstructions():String{
return "drive safe"
        }
    }
}
fun main(){
    val message=Car4.getDrivingInstructions()
    println(message)
}