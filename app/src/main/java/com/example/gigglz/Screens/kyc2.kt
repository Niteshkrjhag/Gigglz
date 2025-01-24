package com.example.gigglz.Screens



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R

   /*
@Composable
fun kyc2 (modifier: Modifier = Modifier) {

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
                text = "Adhaar Card (Back)",
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


        }



    }
}






@Preview(widthDp = 428, heightDp = 936)
@Composable
private fun kyc2() {
    kyc2(Modifier)
}





*/





@Composable
fun Kyc2(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .requiredWidth(width = 428.dp)
            .requiredHeight(height = 926.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color.White)
    ) {
        Box(
            modifier = modifier
                .requiredWidth(width = 438.dp)
                .requiredHeight(height = 926.dp)
                .background(color = Color(0xff0d0456)))


        Text(
            text = "Upload KYC",
            color = Color.White,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-52.5).dp,
                    y = 129.dp)
                .requiredWidth(width = 225.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 112.dp,
                    y = 19.dp)
                .requiredWidth(width = 143.dp)
                .requiredHeight(height = 75.dp)
                .clip(shape = RoundedCornerShape(79.5.dp)))
        Image(
            painter = painterResource(id = R.drawable.gigglzlogo),
            contentDescription = "GIGGLZ 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 143.dp,
                    y = 7.dp)
                .requiredWidth(width = 143.dp)
                .requiredHeight(height = 73.dp)
                .clip(shape = RoundedCornerShape(79.5.dp)))
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "XMLID_6_",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 29.dp,
                    y = 58.dp)
                .requiredSize(size = 50.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.Start),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 49.dp,
                    y = 186.dp)
                .requiredWidth(width = 332.dp)
        ) {
            Text(
                text = "Live Photo",
                color = Color(0xfff4bb10),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .requiredWidth(width = 159.dp))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 159.dp)
                    .requiredHeight(height = 5.dp)
                    .clip(shape = RoundedCornerShape(3.dp))
                    .offset(x = 154.dp , y=193.dp)
                    .background(color = Color(0xfff4bb10)))
            Text(
                text = "ID Proof",
                color = Color(0xfff4bb10),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .requiredWidth(width = 158.dp))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 158.dp)
                    .requiredHeight(height = 5.dp)
                    .offset(x=65.dp, y= 93.dp)
                    .clip(shape = RoundedCornerShape(3.dp))
                    .background(color = Color(0xfff4bb10)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 0.dp,
                    y = 242.dp)
                .requiredWidth(width = 428.dp)
                .requiredHeight(height = 694.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color.White)
        ) {

            Text(
                text = "Choose Your ID Type",
                color = Color(0xff212121),
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-77.5).dp,
                        y = 29.dp)
                    .requiredWidth(width = 225.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 390.dp)
                    .requiredWidth(width = 365.dp)
                    .requiredHeight(height = 121.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(33.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 166.dp)
                            .requiredHeight(height = 121.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 166.dp)
                                .requiredHeight(height = 121.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 166.dp)
                                    .requiredHeight(height = 121.dp)
                                    .clip(shape = RoundedCornerShape(20.dp))
                                    .background(color = Color.White))
                        }
                    }
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 166.dp)
                            .requiredHeight(height = 121.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 166.dp)
                                .requiredHeight(height = 121.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 166.dp)
                                    .requiredHeight(height = 121.dp)
                                    .clip(shape = RoundedCornerShape(20.dp))
                                    .background(color = Color.White))
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = "Camera 01",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 253.dp,
                            y = 26.dp)
                        .requiredWidth(width = 57.dp)
                        .requiredHeight(height = 53.dp))
                Text(
                    text = "Back",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 243.dp,
                            y = 79.dp)
                        .requiredWidth(width = 76.dp)
                        .requiredHeight(height = 18.dp))
                Image(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = "Camera 01",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 54.dp,
                            y = 26.dp)
                        .requiredWidth(width = 57.dp)
                        .requiredHeight(height = 53.dp))
                Text(
                    text = "Front",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 44.dp,
                            y = 79.dp)
                        .requiredWidth(width = 76.dp)
                        .requiredHeight(height = 18.dp))
            }
            Text(
                text = "Take Your ID Photo",
                color = Color(0xff212121),
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-78.5).dp,
                        y = 264.dp)
                    .requiredWidth(width = 225.dp))
            Text(
                text = "Place your ID in a well-lit area and take a clear photo to proceed with verification",
                color = Color(0xff3e3b3b),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 311.dp)
                    .requiredWidth(width = 348.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 48.dp,
                        y = 588.dp)
                    .requiredWidth(width = 330.dp)
                    .requiredHeight(height = 47.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(color = Color(0xff0d0456))
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 1.5.em,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = (-0.32).sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 124.dp,
                            y = 14.dp)
                        .requiredWidth(width = 64.dp)
                        .requiredHeight(height = 19.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = Color(0xfff4bb10).copy(alpha = 0.13f),
                border = BorderStroke(1.dp, Color(0xfff4bb10)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 24.dp,
                        y = 73.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 148.dp)
                        .requiredHeight(height = 41.dp)
                ) {
                    Text(
                        text = "ID Type",
                        color = Color(0xfff4bb10),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 12.dp,
                                y = 12.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.downarrow),
                        contentDescription = "Arrow Down Contained 01",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 118.dp,
                                y = 10.dp)
                            .requiredSize(size = 23.dp)
                            .rotate(degrees = 90f))
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 176.dp,
                        y = 73.dp)
                    .requiredWidth(width = 220.dp)
                    .requiredHeight(height = 119.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xfff4bb10).copy(alpha = 0.13f))
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 44.dp)
                        .requiredWidth(width = 220.dp)
                        .requiredHeight(height = 37.dp)
                        .background(color = Color(0xfff4bb10)))
                Text(
                    text = "Driving License",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 43.dp,
                            y = 54.dp))
                Image(
                    painter = painterResource(id = R.drawable.passport),
                    contentDescription = "image 13",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 11.dp,
                            y = 53.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Passport",
                    color = Color(0xffa0a0a0),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 43.dp,
                            y = 15.dp))
                Image(
                    painter = painterResource(id = R.drawable.passport),
                    contentDescription = "image 11",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 11.dp,
                            y = 14.dp)
                        .requiredSize(size = 20.dp))
                Text(
                    text = "Aadhar Card",
                    color = Color(0xffa0a0a0),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 43.dp,
                            y = 90.dp))
                Image(
                    painter = painterResource(id = R.drawable.passport),
                    contentDescription = "image 12",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 11.dp,
                            y = 87.dp)
                        .requiredSize(size = 22.dp))
            }
        }
        Text(
            text = "Skip",
            color = Color(0xfff4f4f4),
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 355.dp,
                    y = 78.dp))
    }
}

