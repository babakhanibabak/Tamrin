package com.example.tamrin

class Car3 {
    var model = "tondar"
    var topSpeed = 100

    fun start() {
        println("starting the $model")
    }

    init {
        println("model $model topSpeed $topSpeed")
    }
}

fun main() {
    val myCar = Car3()
    myCar.start()
}
