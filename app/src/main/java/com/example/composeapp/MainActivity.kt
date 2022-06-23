package com.example.composeapp



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource


import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackCompose()
        }
    }
}
@Preview
@Composable
 fun JetPackCompose() {
    Card {
         var expended by remember { mutableStateOf(false) }
        Column(Modifier.clickable { expended = !expended }) {
            Image(painterResource(R.drawable.photo), "11")
            AnimatedVisibility(expended) {
                Text(
                    text = "It's me :)",
                    style = MaterialTheme.typography.h2,
                )
            }
        }
    }
}
