package com.example.tamrin

class Car2 {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name="high speed car $value"
        }
}
fun main(){
val myCar=Car2()
    myCar.speed=100
    println("my car is: ${myCar.name}")
    println("my car is: ${myCar.speed}")
}