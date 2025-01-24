package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R


/*
@Composable
fun kyc1 (modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .requiredWidth(width = 428.dp)
            .requiredHeight(height = 926.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    )
    {
        Box(
            modifier = modifier
                .requiredWidth(width = 428.dp)
                .requiredHeight(height = 936.dp)
                .clip(shape = RoundedCornerShape(50.dp))
                .background(
                    brush = Brush.linearGradient(
                        0f to Color(0xff0a0a53),
                        1f to Color(0xff050533),
                        start = Offset(19.5f, 33.5f),
                        end = Offset(214f, 936f)
                    )

                )


        )
        Image(
            painter = painterResource(id = R.drawable.gigglzlogo),
            contentDescription = "GIGGLZ 1",
            modifier = modifier
                .requiredWidth(width = 143.dp)
                .offset(x = 147.dp, y = 3.dp)
                .requiredHeight(height = 73.dp)
                .clip(shape = RoundedCornerShape(79.5.dp))
        )

        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "Arrow Left Contained 3",
            modifier = modifier
                .offset(x = 17.5.dp, y = 76.dp)
                .requiredSize(size = 35.dp)
        )


        Box(
            modifier = modifier
                .requiredWidth(width = 323.dp)
                .offset(x = 59.5.dp, y = 258.dp)
                .requiredHeight(height = 610.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.White)
        ) {

            Text(
                text = "Adhaar Card (Front)",
                color = Color(0xff1f1f1f),
                lineHeight = 2.em,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = modifier
                    .offset(x = 24.dp, y = 31.dp)
                    .requiredHeight(36.dp)
                    .requiredHeight(172.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )


            Text(
                text = "Please upload your Aadhar card below for completing your first step of KYC.",
                color = Color(0xff1f1f1f).copy(alpha = 0.65f),
                lineHeight = 1.18.em,
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = modifier
                    .offset(x = 24.dp, y = 55.dp)

                    .requiredWidth(width = 265.dp)
                    .requiredHeight(height = 35.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )

            Text(
                text = "Adhaar Card Number",
                color = Color(0xff1f1f1f).copy(alpha = 0.65f),
                lineHeight = 2.1.em,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = modifier
                    .requiredWidth(width = 104.dp)
                    .offset(x = 24.dp, y = 124.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )


            Box(
                modifier = modifier
                    .requiredWidth(width = 216.dp)
                    .requiredHeight(height = 29.dp)
                    .offset(x = 24.dp, y = 152.dp)
                    .clip(shape = MaterialTheme.shapes.medium)
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(
                            0.800000011920929.dp,
                            Color.Black.copy(alpha = 0.12f)
                        ),
                        shape = MaterialTheme.shapes.medium
                    )
            )
/*
            Card(
                colors = CardDefaults.outlinedCardColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.11f)),
                content = {},
                modifier = modifier
                    .offset(x = 29.dp, y = 265.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 109.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.11f)),
                        shape = RoundedCornerShape(20.dp)
                    )



            )

 */

            Card(
                colors = CardDefaults.outlinedCardColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.11f)),
                modifier = modifier
                    .offset(x = 29.dp, y = 265.dp)
                    .requiredWidth(width = 260.dp)
                    .requiredHeight(height = 109.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.11f)),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                // Use a Box, Column, or other layout if needed to organize the content inside the card
                Box(
                    modifier = Modifier
                        .requiredWidth(260.dp)
                        .requiredHeight(109.dp),

                    contentAlignment = Alignment.Center // Centers the text inside the card
                ) {
                    Text(
                        text = "Upload Aadhaar card front photo",
                        color = Color(0xff7c7c7c),
                        lineHeight = 1.88.em,
                        style = TextStyle(fontSize = 12.sp),
                        modifier = Modifier
                            .requiredWidth(width = 201.dp)
                    )
                }

                Box(
                    modifier = modifier
                        .offset(x=79.dp,y=60.dp)
                        .requiredWidth(width = 106.dp)
                        .requiredHeight(height = 27.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(border = BorderStroke(1.dp, Color.Black),
                            shape = RoundedCornerShape(20.dp)))


                         }


            }




        }
            }






    @Preview(widthDp = 428, heightDp = 936)
    @Composable
    private fun kyc1() {
        kyc1(Modifier)
    }

 */



@Composable
fun kyc1(modifier: Modifier) {
    // Get screen dimensions using LocalConfiguration
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Column(modifier = Modifier.fillMaxSize() .systemBarsPadding() ) {
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
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.gigglzlogo),
                    contentDescription = "Gigglz Logo",
                    modifier = Modifier
                     //   .align(Alignment.TopCenter) // Ensure parent is a Box to support alignment
                        .padding(
                            start = (screenWidth * 0.25f),
                            top = (screenHeight * 0.01f)
                        )
                        .width((screenWidth * 0.5f)) // 50% of screen width
                        .height((screenHeight * 0.1f)) // 10% of screen height
                        .clip(shape = RoundedCornerShape(16.dp)) // Ensure reasonable corner radius
                )
            }

            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = "Back",
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = (screenWidth * 0.07f), y = (screenHeight * 0.08f))
                        .size(screenWidth * 0.12f)
                )
            }

            Box(
            modifier = Modifier.fillMaxSize()
            ) {
                TextButton(
                    onClick = {
                        // Add your onClick logic here
                    },
                    modifier = modifier.offset(x= (screenWidth * 0.80f), y=(screenHeight * 0.08f))
                ) {
                    Text(
                        text = "Skip",
                        color = Color(0xfff4f4f4),
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = screenWidth * 0.12f, top = screenHeight * 0.16f)  // Optional padding
               // horizontalArrangement = Arrangement.Center, // Align content in the center horizontally
                //verticalAlignment = Alignment.CenterVertically // Align content in the center vertically
            ) {
                Text(
                    text = "Upload KYC",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = modifier
                        .requiredWidth(225.dp) // Ensure the required width
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth() // Make the row span the entire width of the screen
                    .padding(top = screenHeight * 0.23f), // Optional padding for the row
                horizontalArrangement = Arrangement.Center, // Center content horizontally
                verticalAlignment = Alignment.CenterVertically // Align items vertically in the center
            ) {
                Text(
                    text = "Live Photo",
                    color = Color(0xfff4bb10),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier.requiredWidth(159.dp)
                )

                Spacer(modifier = Modifier.width(15.dp)) // Space between the two texts

                Text(
                    text = "ID Proof",
                    color = Color(0xff646464),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier.requiredWidth(158.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth() // Make the row span the entire width
                    .padding(horizontal = 16.dp ), // Optional padding for the row
                horizontalArrangement = Arrangement.Center, // Center the boxes horizontally
                verticalAlignment = Alignment.CenterVertically // Align the boxes vertically in the center
            ) {
                Box(
                    modifier = modifier
                        .requiredWidth(159.dp)
                        .requiredHeight(5.dp)
                        .clip(shape = RoundedCornerShape(3.dp))
                        .background(color = Color(0xfff4bb10))
                )

                Spacer(modifier = Modifier.width(15.dp)) // Space between the two boxes

                Box(
                    modifier = modifier
                        .requiredWidth(158.dp)
                        .requiredHeight(5.dp)
                        .clip(shape = RoundedCornerShape(3.dp))
                        .background(color = Color(0xff646464))
                )
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun kyc1Preview() {
    val navController = rememberNavController() // Mocked NavController for preview
    kyc1(modifier = Modifier )

}