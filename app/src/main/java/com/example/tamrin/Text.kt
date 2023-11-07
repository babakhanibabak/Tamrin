package com.example.tamrin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestText() {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "A simple hardcoded text")
        Text(text = stringResource(id = R.string.hello_text))
        Text(
            text = "Formated text",
            color = Color.Red,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        var name by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = name, onValueChange = { name = it },
            label = { Text(text = "nameField") },
            placeholder = { Text(text = "Alex") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        var surname by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = surname,
            onValueChange = { surname = it },
        )
    }
}