package com.example.gigglz.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gigglz.R
import java.util.Currency
import java.util.Locale

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    var email by remember{ mutableStateOf("") }
    var phoneNum by remember{ mutableStateOf("") }
    var whatsAppNum by remember{ mutableStateOf("") }
    var selectedCard by remember { mutableStateOf<String?>(null) } // Tracks the expanded card

    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .navigationBarsPadding()
    ) {
        TopSectionProfile()
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Complete your Profile",
            style = TextStyle(
                fontSize = with(LocalDensity.current) {(screenWidth * 0.04f).toSp()}, // Responsive font size
                lineHeight = with(LocalDensity.current) {(screenWidth * 0.04f).toSp()},
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                letterSpacing = with(LocalDensity.current){(screenWidth * 0.0025f).toSp()}, // Responsive letter spacing
            ),
            modifier = Modifier
                .padding(horizontal = screenWidth * 0.05f) // Responsive padding
        )
        Spacer(Modifier.height(8.dp))
        CustomLinearProgressIndicator(
            progress = 0.75f
        )
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
               // .verticalScroll(rememberScrollState())
                .fillMaxHeight()
                .background(Color(0xFFF4F4F4))
        ){
            ContactDetails(
                modifier = Modifier
                    .padding(horizontal = 15.dp),
                email = email,
                phoneNum = phoneNum,
                whatsAppNum = whatsAppNum,
                isExpand = selectedCard == "contact", // Expand only if selected
                onClick = { selectedCard = if (selectedCard == "contact") null else "contact" }
            )
            Spacer(Modifier.height(8.dp))
            PrimaryDetails_1(
                isExpand = selectedCard == "primary1",
                onClick = { selectedCard = if (selectedCard == "primary1") null else "primary1" }
            )
            Spacer(Modifier.height(8.dp))
            PrimaryDetails_2(
                isExpand = selectedCard == "primary2",
                onClick = { selectedCard = if (selectedCard == "primary2") null else "primary2" }
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}


@Composable
private fun TopSectionProfile(
    userName: String = "Sophia Rose",
    userEmail: String = "sophiar123@gmail.com"
) {
    // Get screen width & height dynamically
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight * 0.38f), // Adjust height relative to screen size
        shape = RoundedCornerShape(
            bottomStart = screenWidth * 0.06f, // Scales based on screen width
            bottomEnd = screenWidth * 0.06f
        ), // Keep top flat
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.profileTopSectionBackground)
        )
    ) {
        Spacer(Modifier.weight(0.75f))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = screenWidth * 0.12f), // Responsive padding
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.unsplash_bqe0j0b26rq),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(screenWidth * 0.22f) // Scales image based on screen width
                    .clip(RoundedCornerShape(50))
            )

            Spacer(Modifier.height(screenHeight * 0.007f))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(screenWidth * 0.01f)
            ) {
                Text(
                    text = userName,
                    style = TextStyle(
                        fontSize = with(LocalDensity.current) { (screenWidth * 0.045f).toSp() }, // Convert Dp to Sp
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF4F4F4),
                    )
                )
                RatingWithStars(
                    rating = 4.2,
                    textColor = Color(0xFFF4BB10),
                    starColor = Color(0xFFF4BB10)
                )
            }

            Spacer(Modifier.height(screenHeight * 0.005f))

            Text(
                text = userEmail,
                style = TextStyle(
                    fontSize = with(LocalDensity.current) { (screenWidth * 0.04f).toSp() },
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )
            )

            Spacer(Modifier.height(screenHeight * 0.03f)) // Responsive spacing

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(screenHeight * 0.065f), // Scales with screen size
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
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "4.1",
                            fontSize = with(LocalDensity.current) { (screenWidth * 0.045f).toSp() },
                            color = Color.White,
                            fontWeight = FontWeight.SemiBold
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color(0xFFF4F4F4),
                            modifier = Modifier.size(screenWidth * 0.035f)
                        )
                    }
                    Text(
                        text = "Last Gig",
                        style = TextStyle(
                            fontSize = with(LocalDensity.current) { (screenWidth * 0.04f).toSp() },
                            fontWeight = FontWeight.Light,
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
@Composable
private fun ContactDetails(
    modifier: Modifier = Modifier,
    email: String,
    phoneNum: String,
    whatsAppNum: String,
    isExpand: Boolean, // Expand only if selected
    onClick: () -> Unit = {}
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    if(isExpand){
        Card(
            modifier = modifier
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(screenWidth * 0.06f), // Dynamic corner radius
                    spotColor = Color.Black,
                    ambientColor = Color.DarkGray
                ),
            shape = RoundedCornerShape(screenWidth * 0.06f),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4F4F4)
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(screenWidth * 0.04f), // Responsive padding
                verticalArrangement = Arrangement.spacedBy(screenWidth * 0.008f) // Responsive spacing
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onClick
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Minimize",
                            modifier = Modifier
                                .size(screenWidth * 0.08f), // Dynamic icon size
                            tint = Color.Black
                        )
                    }
                    Text(
                        text = "Contact Details",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1D1B20),
                        )
                    )
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.image_53),
                        contentDescription = "Completed",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(screenWidth * 0.07f) // Responsive image size
                    )
                }
                TextTrailingIcon()
                Spacer(Modifier.height(screenWidth * 0.004f)) // Dynamic spacing
                TextTrailingIcon(
                    text = "+91 1234567890",
                    icon = painterResource(R.drawable.baseline_phone_iphone_24)
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                TextTrailingIcon(
                    text = "+91 1234567890",
                    icon = painterResource(R.drawable.image_45)
                )
                Spacer(Modifier.height(screenWidth * 0.006f))
            }
        }
    }else{
        ContactDetails1(
            modifier = modifier,
            onClick = onClick
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun TextTrailingIcon(
    modifier: Modifier = Modifier.fillMaxWidth(),
    text: String = "sophiar123@gmail.com",
    icon: Painter = painterResource(R.drawable.baseline_email_24),
    onValueChange: (String) -> Unit = {}
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    var inputValue by remember { mutableStateOf("") }

    OutlinedTextField(
        value = inputValue,
        onValueChange = {
            inputValue = it
            onValueChange(it)
        },
        placeholder = {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                    lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                    fontWeight = FontWeight.Medium,
                    color = Color(0x991D1B20),
                )
            )
        },
        trailingIcon = {
            Icon(
                painter = icon,
                contentDescription = "null",
                modifier = Modifier
                    .size(screenWidth * 0.06f) // Dynamic icon size
            )
        },
        modifier = modifier
            .height(screenWidth * 0.13f) // Dynamic height
            .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f)),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            disabledBorderColor = Color.Transparent,
            errorBorderColor = Color.Transparent
        )
    )
}

