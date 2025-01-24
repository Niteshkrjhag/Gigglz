package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
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
import com.example.gigglz.R

@Composable
fun merchant(modifier: Modifier) {
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
                                start = (screenWidth * 0.24f),
                                top = (screenHeight * 0.81f)
                            )
                            .width((screenWidth * 0.6f)) // 50% of screen width
                            .height((screenHeight * 0.10f)) // 10% of screen height
                            .clip(shape = RoundedCornerShape(16.dp)) // Ensure reasonable corner radius
                    )
                }

            }

            Column  (
                modifier = Modifier
                    .requiredHeight(screenHeight * 0.20f)
                    .requiredWidth(screenWidth*0.91f)
                    .align(Alignment.Center)
            ){
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff4f4f4)),
                    modifier = modifier
                        .requiredWidth(width = 358.dp)
                        .requiredHeight(height = 66.dp)){

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        // Icon on the left side
                        Image(
                            painter = painterResource(id = R.drawable.gigler), // Replace with your image resource
                            contentDescription = null,
                            modifier = Modifier.size(24.dp) // Set the size of the image
                        )

                        Spacer(modifier = Modifier.width(16.dp)) // Spacer between the icon and text

                        // Text in the middle (if any)
                        Text(text = "Giggler",   color = Color.Black,
                            fontSize = 18.sp, // Set the font size
                            fontWeight = FontWeight.Bold, // Set the font weight

                             modifier = Modifier.weight(1f)  )

                        // RadioButton on the right side
                        RadioButton(
                            selected = false, // You can control the state here
                            onClick = { /* Handle RadioButton click */ },
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(15.dp)) // Adds 15dp space
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xfff4f4f4)),
                    modifier = modifier
                        .requiredWidth(width = 358.dp)
                        .requiredHeight(height = 66.dp)){

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        // Icon on the left side
                        Image(
                            painter = painterResource(id = R.drawable.merchant), // Replace with your image resource
                            contentDescription = null,
                            modifier = Modifier.size(24.dp) // Set the size of the image
                        )

                        Spacer(modifier = Modifier.width(16.dp)) // Spacer between the icon and text

                        // Text in the middle (if any)
                        Text(text = "Merchant",   color = Color.Black,
                            fontSize = 18.sp, // Set the font size
                            fontWeight = FontWeight.Bold, // Set the font weight

                            modifier = Modifier.weight(1f)  )

                        // RadioButton on the right side
                        RadioButton(
                            selected = false, // You can control the state here
                            onClick = { /* Handle RadioButton click */ },
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
                    .padding(top = screenHeight*0.80f)
            // Makes the row span the full width
            ) {
                Text(
                    text = "Fastrack your growth with Gigglz",
                    color = Color(0xfff4f4f4),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(horizontal = 8.dp) // Optional padding
                )
            }



        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun merchant(){
   merchant(Modifier)

}