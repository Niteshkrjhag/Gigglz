package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R



@Composable
fun splashscreen(modifier: Modifier = Modifier, navController: NavController) {
    // Get screen dimensions using LocalConfiguration
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            // Background gradient
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                            start = Offset(0f, screenHeight.value * 0.2f), // Adjust start point
                            end = Offset(
                                screenWidth.value * 0.5f,
                                screenHeight.value
                            ) // Adjust end point
                        )
                    )
            )

            // Centered "Let’s Begin!" button
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = screenHeight * 0.5f), // Use 50% of screen height for vertical alignment
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { navController.navigate("signup1") },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff4bb10)),
                    modifier = Modifier
                        .width(screenWidth * 0.8f) // 80% of screen width
                        .height(screenHeight * 0.08f) // 8% of screen height
                ) {
                    Text(
                        text = "Let’s Begin!",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            Column(modifier = Modifier.padding(top = screenHeight *0.80f) .align(Alignment.Center)) {
                // Text below the button

                Text(
                    text = "Fast track your growth with Gigglz",
                    color = Color(0xfff4bb1b).copy(alpha = 0.95f),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )

                )


                // Logo positioned near the bottom
                Image(
                    painter = painterResource(id = R.drawable.gigglzlogo),
                    contentDescription = "Gigglz Logo",
                    modifier = Modifier

                        .padding(start = screenWidth * 0.09f)
                        .width(screenWidth * 0.5f) // 50% of screen width
                        .height(screenHeight * 0.1f) // 10% of screen height
                        .clip(shape = RoundedCornerShape(79.5.dp))
                )
            }
        }
        }
    }


@Preview(showSystemUi = true)
@Composable
private fun SplashScreenPreview() {
    val navController = rememberNavController() // Mocked NavController for preview
    splashscreen(
        modifier = Modifier,
        navController = navController
    )
}




