package uz.jasurbekruzimov.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import uz.jasurbekruzimov.firstcompose.ui.theme.FirstComposeTheme
import uz.jasurbekruzimov.firstcompose.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Pink80
                ) {
                }
            }
        }
    }
}

@Composable
fun Greeting(
    message: String,
    signature: String
) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 58.sp,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstComposeTheme {
        Greeting(message = "Assalomu Alaykum !", signature = "Jasurbek Dev")
    }
}