package com.curious.birthdaycardproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.curious.birthdaycardproject.ui.theme.BirthdayCardProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardProjectTheme {
                BirthdayGreetingCard(
                    message = "Happy Birthday, Kavi! 🎂🎉",
                    from = "From your friend, Jash 😊"
                )
            }
        }
    }
}

@Composable
fun BirthdayGreetingCard(message: String, from: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // 🎨 Background image
        Image(
            painter = painterResource(id = R.drawable.birthday_bg),
            contentDescription = "Birthday background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 🖤 Foreground content (texts)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = message,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4B2E2B),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = from,
                fontSize = 20.sp,
                color = Color(0xFF5C4033),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardProjectTheme {
        BirthdayGreetingCard(
            message = "Happy Birthday, Kavi! 🎂🎈",
            from = "From your friend, Jash 😊"
        )
    }
}
