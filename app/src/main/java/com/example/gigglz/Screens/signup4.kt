package com.example.gigglz.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import com.example.gigglz.R

@Composable
fun signup4(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 428.dp)
            .requiredHeight(height = 936.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(
                brush = Brush.linearGradient(
                    0f to Color(0xff0a0a53),
                    1f to Color(0xff050533),
                    start = Offset(25f, 0f),
                    end = Offset(214f, 936f)
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "XMLID_6_",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 29.dp,
                    y = 58.dp
                )
                .requiredSize(size = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.gigglzlogo),
            contentDescription = "GIGGLZ 4",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 145.dp,
                    y = 837.dp
                )
                .requiredWidth(width = 132.dp)
                .requiredHeight(height = 69.dp)
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 52.dp,
                    y = 158.dp
                )
                .requiredWidth(width = 318.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 290.dp)
                    .requiredHeight(height = 225.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "Background",
                    modifier = Modifier
                        .fillMaxSize()
                        .rotate(degrees = 4.33f)
                )
                Image(
                    painter = painterResource(id = R.drawable.shieldtick),
                    contentDescription = "Iconsax/Bold/shieldtick",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 78.dp,
                            y = 51.dp
                        )
                        .requiredSize(size = 136.dp)
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 211.dp,
                            y = 90.dp
                        )
                        .requiredWidth(width = 25.dp)
                        .requiredHeight(height = 26.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(0xffb9d7fa))
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 235.dp,
                            y = 161.dp
                        )
                        .requiredSize(size = 9.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(0xff97c7ff))
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 52.dp,
                            y = 113.dp
                        )
                        .requiredSize(size = 18.dp)
                        .clip(shape = CircleShape)
                        .border(
                            border = BorderStroke(3.dp, Color(0xffa8bbff)),
                            shape = CircleShape
                        )
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 215.dp,
                            y = 152.dp
                        )
                        .requiredSize(size = 18.dp)
                        .clip(shape = CircleShape)
                        .border(
                            border = BorderStroke(3.dp, Color(0xffa8bbff)),
                            shape = CircleShape
                        )
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 63.dp,
                            y = 139.dp
                        )
                        .requiredSize(size = 13.dp)
                        .clip(shape = CircleShape)
                        .border(
                            border = BorderStroke(3.dp, Color(0xffa8bbff)),
                            shape = CircleShape
                        )
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 234.dp,
                            y = 77.dp
                        )
                        .requiredSize(size = 11.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(0xffadd2ff))
                )

            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 53.dp,
                    y = 411.dp
                )
                .requiredWidth(width = 318.dp)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Congratulations !!",
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 4.62.em,
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text(
                textAlign = TextAlign.Center,
                lineHeight = 24.sp, // Optional: Set line height for better spacing
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    ) { append("Profile setup completed!\n") } // Added newline here

                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontSize = 18.sp
                        )
                    ) { append("Complete KYC\n") } // Added newline here

                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    ) { append("to enhance your search results.") }
                },
                modifier = Modifier.fillMaxWidth() // Ensure proper wrapping
            )


            /*
        }
        Row(modifier = Modifier.fillMaxSize()) {


            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier
                    .padding(start = 108.dp, top = 579.dp)
                    .requiredWidth(width = 213.dp)
                    .clip(shape = RoundedCornerShape(128.dp))
                    .background(color = Color(0xfff4bb10))
                    .padding(
                        horizontal = 28.dp,
                        vertical = 12.dp
                    )
            ) {
                Text(
                    text = "Complete KYC",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 1.4.em,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(align = Alignment.CenterVertically)
                )
            }


        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .requiredWidth(width = 167.dp)
                .padding(start=128.dp, top=686.dp)
                .clip(shape = RoundedCornerShape(128.dp))
                .background(color = Color(0xff0a77ff))
                .padding(horizontal = 28.dp,
                    vertical = 12.dp)
        ) {
            Text(
                text = "Home",
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 1.4.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically))
        }



    }

        */
        }
    }
}



@Preview(widthDp = 428, heightDp = 936)
@Composable
private fun signup4Preview() {
    signup4(Modifier)
}