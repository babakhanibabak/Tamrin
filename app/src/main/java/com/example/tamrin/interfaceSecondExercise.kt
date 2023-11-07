package com.example.tamrin

import kotlin.random.Random

interface Coffee{
    fun wakeUp()
    fun quenchThirst()
}

// Arabica
class Arabica:Coffee{
    override fun wakeUp() {
        println("waking up with arabica")
    }

    override fun quenchThirst() {
      println("quenching your arabica thirst ")
    }
}

// Robusta
class Robusta:Coffee{
    override fun wakeUp() {
println(" Robusta will wake you up")
    }

    override fun quenchThirst() {
        println("Robusta will quench your thirst ")
    }
}

class CoffeeShop{
    fun purchaseCoffee():Coffee{
        return if (Random.nextInt() %2 ==0)
            Arabica()
        else Robusta()
    }
}

/////////////// main

fun main(){
    val myCoffeeShop = CoffeeShop()
    for (i in 1..5){
        val coffee=myCoffeeShop.purchaseCoffee()
    coffee.wakeUp()
    coffee.quenchThirst()
}
}