@Composable
private fun PrimaryDetails1(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    Card(
        modifier = modifier
            .shadow(
                elevation = screenWidth * 0.03f, // Dynamic elevation
                shape = RoundedCornerShape(screenWidth * 0.06f),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            )
            .height(screenWidth * 0.15f), // Scales with screen size
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = screenWidth * 0.025f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onClick
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Minimize",
                    modifier = Modifier
                        .size(screenWidth * 0.08f), // Scales icon size dynamically
                    tint = Color.Black
                )
            }
            Text(
                text = "Primary Details Part 1",
                style = TextStyle(
                    fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1D1B20),
                )
            )
        }
    }
}




@Composable
private fun PrimaryDetails2(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    Card(
        modifier = modifier
            .shadow(
                elevation = screenWidth * 0.03f, // Dynamic elevation
                shape = RoundedCornerShape(screenWidth * 0.06f),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            )
            .height(screenWidth * 0.15f), // Scales with screen size
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        ),
        shape = RoundedCornerShape(screenWidth * 0.06f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = screenWidth * 0.025f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onClick
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Minimize",
                    modifier = Modifier
                        .size(screenWidth * 0.08f), // Scales icon size dynamically
                    tint = Color.Black
                )
            }
            Text(
                text = "Primary Details Part 2",
                style = TextStyle(
                    fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1D1B20),
                )
            )
        }
    }
}


