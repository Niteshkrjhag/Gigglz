package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gigglz.R

@Composable
fun splashscreen1(modifier : Modifier) {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    )
    {
        Box(
            modifier = Modifier.fillMaxSize()

        ) {
            // Background Image
            Image(
                painter = painterResource(id = R.drawable.bg), // Replace 'bg' with your image name
                contentDescription = null,
                contentScale = ContentScale.Crop, // Crop or scale the image as needed
                modifier = Modifier.fillMaxWidth() .requiredHeight(screenHeight *0.9f)


            )
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.gigglzlogo),
                    contentDescription = "Gigglz Logo",
                    modifier = Modifier
                        //   .align(Alignment.TopCenter) // Ensure parent is a Box to support alignment
                        .padding(
                            start = (screenWidth * 0.24f),
                            top = (screenHeight * 0.45f)
                        )
                        .width((screenWidth * 0.50f)) // 50% of screen width
                        .height((screenHeight * 0.20f)) // 10% of screen height
                        .clip(shape = RoundedCornerShape(16.dp)) // Ensure reasonable corner radius
                )


                Row(modifier = Modifier.fillMaxWidth()  .padding(top = screenHeight*0.59f, start = screenWidth *0.39f)) {
                    Text(
                        text = "Fund your lifestyle!",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 20.sp)
                    )


                }
            }




        }

    }
}

@Preview
@Composable
private fun splashscreen1() {
    splashscreen1(Modifier)

}