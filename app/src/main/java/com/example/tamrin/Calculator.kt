package com.example.tamrin

class Calculator {
    var total=0.0
    fun add(a:Double){
        total += a
        println("+ $a")
        println("= $total")
    }
    fun sub(a:Double){
        total -= a
        println("- $a")
        println("= $total")
    }
    fun mull(a:Double){
        total *= a
        println("* $a")
        println("= $total")
    }
    fun div(a:Double){
        total /= a
        println("/ $a")
        println("= $total")
    }
    fun reset(){
        total = 0.0
        println("reset")
        println("= $total")
    }

}
fun main(){
    val calc=Calculator()
    calc.add(20.0)
    calc.div(15.0)
    calc.mull(30.0)
    calc.sub(5.0)
    calc.reset()
    calc.add(3.0)
}