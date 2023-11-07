package com.example.tamrin

fun main() {
    var puzzlePieces = 20
    var piecesPlaced = 0

    // while loop
    while (piecesPlaced < puzzlePieces) {
        println("pieces $piecesPlaced placed")
        piecesPlaced++
    }

    // do while
    do {
        println("pieces $piecesPlaced placed")
        piecesPlaced++
    } while (piecesPlaced < puzzlePieces)

    // exercise

    val largeNumber = 2554
    var i = 0
    while (i < largeNumber) {
        if (i % 7 == 0)
            println(i)
        i++

    }

}