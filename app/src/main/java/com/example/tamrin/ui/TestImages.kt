package com.example.tamrin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.tamrin.R

@Composable
fun TestImages() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(100.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            val imgRes = painterResource(id = R.drawable.flower)
            Image(
                painter = imgRes,
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
        }
        val iconRes = painterResource(id = R.drawable.baseline_attribution_24)
        Image(
            painter = iconRes,
            contentDescription = null,
            colorFilter = ColorFilter.tint(Color.Green)
        )
        AsyncImage(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQp0OXePZNKHNaSLwXWDiZgfoZQ1a5Fcy6aKkF6VfNPlg&s",
            contentDescription = null
        )
    }
}