@Preview(widthDp = 428, heightDp = 926)
@Composable
private fun Kyc2Preview() {
    Kyc2(Modifier)
}











@Composable
fun kycn(modifier: Modifier) {

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

                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription = "Back",
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = (screenWidth * 0.07f), y = (screenHeight * 0.08f))
                            .size(screenWidth * 0.10f)
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
                        .padding(start = screenWidth * 0.12f, top = screenHeight * 0.15f)  // Optional padding
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
                    horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.Start),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = screenWidth * 0.09f,
                            y= 186.dp)
                        .requiredWidth(width = 332.dp)
                ) {
                    Text(
                        text = "Live Photo",
                        color = Color(0xfff4bb10),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 159.dp)
                    )



                    Text(
                        text = "ID Proof",
                        color = Color(0xfff4bb10),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .requiredWidth(width = 158.dp)
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(22.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = screenWidth *0.07f, y = screenHeight *0.25f)
                        .requiredWidth(width = 332.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 159.dp)
                            .requiredHeight(height = 5.dp)
                            .clip(shape = RoundedCornerShape(3.dp))
                            .background(color = Color(0xfff4bb10))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 159.dp)
                            .requiredHeight(height = 5.dp)
                            .clip(shape = RoundedCornerShape(3.dp))
                            .background(color = Color(0xfff4bb10))
                    )
                }




                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .padding(start = 0.dp, top = screenHeight * 0.29f)
                        .width(screenWidth)
                        .height(screenHeight * 0.8f)

                        .clip(shape = RoundedCornerShape(30.dp))
                        .background(color = Color.White)
                ) {

                    Text(
                        text = "Choose Your ID Type",
                        color = Color(0xff212121),
                        style = MaterialTheme.typography.titleLarge.copy (
                            fontWeight = FontWeight.Bold
                        ) ,

                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .padding(top = screenHeight * 0.02f , start = screenWidth *0.07f)
                           )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 31.dp,
                                y = 390.dp)
                            .requiredWidth(width = 365.dp)
                            .requiredHeight(height = 121.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(33.dp, Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 166.dp)
                                    .requiredHeight(height = 121.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 166.dp)
                                        .requiredHeight(height = 121.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .requiredWidth(width = 166.dp)
                                            .requiredHeight(height = 121.dp)
                                            .clip(shape = RoundedCornerShape(20.dp))
                                            .background(color = Color.White))
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 166.dp)
                                    .requiredHeight(height = 121.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .requiredWidth(width = 166.dp)
                                        .requiredHeight(height = 121.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .requiredWidth(width = 166.dp)
                                            .requiredHeight(height = 121.dp)
                                            .clip(shape = RoundedCornerShape(20.dp))
                                            .background(color = Color.White))
                                }
                            }
                        }
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = "Camera 01",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 253.dp,
                                    y = 26.dp)
                                .requiredWidth(width = 57.dp)
                                .requiredHeight(height = 53.dp))
                        Text(
                            text = "Back",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 243.dp,
                                    y = 79.dp)
                                .requiredWidth(width = 76.dp)
                                .requiredHeight(height = 18.dp))
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = "Camera 01",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 54.dp,
                                    y = 26.dp)
                                .requiredWidth(width = 57.dp)
                                .requiredHeight(height = 53.dp))
                        Text(
                            text = "Front",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 44.dp,
                                    y = 79.dp)
                                .requiredWidth(width = 76.dp)
                                .requiredHeight(height = 18.dp))
                    }
                    Text(
                        text = "Take Your ID Photo",
                        color = Color(0xff212121),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = (-78.5).dp,
                                y = 264.dp)
                            .requiredWidth(width = 225.dp))
                    Text(
                        text = "Place your ID in a well-lit area and take a clear photo to proceed with verification",
                        color = Color(0xff3e3b3b),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 31.dp,
                                y = 311.dp)
                            .requiredWidth(width = 348.dp))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 48.dp,
                                y = 500.dp)
                            .requiredWidth(width = 330.dp)
                            .requiredHeight(height = 47.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = Color(0xff0d0456))
                    ) {
                        Text(
                            text = "Next",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.5.em,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = (-0.32).sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 124.dp,
                                    y = 14.dp)
                                .requiredWidth(width = 64.dp)
                                .requiredHeight(height = 19.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0xfff4bb10).copy(alpha = 0.13f),
                        border = BorderStroke(1.dp, Color(0xfff4bb10)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 24.dp,
                                y = 73.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 148.dp)
                                .requiredHeight(height = 41.dp)
                        ) {
                            Text(
                                text = "ID Type",
                                color = Color(0xfff4bb10),
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 12.dp,
                                        y = 12.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.downarrow),
                                contentDescription = "Arrow Down Contained 01",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 118.dp,
                                        y = 10.dp)
                                    .requiredSize(size = 23.dp)
                                    .rotate(degrees = 90f))
                        }
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 176.dp,
                                y = 73.dp)
                            .requiredWidth(width = 220.dp)
                            .requiredHeight(height = 119.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(color = Color(0xfff4bb10).copy(alpha = 0.13f))
                    ) {
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 44.dp)
                                .requiredWidth(width = 220.dp)
                                .requiredHeight(height = 37.dp)
                                .background(color = Color(0xfff4bb10)))
                        Text(
                            text = "Driving License",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 43.dp,
                                    y = 54.dp))
                        Image(
                            painter = painterResource(id = R.drawable.passport),
                            contentDescription = "image 13",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 11.dp,
                                    y = 53.dp)
                                .requiredSize(size = 20.dp))
                        Text(
                            text = "Passport",
                            color = Color(0xffa0a0a0),
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 43.dp,
                                    y = 15.dp))
                        Image(
                            painter = painterResource(id = R.drawable.passport),
                            contentDescription = "image 11",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 11.dp,
                                    y = 14.dp)
                                .requiredSize(size = 20.dp))
                        Text(
                            text = "Aadhar Card",
                            color = Color(0xffa0a0a0),
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 43.dp,
                                    y = 90.dp))
                        Image(
                            painter = painterResource(id = R.drawable.passport),
                            contentDescription = "image 12",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 11.dp,
                                    y = 87.dp)
                                .requiredSize(size = 22.dp))
                    }
                }

            }


        }


    }

}






@Preview(showSystemUi = true)
@Composable
private fun kycnPreview() {

    kycn(
        modifier = Modifier,

    )


}












