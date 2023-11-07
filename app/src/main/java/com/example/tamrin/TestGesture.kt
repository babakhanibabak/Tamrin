package com.example.tamrin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@Composable
fun TestGesture() {
    val gestureDetector = remember {
        mutableStateOf("no gesture")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = gestureDetector.value)
        var txtState by remember { mutableStateOf(0) }
        Box(modifier = Modifier
            .size(200.dp)
            .clickable { txtState += 1 }
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = { gestureDetector.value = "onTap x : ${it.x} y: ${it.y}" },
                    onPress = { gestureDetector.value = "onPress" },
                    onDoubleTap = { gestureDetector.value = "onDoubleTap" },
                    onLongPress = { gestureDetector.value = "onLongPress" }

                )


            }
        ){
            Text(text = "Clicked $txtState times" , modifier = Modifier.align(Alignment.Center))
        }
    }
}