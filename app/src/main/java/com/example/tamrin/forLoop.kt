package com.example.tamrin

fun main() {
    val year = 2003
    for (i in 1..12) {
        val message = when (i) {
            1 -> "january has 31 days"
            2 -> if (year % 4 == 0) "february has 29 days" else "february has 28 days"
            3 -> "march has 31 days"
            4 -> "april has 30 days"
            5 -> "may has 31 days"
            6 -> "jane has 30 days"
            7 -> "july has 31 days"
            8 -> "august has 31 days"
            9 -> "september has 30 days"
            10 -> "october has 31 days"
            11 -> "november has 30 days"
            12 -> "december has 31 days"
            else -> ""
        }
        println(message)
    }

}