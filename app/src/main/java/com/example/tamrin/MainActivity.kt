package com.example.tamrin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tamrin.ui.TestTopAppBar
import com.example.tamrin.ui.theme.TamrinTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TamrinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //  Layout()
                    //TestText()
                    //TestImages()
                    //TestText()
                    // testScrollable()
                    //  TestGesture()
                    //  progressIndicator()
                    // AlertDialog()
                    CreateScaffold()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateScaffold() {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TestTopAppBar()
        },
        content = { padding ->
            Text(
                modifier = Modifier.padding(padding),
                text = "This is content"
            )
        }
    )
}