package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

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
import com.example.gigglz.R


@Composable
fun kycf(modifier: Modifier) {
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
            {


                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(id = R.drawable.gigglzlogo),
                        contentDescription = "Gigglz Logo",
                        modifier = Modifier
                            //   .align(Alignment.TopCenter) // Ensure parent is a Box to support alignment
                            .padding(
                                start = (screenWidth * 0.29f),
                                top = (screenHeight * 0.01f)
                            )
                            .width((screenWidth * 0.4f)) // 50% of screen width
                            .height((screenHeight * 0.08f)) // 10% of screen height
                            .clip(shape = RoundedCornerShape(16.dp)) // Ensure reasonable corner radius
                    )
                }


                Box(modifier = Modifier.requiredSize(screenWidth * 0.46f)
                    .padding(start = screenWidth * 0.50f, top= screenHeight * 0.35f) ){

                    Image(
                        painter = painterResource(id = R.drawable.successmark),
                        contentDescription = "Successmark",
                        modifier = modifier
                            .requiredSize(size = 150.dp))
                }






            }


            Row (modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "KYC submitted",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = modifier
                        .requiredWidth(width = 315.dp))


            }

        }
    }
}





@Preview (showSystemUi = true)
@Composable
private fun kycf() {
    kycf(Modifier)
}


