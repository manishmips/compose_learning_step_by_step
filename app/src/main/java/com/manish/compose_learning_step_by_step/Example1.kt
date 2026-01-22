package com.manish.compose_learning_step_by_step

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.compose_learning_step_by_step.ui.theme.Compose_learning_step_by_stepTheme

class Example1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(

        modifier = modifier
            .padding(all=20.dp)
            .border(5.dp,
                color = Color.Red)
            .padding(20.dp)
            .border(2.dp,
                color = Color.Blue)
            .padding(all=10.dp)
    ) {
        Text(
            text = "Android Compose Coding App",
            color = Color.Red,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.Underline,
                    TextDecoration.LineThrough
                )
            ),
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Serif,
            modifier = modifier
                .padding(start = 20.dp)

        )
        Text(
            text = "Download it from PlayStore",
            textDecoration = TextDecoration.Underline,
            modifier = modifier
                .padding(top = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_learning_step_by_stepTheme {
        Greeting("Android")
    }
}