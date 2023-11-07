package com.example.tamrin.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.tamrin.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestTopAppBar() {
    val context = LocalContext.current
    val icon1 = painterResource(id = R.drawable.ice_fav)
    val icon2 = painterResource(id = R.drawable.down)
    val showMenu = remember { mutableStateOf(false) }

    TopAppBar(title = { Text(text = "Top App Bar") },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.Menu, contentDescription = null)
            }
        },
        actions = {
            IconButton(onClick = {
                makeToast(context, "favoriets")
            }) {
                Icon(painter = icon1, contentDescription = null)
            }
            IconButton(onClick = { showMenu.value = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = null)
            }
            DropdownMenu(
                expanded = showMenu.value,
                onDismissRequest = { showMenu.value = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Icon(
                            painter = icon1,
                            contentDescription = null
                        )
                    }, onClick = {
                        makeToast(context, "fb icon clicked")
                    })
                DropdownMenuItem(
                    text = {
                        Icon(
                            painter = icon2,
                            contentDescription = null
                        )
                    },
                    onClick = {
                        makeToast(context, "fb icon clicked")
                    }
                )
            }
        }
    )
}

fun makeToast(context: Context, text: String) {
    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
}