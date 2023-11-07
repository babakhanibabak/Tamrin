package com.example.tamrin

fun main() {
animals()
}

// local function : a function inside a function

fun animals() {

    fun oneAnimal(animal: String) {
        println("I have $animal")
    }

    val animals = listOf("cat", "dog", "cow", "horse")
    for (animal in animals)
        oneAnimal(animal)
}