package com.example.tutorial_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial_2.ui.theme.Tutorial_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    ArticlePage(
                        modifier = Modifier
                            .fillMaxSize()
                            .border(1.dp, Color.Black)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticlePage(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier = Modifier
            /*.padding(1.dp)*/
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )

        Article(
            modifier = Modifier
                /*.border(1.dp, Color.Black)*/
                .padding(30.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun Article(modifier: Modifier = Modifier){
    Column{
        ArticleTitle(
            fill_text = stringResource(R.string.article_section_title_text),
            modifier = Modifier
                .padding(0.dp, 10.dp, 0.dp, 0.dp)
                /*.border(2.dp, Color.Green)*/
        )
        ArticleSection(fill_text = stringResource(R.string.article_section_1_text))
        ArticleSection(fill_text = stringResource(R.string.article_section_2_text))
/*
        Text(
            text = "text 1 test",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = modifier
                .padding(2.dp)
                .border(1.dp, Color.Black)
        )
*/
    }
}

@Composable
fun ArticleTitle(fill_text: String, modifier: Modifier = Modifier){
    Text(
        text = fill_text,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            /*.border(1.dp, Color.Red)*/
            /*.align(alignment = Alignment.End)*/
            .fillMaxWidth()

    )
}

@Composable()
fun ArticleSection(fill_text: String, modifier: Modifier = Modifier){
    Text(
        text = fill_text,
        fontSize = 17.sp,
        color = Color.Black,
        modifier = modifier
            /*.border(1.dp, Color.Black)*/
            .padding(15.dp)
            /*.border(1.dp, Color.Red)*/
            .fillMaxWidth()
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color = Color.Black,

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial_2Theme {
        Greeting("Android")
    }
}