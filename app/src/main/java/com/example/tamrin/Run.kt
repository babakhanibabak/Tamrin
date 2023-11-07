package com.example.tamrin

fun main(){
    val myCar=Car3().run {
        model="ferrari"
        topSpeed=300
        start()
        this
    }
   println(myCar)
}