package com.manish.compose_learning_step_by_step

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class TypesOfButtons : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.padding(top = 50.dp, start = 50.dp)) {
                ButtonDefault({
                    Log.d("Button", "Button Default Clicked")
                })
                Spacer(modifier = Modifier.padding(10.dp))

                ButtonFilledTonal ({
                    Log.d("Button", "Button ButtonFilledTonal Clicked")
                })
                Spacer(modifier = Modifier.padding(10.dp))

                ButtonElevated({
                    Log.d("Button", "Button ButtonElevated Clicked")
                })
                Spacer(modifier = Modifier.padding(10.dp))

                ButtonOutLine ({
                    Log.d("Button", "Button ButtonOutLine Clicked")
                })
                Spacer(modifier = Modifier.padding(10.dp))

                ButtonText ({
                    Log.d("Button", "Button ButtonText Clicked")
                })
                Spacer(modifier = Modifier.padding(10.dp))

                MyTextField()
                Spacer(modifier = Modifier.padding(10.dp))
                MyImage()
            }
        }
    }
}

@Composable
fun ButtonDefault(onClick: () -> Unit) {
    Button(
        onClick = {
            onClick()
        }) {
        Text("Default")
    }
}

@Composable
fun ButtonFilledTonal(onClick: () -> Unit) {
    FilledTonalButton(
        onClick = {
            onClick()
        }) {
        Text("ButtonFilledTonal")
    }
}

@Composable
fun ButtonElevated(onClick: () -> Unit) {
    ElevatedButton(
        onClick = {
            onClick()
        },
        elevation = ButtonDefaults.elevatedButtonElevation(6.dp)) {
        Text("ButtonElevated")
    }
}

@Composable
fun ButtonOutLine(onClick: () -> Unit) {
    OutlinedButton(
        onClick = {
            onClick()
        }) {
        Text("ButtonOutLine")
    }
}

@Composable
fun ButtonText(onClick: () -> Unit) {
    TextButton(
        onClick = {
            onClick()
        }) {
        Text("ButtonText")
    }
}

@Composable
fun MyTextField() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        modifier = Modifier.
        background(color = Color.Blue,
            shape = RoundedCornerShape(20.dp)
        ).border(2.dp, Color.Black,)
            .clip(RoundedCornerShape(10.dp))

    )
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.lion),
        contentDescription = "My Image",
        modifier = Modifier
            .background(Color.White)
            .size(200.dp)
            .border(2.dp, Color.Black)
            .clip(RoundedCornerShape(100.dp))
            .padding(20.dp)
    )
}



@Preview(showBackground = true)
@Composable
fun ButtonDefault() {
}
