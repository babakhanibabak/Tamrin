package com.example.tamrin.ui

import android.provider.CalendarContract.Colors
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.tamrin.R

@Composable
fun button() {
    val context = LocalContext.current
    val btnImage = painterResource(id = R.drawable.baseline_person_24)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Blue
            )
        ) {
            Image(painter = btnImage, contentDescription = null)
            Text(text = "Profile")
        }

    }
}