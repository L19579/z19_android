package com.example.tutorial_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial_3.ui.theme.Tutorial_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial_3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black,
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
private fun QuadrantApp(){
    Column(
        Modifier
            /*.fillMaxHeight()*/
            .fillMaxSize()
            .border(1.dp, Color.Red)
    ){
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .border(10.dp, Color.Blue)
        ){
            Quadrant(text_title = stringResource(R.string.reference_name), text_body = "bye 1",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(0.5f)
            )
            Quadrant(text_title = "hi 2", text_body = "bye 2",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(1f)
                )
        }
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .border(10.dp, Color.Blue),
            /*horizontalArrangement = Arrangement.SpaceAround*/
        ){
            Quadrant(text_title = "hi 3", text_body = "bye 3",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(0.5f)
            )
            Quadrant(text_title = "hi 4", text_body = "bye 4",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(1f)
            )
        }
    }
}

@Composable
private fun Quadrant(
    text_title: String,
    text_body: String,
    panel_color: Color = Color.Red,
    modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            /*:.fillMaxSize()*/
            .border(1.dp, Color.Red)
    ){
        Text(
            text = text_title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(5.dp)
        )

        Text(
            text = text_body,
            fontSize = 10.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial_3Theme {

    }
}