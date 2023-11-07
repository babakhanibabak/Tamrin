package com.example.tamrin


fun main(){
    val myCar=Car3().apply {
        model="ferrari"
        topSpeed=300
       start()
    }.also {   println("this car") }

}