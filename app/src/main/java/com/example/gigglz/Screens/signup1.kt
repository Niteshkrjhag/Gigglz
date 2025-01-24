@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
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
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.Otp
import com.example.gigglz.components.ResendAndVerifyButton
import com.example.gigglz.components.applogo
import com.example.gigglz.components.backimage
import com.example.gigglz.components.otptime
import com.example.gigglz.components.profileicon





















@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun signup9(modifier: Modifier = Modifier, navController: NavController) {

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp



    var email by remember { mutableStateOf("") }
    var phoneno by remember { mutableStateOf("") }
    var whatsappno by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = modifier
                .fillMaxSize()



                .background(color = Color.White)
        )

        {
            Box(
                modifier = modifier
                    .fillMaxSize()


                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                            start = Offset(0f, 0f),
                            end = Offset(214f, 936f)
                        )
                    )
            ) {

                Row(modifier = Modifier.fillMaxWidth()) {
                    Box(
                        modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "XMLID_6_",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .align(Alignment.TopStart)
                                .offset(x = (screenWidth * 0.07f), y = (screenHeight * 0.06f))
                                .size(screenWidth * 0.12f)
                        )
                    }

                }


                Text(
                    text = "Sign Up",
                    color = Color(0xfff4f4f4),
                    style = TextStyle(
                        fontSize = (screenWidth * 0.06f).value.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = (screenWidth * 0.1f), top = (screenHeight * 0.18f))
                )
               // profileicon()
                Box(
                    modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profileicon),
                        contentDescription = "Profile",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                           // .padding(start = )
                            .requiredWidth( screenWidth * 0.21f)
                        .requiredHeight(screenHeight * 0.1f))

                }

                // Contact Details Box


                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 36.dp, top = 271.dp)
                        .requiredWidth(356.dp)
                        .requiredHeight(439.dp)
                        .clip(shape = RoundedCornerShape(30.dp))
                        .background(Color.Black.copy(alpha = 0.4f))
                ) {
                    Text(
                        text = "Contact Details",
                        color = Color(0xfff4f4f4),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(start = 22.dp, top = 19.dp)
                    )

                    // Email Input
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email Address*") },
                        singleLine = true,
                        modifier = Modifier
                            .padding(start = 22.dp, top = 65.dp)
                            .requiredWidth(312.dp)
                            .requiredHeight(62.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                    )

                    // Phone Number Input with Send OTP Button
                    Box(
                        modifier = Modifier
                            .padding(start = 22.dp, top = 144.dp)
                            .requiredWidth(312.dp)
                            .requiredHeight(62.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                    ) {
                        TextField(
                            value = phoneno,
                            onValueChange = { phoneno = it },
                            label = { Text("Phone Number*") },
                            singleLine = true,
                            modifier = Modifier.fillMaxSize()
                        )

                        // Send OTP Button+68888888888888888888
                        Button(
                            onClick = {
                                navController.navigate("signup2")    // Navigate to signup2 screen
                            },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff006ce1)),
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .padding(end = 10.dp)
                                .requiredWidth(79.dp)
                                .requiredHeight(47.dp)
                        ) {
                            Text(
                                text = "Send OTP",
                                color = Color(0xfffffcf1),
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    // WhatsApp Number Input
                    TextField(
                        value = whatsappno,
                        onValueChange = { whatsappno = it },
                        label = { Text("Whatsapp Number*") },
                        singleLine = true,
                        modifier = Modifier
                            .padding(start = 22.dp, top = 223.dp)
                            .requiredWidth(312.dp)
                            .requiredHeight(62.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                    )

                 //   Otp()
                    val otpFields = remember { mutableStateListOf("", "", "", "", "") }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding( top = 300.dp, start=40.dp)
                    ) {
                        repeat(5) { index ->
                            OutlinedTextField(
                                value = otpFields[index],
                                onValueChange = {
                                    if (it.length <= 1 && it.all { char -> char.isDigit() }) {
                                        otpFields[index] = it
                                    }
                                },
                                singleLine = true,
                                textStyle = TextStyle(
                                    fontSize = 30.sp, // Increase font size to fill width and height
                                    textAlign = TextAlign.Center, // Center the text
                                    lineHeight = 47.sp // Ensure vertical centering
                                ),
                                modifier = Modifier
                                    .requiredWidth(47.dp) // Adjusted width
                                    .requiredHeight(47.dp) // Adjusted height
                                    .clip(RoundedCornerShape(5.dp)) // Rounded corners
                                    .background(Color(0xffb5b7b9)),
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    //   backgroundColor = Color.Transparent,
                                    focusedBorderColor = Color.Transparent,
                                    unfocusedBorderColor = Color.Transparent,
                                    // textColor = Color.Black // Ensure text is visible
                                )
                            )
                        }
                    }

               //     otptime()

                    Text(
                        text = "1:29s left",
                        color = Color(0xfffffcf1),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium),
                        modifier = Modifier
                            .requiredWidth(width = 99.dp)
                            .offset(x=129.dp,y=344.dp)
                            .requiredHeight(height = 30.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically))

                 //   ResendAndVerifyButton()

                    Button(
                        onClick = {   },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff006ce1)),
                        modifier = Modifier
                            .requiredWidth(width = 96.dp)
                            .offset(x=56.dp, y=377.dp)

                            .requiredHeight(height = 51.dp)){
                        Text("Resend   OTP", color = Color.White, textAlign = TextAlign.Center)
                    }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(20.dp),
                        colors=     ButtonDefaults.buttonColors(containerColor = Color(0xff51fa26).copy(alpha = 0.2f)),
                        modifier = Modifier
                            .requiredWidth(width = 96.dp)

                            .offset(x= 205.dp, y=377.dp)
                            .requiredHeight(height = 51.dp)){
                        Text("Verify   OTP", color = Color.White, textAlign = TextAlign.Center)



                    }
                }

               // applogo()
                Box(modifier = Modifier.fillMaxSize()) {
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


                }

                Row(modifier = Modifier.fillMaxWidth().padding(start = 33.dp, top = 731.dp),) {

                    TextButton(
                        onClick = {
                            // Add your onClick functionality here
                        },
                        modifier = Modifier.padding(8.dp),
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFF4BB10) // Setting the text color for the TextButton
                        )
                    ) {
                        Text(
                            text = "PREVIOUS",
                            fontSize = 18.sp
                            //  style = MaterialTheme.typography.button // Apply a button-style typography
                        )
                    }
                        Spacer(modifier = Modifier.width(150.dp))

                        // Next Button
                        TextButton(
                            onClick = {
                                // Add your onClick functionality here
                            },
                            modifier = Modifier.padding(8.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(0xFFF4BB10) // Setting the text color for the TextButton
                            )
                        ) {
                            Text(
                                text = "NEXT",
                                fontSize = 18.sp
                            )
                        }

                    }

                }
            }
        }
    }




