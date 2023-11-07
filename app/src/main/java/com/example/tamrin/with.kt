package com.example.tamrin

import androidx.compose.foundation.interaction.DragInteraction

fun main() {
    with(Car3()) {
        model = "ford"
        topSpeed = 250
        start()
    }
}