@Composable
private fun ContactDetails1(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current

    Card(
        modifier = modifier
            .shadow(
                elevation = screenWidth * 0.03f, // Dynamic elevation
                shape = RoundedCornerShape(screenWidth * 0.06f),
                spotColor = Color.Black,
                ambientColor = Color.DarkGray
            )
            .height(screenWidth * 0.15f), // Scales with screen size
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF4F4F4)
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = screenWidth * 0.025f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onClick
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Minimize",
                    modifier = Modifier
                        .size(screenWidth * 0.08f), // Scales icon size dynamically
                    tint = Color.Black
                )
            }
            Text(
                text = "Contact Details",
                style = TextStyle(
                    fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1D1B20),
                )
            )
        }
    }
}

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PrimaryDetails_1(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    isExpand:Boolean = true
){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current
    var inputValue by remember { mutableStateOf("") }
    if(isExpand){
        Card(
            modifier = modifier
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(screenWidth * 0.12f), // Dynamic corner radius
                    spotColor = Color.Black,
                    ambientColor = Color.DarkGray
                )
                .padding(horizontal = 15.dp),
            shape = RoundedCornerShape(screenWidth * 0.06f),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4F4F4)
            )

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(screenWidth * 0.04f)
                , // Responsive padding
                verticalArrangement = Arrangement.spacedBy(screenWidth * 0.008f), // Responsive spacing
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically

                ){
                    IconButton(
                        onClick = onClick
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Minimize",
                            modifier = Modifier
                                .size(screenWidth *  0.08f), // Dynamic icon size
                            tint = Color.Black
                        )
                    }
                    Text(
                        text = "Primary Details",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1D1B20),
                        )
                    )
                    Spacer(Modifier.weight(1f))
                    Text(
                        text = "1/2",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                            fontWeight = FontWeight.Normal,
                            color = Color.LightGray,
                        )
                    )
                }
                Spacer(Modifier.height(screenWidth * 0.004f))

                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Choose Industry*",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    trailingIcon = {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Black
                            ),
                            modifier = Modifier.padding(vertical = 5.dp)
                        ){
                            Text(
                                text = "Category",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight(900),
                                    color = Color(0xFFFFFFFF),
                                    textAlign = TextAlign.Center,
                                )
                            )
                        }
                    },
                    modifier = Modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Full name as per Aadhar",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    modifier = Modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ){
                    OutlinedTextField(
                        value = inputValue,
                        onValueChange = {
                            inputValue = it
                        },
                        placeholder = {
                            Text(
                                text = "DOB (DD-MM-YYYY)*",
                                style = TextStyle(
                                    fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                    lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0x991D1B20),
                                )
                            )
                        },
                        modifier = Modifier
                            .height(screenWidth * 0.13f) // Dynamic height
                            .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                            .weight(0.60f),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            disabledBorderColor = Color.Transparent,
                            errorBorderColor = Color.Transparent
                        )
                    )
                    OutlinedTextField(
                        value = inputValue,
                        onValueChange = {
                            inputValue = it
                        },
                        placeholder = {
                            Text(
                                text = "Gender",
                                style = TextStyle(
                                    fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                    lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                    fontWeight = FontWeight.Medium,
                                    color = Color(0x991D1B20),
                                )
                            )
                        },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = "null",
                                modifier = Modifier
                                    .size(screenWidth * 0.06f) // Dynamic icon size
                            )
                        },
                        modifier = modifier
                            .weight(0.30f)
                            .height(screenWidth * 0.13f) // Dynamic height
                            .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f)),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            disabledBorderColor = Color.Transparent,
                            errorBorderColor = Color.Transparent
                        )
                    )

                }
                Spacer(Modifier.height(screenWidth * 0.004f))
                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "${getCurrencySymbol(Locale("hi", "IN"))} Annual Income",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "null",
                            modifier = Modifier
                                .size(screenWidth * 0.06f) // Dynamic icon size
                        )
                    },
                    modifier = modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .fillMaxSize()
                        .background(color = Color(0x1406014B),
                            shape = RoundedCornerShape(screenWidth * 0.03f)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        modifier = Modifier
                            .offset(x = -10.dp),
                        colors = CheckboxDefaults.colors(
                            uncheckedColor =  Color(0x80090727)
                        )
                    )
                    Text(
                        text = "I am a student",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                            lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                            fontWeight = FontWeight.Medium,
                            color = Color(0x991D1B20),
                        ),
                        modifier = Modifier
                            .offset(x=-10.dp)
                    )

                }