@Preview()
@Composable
private fun Signup9Preview() {
    val navController = rememberNavController()

    signup9( modifier = Modifier,
        navController = navController)
}





@Composable
fun signup1(modifier: Modifier = Modifier, navController: NavController) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    var email by remember { mutableStateOf("") }
    var phoneno by remember { mutableStateOf("") }
    var whatsappno by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                            start = Offset(0f, 0f),
                            end = Offset(screenWidth.value, screenHeight.value)
                        )
                    )
            ) {

                Row(modifier = Modifier.fillMaxWidth()) {
                    Box(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "Back",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = (screenWidth * 0.07f), y = (screenHeight * 0.06f))
                                .size(screenWidth * 0.12f)
                        )
                    }
                }

                Text(
                    text = "Sign Up",
                    color = Color(0xfff4f4f4),
                    style = TextStyle(
                        fontSize = (screenWidth * 0.06f).value.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = (screenWidth * 0.1f), top = (screenHeight * 0.18f))
                )

                Box(
                    modifier = Modifier.fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.profileicon),
                        contentDescription = "Profile Icon",
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = (screenWidth * 0.65f), y = (screenHeight * 0.16f))
                            .size(screenWidth * 0.25f)
                    )



                }

                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(
                            start = (screenWidth * 0.08f),
                            top = (screenHeight * 0.3f)
                        )
                        .width(screenWidth * 0.85f)
                        .height(screenHeight * 0.45f)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.Black.copy(alpha = 0.4f))
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = (screenWidth * 0.05f))
                    ) {
                        Text(
                            text = "Contact Details",
                            color = Color(0xfff4f4f4),
                            style = TextStyle(
                                fontSize = (screenWidth * 0.05f).value.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            modifier = Modifier.padding(top = (screenHeight * 0.02f))
                        )

                        TextField(
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("Email Address*") },
                            singleLine = true,
                            modifier = Modifier
                                .padding(top = (screenHeight * 0.03f))
                                .fillMaxWidth()
                                .height(screenHeight * 0.07f)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color.White)
                        )

                        Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(top = (screenHeight * 0.03f)),
    verticalAlignment = Alignment.CenterVertically, // Align items vertically centered
    horizontalArrangement = Arrangement.SpaceBetween // Space items appropriately
) {
    // TextField takes most of the available width
    TextField(
        value = phoneno,
        onValueChange = { phoneno = it },
        label = { Text("Phone Number*") },
        singleLine = true,
        modifier = Modifier
            .weight(1f) // Make TextField flexible in width
            .height(screenHeight * 0.07f)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
    )

    Spacer(modifier = Modifier.width(screenWidth * 0.02f)) // Add spacing between TextField and Button

    // Button is placed to the right
    Button(
        onClick = { navController.navigate("signup2") },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff006ce1)),
        modifier = Modifier
            .height(screenHeight * 0.07f)
            .width(screenWidth * 0.22f)
    ) {
        Text("Send OTP", color = Color(0xfffffcf1))
    }
}


                        TextField(
                            value = whatsappno,
                            onValueChange = { whatsappno = it },
                            label = { Text("WhatsApp Number*") },
                            singleLine = true,
                            modifier = Modifier
                                .padding(top = (screenHeight * 0.03f))
                                .fillMaxWidth()
                                .height(screenHeight * 0.07f)
                                .clip(RoundedCornerShape(20.dp))
                                .background(Color.White)
                        )





                        Spacer(modifier = Modifier.height(screenHeight * 0.03f))

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(screenWidth * 0.02f),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            repeat(5) {
                                OutlinedTextField(
                                    value = "", // Replace with your OTP handling logic
                                    onValueChange = {},
                                    singleLine = true,
                                    textStyle = TextStyle(
                                        fontSize = (screenWidth * 0.05f).value.sp,
                                        textAlign = TextAlign.Center
                                    ),
                                    modifier = Modifier
                                        .size(screenWidth * 0.12f)
                                        .clip(RoundedCornerShape(5.dp))
                                        .background(Color(0xffb5b7b9))
                                )
                            }
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = (screenHeight * 0.05f))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gigglzlogo),
                        contentDescription = "App Logo",
                        modifier = Modifier.size(screenWidth * 0.3f)
                    )
                }
            }
        }
    }
}

@Preview()
@Composable
private fun Signup1Preview() {
    val navController = rememberNavController()
    signup1(modifier = Modifier, navController = navController)
}
