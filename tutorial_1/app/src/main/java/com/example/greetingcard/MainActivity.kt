package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Jojo")

                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Gray){
        GreetingImage(message = stringResource(R.string.pointless_msg_text), from = "pointess")
        /*
        AnotherText(message = "From Aleora")
        GreetingImage(message = "hello", from = "hi")
        */
        /*
        Text(
            text = "Hello there $name! Extending text." +
                    " Next sentence",
            color = Color.Yellow,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            modifier = modifier.padding(24.dp)
        )
         */
    }
}

@Composable
fun AnotherText(message: String, modifier: Modifier
 = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
        .fillMaxSize()
    ){
        Text(
            text = "Happy Holidays Stevenson!",
            color = Color.Yellow,
            fontSize = 80.sp,
            lineHeight = 81.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(2.dp)
                .border(1.dp, Color.Black)
        )
        Text(
            text = "$message",
            color = Color.Red,
            fontSize = 30.sp,
            lineHeight = 30.sp,
            modifier = modifier
                .padding(10.dp)
                .align(alignment = Alignment.End)
                .border(1.dp, Color.Red)
        )
    }
}

@Composable
fun GreetingImage(
    message: String,
    from: String,
    modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)

    Box (
        modifier = modifier.border(3.dp, Color.Blue)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )

        AnotherText(message = "From teeeeessst",
            modifier = Modifier
                /*.fillMaxSize()*/
                .padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    GreetingCardTheme {
        Greeting(stringResource(R.string.pointless_msg_text))
    }
}