//                Spacer(Modifier.height(screenWidth * 0.007f))
            }
        }
    }else{
        PrimaryDetails1(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            onClick = onClick
        )
    }

}

fun getCurrencySymbol(locale: Locale): String {
    val currency = Currency.getInstance(locale)
    return currency.symbol
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun PrimaryDetails_2(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    isExpand:Boolean = false
){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val density = LocalDensity.current
    var inputValue by remember { mutableStateOf("") }
    if(isExpand){
        Card(
            modifier = modifier
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(screenWidth * 0.12f), // Dynamic corner radius
                    spotColor = Color.Black,
                    ambientColor = Color.DarkGray
                )
                .padding(horizontal = 15.dp),
            shape = RoundedCornerShape(screenWidth * 0.06f),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4F4F4)
            )

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(screenWidth * 0.04f), // Responsive padding
                verticalArrangement = Arrangement.spacedBy(screenWidth * 0.008f) // Responsive spacing
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    IconButton(
                        onClick = onClick
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Minimize",
                            modifier = Modifier
                                .size(screenWidth *  0.08f), // Dynamic icon size
                            tint = Color.Black
                        )
                    }
                    Text(
                        text = "Primary Details",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.04f).toSp() }, // Dynamic font size
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1D1B20),
                        )
                    )
                    Spacer(Modifier.weight(1f))
                    Text(
                        text = "2/2",
                        style = TextStyle(
                            fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                            fontWeight = FontWeight.Normal,
                            color = Color.LightGray,
                        )
                    )
                }
                Spacer(Modifier.height(screenWidth * 0.004f))

                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Location",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = {}) {
                            Icon(
                                painter = painterResource(R.drawable.location_target),
                                contentDescription = "Target Location"
                            )
                        }
                    },
                    modifier = Modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))

                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Work Experience(in months)",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    leadingIcon ={
                        Icon(
                            painter = painterResource(R.drawable.brifecase_timer),
                            contentDescription = "null",
                            modifier = Modifier
                                .size(screenWidth * 0.06f) // Dynamic icon size
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "null",
                            modifier = Modifier
                                .size(screenWidth * 0.06f) // Dynamic icon size
                        )
                    },
                    modifier = Modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Highest Education",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    leadingIcon ={
                        Icon(
                            painter = painterResource(R.drawable.graduation_cap_02),
                            contentDescription = "null",
                            modifier = Modifier
                                .size(screenWidth * 0.06f) // Dynamic icon size
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "null",
                            modifier = Modifier
                                .size(screenWidth * 0.06f) // Dynamic icon size
                        )
                    },
                    modifier = modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .fillMaxSize()
                        .background(color = Color(0x1406014B),
                            shape = RoundedCornerShape(screenWidth * 0.03f)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.004f))
                OutlinedTextField(
                    value = inputValue,
                    onValueChange = {
                        inputValue = it
                    },
                    placeholder = {
                        Text(
                            text = "Work Preference",
                            style = TextStyle(
                                fontSize = with(density) { (screenWidth * 0.035f).toSp() }, // Dynamic font size
                                lineHeight = with(density) { (screenWidth * 0.04f).toSp() },
                                fontWeight = FontWeight.Medium,
                                color = Color(0x991D1B20),
                            )
                        )
                    },
                    trailingIcon = {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Black
                            ),
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                        ){
                            Text(
                                text = "Choose",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight(900),
                                    color = Color(0xFFFFFFFF),
                                    textAlign = TextAlign.Center,
                                )
                            )
                        }
                    },
                    modifier = Modifier
                        .height(screenWidth * 0.13f) // Dynamic height
                        .background(color = Color(0x1406014B), shape = RoundedCornerShape(screenWidth * 0.03f))
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent,
                        errorBorderColor = Color.Transparent
                    )
                )
                Spacer(Modifier.height(screenWidth * 0.007f))
            }
        }
    }else{
        PrimaryDetails2(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            onClick = onClick
        )
    }

}
