package com.example.tutorial_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
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
            /*.border(1.dp, Color.Red)*/
    ){
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                /*.border(10.dp, Color.Blue)*/
        ){
            Quadrant(
                text_title = stringResource(R.string.quadrant_one_title),
                text_body = stringResource(R.string.quadrant_one_description),
                panel_color = Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    /*.fillMaxWidth(0.5f)*/
            )
            Quadrant(
                text_title = stringResource(R.string.quadrant_two_title),
                text_body = stringResource(R.string.quadrant_two_description),
                panel_color = Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    /*.fillMaxWidth(1f)*/
                )
        }
        Row(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                /*.border(10.dp, Color.Blue),*/
            /*horizontalArrangement = Arrangement.SpaceAround*/
        ){
            Quadrant(
                text_title = stringResource(R.string.quadrant_three_title),
                text_body = stringResource(R.string.quadrant_three_description),
                panel_color = Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )
            Quadrant(
                text_title = stringResource(R.string.quadrant_four_title),
                text_body = stringResource(R.string.quadrant_four_description),
                panel_color = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            )
        }
    }
}

@Composable
private fun Quadrant(
    text_title: String,
    text_body: String,
    panel_color: Color = Color.LightGray,
    modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            /*:.fillMaxSize()*/
            .border(1.dp, Color.Black)
            .background(panel_color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = text_title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp, 0.dp, 0.dp, 15.dp)
                /*.border(1.dp, Color.Green)*/
        )

        Text(
            text = text_body,
            fontSize = 10.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                /*.border(1.dp, Color.Green)*/
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial_3Theme {

    }
}