package com.example.tamrin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tamrin.ui.TestImages
import com.example.tamrin.ui.testTopAppBar
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
                }
            }
        }
    }
}

@Composable
fun CreateScaffold(){
    Scaffold(topBar = {}) {
testTopAppBar()
    }
}