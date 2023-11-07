package com.example.tamrin

import android.app.AlertDialog
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

@Composable
fun AlertDialog() {
    val openDialog = remember {
        mutableStateOf(false)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "open dialog")
        }
        if (openDialog.value)
            androidx.compose.material3.AlertDialog(
                onDismissRequest = {openDialog.value=false },
                title = { Text(text = "hello")},
                text = { Text(text = "how are you")},
                confirmButton = { 
                    Button(onClick = { openDialog.value=false}) {
                        Text(text = "good")
                    }
                },
                dismissButton = {
                    Button(onClick = { openDialog.value=false }) {
                        Text(text = "bad")
                    }
                }
            )

    }
}