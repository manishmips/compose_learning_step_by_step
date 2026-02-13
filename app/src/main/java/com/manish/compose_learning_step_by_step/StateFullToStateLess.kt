package com.manish.compose_learning_step_by_step

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class StateFullToStateLess : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var text by remember { mutableStateOf("") }
            Column(modifier = Modifier.padding(50.dp)) {
                StateFullText()
                StatelessText(
                    text = text,
                     { newText ->
                        text = newText
                    }
                )
            }
        }
    }
}

@Composable
fun StateFullText() {
    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(50.dp)){
        TextField(text, onValueChange ={
                newText -> text = newText
        })
        Spacer(modifier = Modifier.padding(5.dp))
        Text("You have typed in stateful $text")
    }


}


@Composable
fun StatelessText(text: String, onTextChange: (String) -> Unit) {

    Column(modifier = Modifier.padding(50.dp)){
        TextField(text, onValueChange =onTextChange)
        Spacer(modifier = Modifier.padding(5.dp))

        Text("You have typed in stateless $text")
    }


}
