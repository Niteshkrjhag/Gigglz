package com.example.gigglz.Screens

import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gigglz.R


@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    var email by remember{ mutableStateOf("") }
    var phoneNum by remember{ mutableStateOf("") }
    var whatsAppNum by remember{ mutableStateOf("") }
    var isExpanded by remember{ mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TopSectionProfile()
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Complete your Profile",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(700),
                textAlign = TextAlign.Center,
                letterSpacing = 0.96.sp,
            ),
            modifier = Modifier
                .padding(horizontal = 15.dp)

        )
        Spacer(Modifier.height(8.dp))
        CustomLinearProgressIndicator(
            progress = 0.75f
        )
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ){
            ContactDetails(
                modifier = Modifier
                    .padding(horizontal = 15.dp),
                email = email,
                phoneNum = phoneNum,
                whatsAppNum = whatsAppNum
            )
            Spacer(Modifier.height(8.dp))
            PrimaryDetails1(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
            )
            Spacer(Modifier.height(8.dp))
            PrimaryDetails2(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
            )
            Spacer(Modifier.height(12.dp))
        }
    }
}


@Composable
private fun TopSectionProfile(
    userName: String = "Sophia Rose",
    userEmail: String = "sophiar123@gmail.com"
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        shape = RoundedCornerShape(
            bottomStart = 24.dp,
            bottomEnd = 24.dp,
            topStart = 0.dp,
            topEnd = 0.dp
        ), // Keep top flat
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.profileTopSectionBackground)
        )
    ) {
        Spacer(Modifier.weight(0.75f))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.unsplash_bqe0j0b26rq),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(50.dp))
            )
            Spacer(Modifier.height(5.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "$userName",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFF4F4F4),

                        )
                )
                RatingWithStars(
                    rating = 4.2,
                    textColor = Color(0xFFF4BB10),
                    starColor = Color(0xFFF4BB10)
                )
            }
            Spacer(Modifier.height(4.dp))
            Text(
                text = "$userEmail",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )

            )
            Spacer(Modifier.height(25.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColumnText()
                VerticalDivider()
                ColumnText(
                    top = "27",
                    bottom = "Part-time Jobs"
                )
                VerticalDivider()
                Column() {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "4.1",
                            fontSize = 16.sp,
                            color = Color.White,
                            fontWeight = FontWeight(600)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color(0xFFF4F4F4),
                            modifier = Modifier
                                .size(13.dp)
                        )
                    }
                    Text(
                        text = "Last Gig",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(300),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center
                        )
                    )
                }

            }
        }
        Spacer(Modifier.weight(0.2f))
    }
}


@Composable
fun RatingWithStars(
    rating: Double,
    starColor: Color,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(color = Color(0x1FFFFFFF), shape = RoundedCornerShape(size = 13.dp))
            .width(40.dp)
            .height(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$rating",
            fontSize = 15.sp,
            color = textColor,
            fontWeight = FontWeight(600)
        )
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Star",
            tint = starColor,
            modifier = Modifier
                .size(13.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RatingWithStarsPreview() {
    RatingWithStars(rating = 4.1, starColor = Color.Yellow, textColor = Color.Black)
}

@Composable
private fun ColumnText(
    top: String = "45",
    bottom: String = "Gigs"
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = top,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFF4F4F4),
            )
        )
        Text(
            text = bottom,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center
            )
        )
    }
}


@Composable
fun CustomLinearProgressIndicator(
    progress: Float, // Value between 0.0f and 1.0f
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(start = 15.dp, end = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .height(12.dp)
                .clip(RoundedCornerShape(23.dp)) // Clip to ensure rounded corners
                .background(color = Color(0xFFD9D9D9)) // Light gray background
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth() // Ensures full width for correct clipping
                    .matchParentSize()
                    .clip(RoundedCornerShape(23.dp)) // Keeps corners smooth
            ) {
                val gradient = Brush.horizontalGradient(
                    colors = listOf(Color(0xFFF4A627), Color(0xFFFCCF5E)),
                    startX = 0f,
                    endX = size.width * progress // Restrict gradient width to progress
                )
                drawRoundRect(
                    brush = gradient,
                    size = Size(size.width * progress, size.height), // Clip gradient width
                    cornerRadius = CornerRadius(23.dp.toPx(), 23.dp.toPx()) // Rounded edges
                )
            }
        }

        Spacer(modifier = Modifier.width(8.dp)) // Space between progress bar and text

        Text(
            text = "${(progress * 100).toInt()}%", // Convert fraction to percentage
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun ContactDetails(
    modifier: Modifier = Modifier,
    email:String,
    phoneNum : String,
    whatsAppNum :String
) {
    Card(
        modifier = modifier
            .shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(24.dp),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            ),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        )

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Minimize",
                        modifier = Modifier
                            .size(48.dp),
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Contact Details",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF1D1B20),
                    )
                )
                Spacer(Modifier.weight(1f))
                Image(
                    painter = painterResource(R.drawable.image_53),
                    contentDescription = "Completed",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(26.dp)
                )
            }
            TextTrailingIcon()
            Spacer(Modifier.height(1.dp))
            TextTrailingIcon(
                text = "+91 1234567890",
                icon = painterResource(R.drawable.baseline_phone_iphone_24)
            )
            Spacer(Modifier.height(1.dp))
            TextTrailingIcon(
                icon = painterResource(R.drawable.image_45),
                text = "+91 1234567890"
            )
            Spacer(Modifier.height(2.dp))
        }
    }
}


@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun TextTrailingIcon(
    text: String = "sophiar123@gmail.com",
    value: String = "",
    onValueChange: (String) -> Unit = {},
    icon: Painter = painterResource(R.drawable.baseline_email_24)
) {
    var email by remember{ mutableStateOf("") }
    var phoneNum by remember{ mutableStateOf("") }
    var whatsAppNum by remember{ mutableStateOf("") }

    OutlinedTextField(
        value = email,
        onValueChange = {email = it},
        placeholder = {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0x991D1B20),
                )
            )
        },
        trailingIcon = {
            Icon(
                painter = icon,
                contentDescription = "null",
                modifier = Modifier
                    .size(20.dp)
            )
        },
        modifier = Modifier
            .height(48.dp)
            .background(color = Color(0x1406014B), shape = RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,  // Hide border when focused
            unfocusedBorderColor = Color.Transparent, // Hide border when unfocused
            disabledBorderColor = Color.Transparent, // Hide border when disabled
            errorBorderColor = Color.Transparent // Hide border when error occurs
        )
    )
}

@Composable
private fun PrimaryDetails1(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(24.dp),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            )
            .height(60.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Minimize",
                    modifier = Modifier
                        .size(32.dp),
                    tint = Color.Black
                )
            }
            Text(
                text = "Primary Details Part 2",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF1D1B20),
                )
            )
        }
    }
}




@Composable
private fun PrimaryDetails2(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(24.dp),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            )
            .height(60.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Minimize",
                    modifier = Modifier
                        .size(32.dp),
                    tint = Color.Black
                )
            }
            Text(
                text = "Primary Details Part 2",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF1D1B20),
                )
            )
        }
    }
}