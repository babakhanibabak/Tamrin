package com.example.tamrin

interface Oven{
var temperature:Int
fun turnOn()
fun turnOff()
fun cook(){
    println("cooking at $temperature degrees")
}

}
class Samsung: Oven{
    override var temperature=200
     var warrantyYear=2
    override fun turnOn() {
      println("turn on")
    }

    override fun turnOff() {
       println("turn off")
    }
}

fun ovenFactory(): Oven=Samsung()

fun main(){
    val myOven= ovenFactory()
    myOven.cook()
    myOven.turnOff()
    myOven.turnOn()
    myOven.temperature

}