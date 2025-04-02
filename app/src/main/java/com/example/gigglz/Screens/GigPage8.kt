package com.example.gigglz.Screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gigglz.R
import com.example.gigglz.components.BodyText

@Preview(showBackground = true)
@Composable
fun GigPage8(
    //navController: NavController
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val isCompact = screenWidth <= 360.dp
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.istockphoto_824283794_1024x1024_4),
            contentDescription = "Background",
            modifier = Modifier
                .fillMaxWidth()
                .height(if (isCompact) 200.dp else 300.dp)
                .blur(radius = 8.dp),
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = "Event Server",
            style = TextStyle(
                fontSize = if (isCompact) 24.sp else 30.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFF4F4F4)
            ),
            modifier = Modifier.padding(start = 15.dp, top = if (isCompact) 120.dp else 150.dp)
        )
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = if (isCompact) 170.dp else 200.dp, end = 15.dp)
                .align(Alignment.TopEnd),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(if (isCompact) 20.dp else 24.dp),
                    tint = Color(0xFF9EE3FF)
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = "Shukla Hotel",
                    style = TextStyle(
                        fontSize = if (isCompact) 14.sp else 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF9EE3FF),
                    )
                )
            }
            Spacer(Modifier.height(2.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                PowerText(
                    base = "1400",
                    exponent = "200",
                    unit = "hr"
                )
            }
        }

        Card(
            modifier = Modifier
                .padding(top = if (isCompact) 240.dp else 270.dp)
                .fillMaxSize()
                .align(Alignment.Center)
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF))
        ) {
            Column(
                modifier = Modifier.padding(
                    horizontal = if (isCompact) 15.dp else 20.dp,
                    vertical = if (isCompact) 30.dp else 40.dp
                ),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "We are looking for",
                    style = TextStyle(
                        fontSize = if (isCompact) 20.sp else 24.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF030025),
                    )
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "Event servers who are willing to assist our team during the rush hour",
                    style = TextStyle(
                        fontSize = if (isCompact) 14.sp else 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xCC646272),
                    )
                )
                Spacer(Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.calendar2),
                        contentDescription = "Calendar Icon",
                        modifier = Modifier.size(if (isCompact) 14.dp else 18.dp),
                        tint = Color(0xFF53719C),
                    )
                    BodyText(
                        text = "09 - 16 December, 2025",
                        fontSize = if (isCompact) 12.sp else 14.sp,
                        modifier = Modifier.padding(start = 4.dp),
                        fontColor = Color(0xFF53719C)
                    )
                }

                Spacer(Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.clock),
                        contentDescription = "Clock Icon",
                        modifier = Modifier.size(if (isCompact) 12.dp else 18.dp),
                        tint = Color(0xFF53719C)
                    )
                    BodyText(
                        text = "9:30 AM - 4:30 PM",
                        fontSize = if (isCompact) 12.sp else 14.sp,
                        modifier = Modifier.padding(start = 4.dp),
                        fontColor = Color(0xFF53719C)
                    )
                }
                Spacer(Modifier.height(16.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFBDD2ED)),
                    shape = RoundedCornerShape(size = 8.dp)
                ) {
                    Text(
                        text = "The ideal candidate will:",
                        style = TextStyle(
                            fontSize = if (isCompact) 14.sp else 16.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xBD000000),
                        ),
                        modifier = Modifier.padding(10.dp)
                    )
                    val points = listOf(
                        "Set up and break down service areas",
                        "No smoking event",
                        "Private event, may run over up to one hour",
                        "Tend to customers' needs and questions",
                        "Assist in washing dishes",
                        "Maintain a clean and organized service area",
                        "Have amazing people skills"
                    )

                    Text(
                        text = points.joinToString("\n") { "● $it" },
                        style = TextStyle(
                            fontSize = if (isCompact) 13.sp else 15.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xCC646272),
                        ),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                    TextButton(onClick = {}) {
                        Text(
                            text = "View More",
                            style = TextStyle(
                                fontSize = if (isCompact) 13.sp else 15.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF3370BE),
                            ),
                            modifier = Modifier.padding(start = 20.dp)
                        )
                    }
                }

                Spacer(Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Spacer(Modifier.width(8.dp))
                    Image(
                        painter = painterResource(R.drawable.image_5),
                        contentDescription = "Map",
                        modifier = Modifier.size(width = if (isCompact) 160.dp else 180.dp, height = 90.dp)
                    )
                    Spacer(Modifier.width(20.dp))
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.align(Alignment.End)) {
                            Icon(
                                painter = painterResource(R.drawable.map_pin_ic),
                                contentDescription = "Map Icon",
                                tint = Color(0xFF4697FF)
                            )
                            Text(
                                text = "Open In Maps",
                                style = TextStyle(
                                    fontSize = if (isCompact) 14.sp else 16.sp,
                                    fontWeight = FontWeight(600),
                                    color = Color(0xFF4697FF),
                                )
                            )
                        }
                        Text(
                            text = "Shukla Hotel",
                            style = TextStyle(
                                fontSize = if (isCompact) 14.sp else 16.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xF7414141),
                                textAlign = TextAlign.Right,
                            ),
                            modifier = Modifier.align(Alignment.End)
                        )
                        Text(
                            text = "Mandi Bazar Tirwa \nGanj Kannauj",
                            style = TextStyle(
                                fontSize = if (isCompact) 13.sp else 15.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xE5596574),
                                textAlign = TextAlign.Right,
                            )
                        )
                    }
                }
            }
        }
        GradientButton(
            onClick = {
               // navController.navigate(route = "GigPage7")
                      },
            text = "Send OTP",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        )
    }
}