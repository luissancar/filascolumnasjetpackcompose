package com.example.jetpackcompose01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose01.ui.theme.JetPackCompose01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           myLayout()
        }
    }
}

@Composable
fun myLayout(){
    JetPackCompose01Theme() {
        Row(modifier = Modifier.padding(12.dp)) {
            myImage()
            myText(texto = "Uno")
        }
    }


}

@Composable
fun myImage(){
    Image(painter = painterResource(id = R.drawable.nosferatu),
        contentDescription ="imagen",
        modifier = Modifier
            .clip(CircleShape)
            .border(BorderStroke(5.dp, Color.Green))
            .size(64.dp)

        )

}
@Composable
fun myText(texto: String){
    Column(modifier = Modifier.padding( 15.dp)) {

        Text(text = texto,
            modifier = Modifier.background(Color.Blue))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "dos")
    }
}

@Composable
@Preview
fun preview(){
    myLayout()
}