package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.BodyText
import com.example.gigglz.components.Three_Dot


@Preview(showBackground = true)
@Composable
fun OtpScreen(
    modifier: Modifier = Modifier,
    navController: NavController = rememberNavController()
) {
    // 1. Retrieve screen dimensions from the current configuration
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    // 2. Define dynamic sizes based on screen width and height
    val titleTextSize = (screenWidth * 0.07f).coerceAtLeast(20.dp).value.sp
    val bodyTextSize = (screenWidth * 0.05f).coerceAtLeast(16.dp).value.sp
    val otpBoxWidth = screenWidth * 0.2f       // Example for OTP box width
    val otpBoxHeight = screenHeight * 0.07f    // Example for OTP box height
    val buttonTextSize = (screenWidth * 0.04f).coerceAtLeast(14.dp).value.sp

    // 3. Build the UI using dynamic sizes
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .navigationBarsPadding()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                    start = Offset(0f, 0f),
                    end = Offset(214f, 936f)
                )
            )
    ) {
        // Title
        Spacer(Modifier.weight(1f))

        BodyText(
            text = "OTP\nVerification",
            fontColor = Color.White,
            fontWeight = FontWeight(700),
            fontSize = titleTextSize,
            lineHeight = (titleTextSize.value * 1.2).sp,
            modifier = Modifier.padding(start = 17.dp)
        )
        Spacer(Modifier.height(10.dp))

        // Card containing OTP-related fields
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(30.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                // Instruction text
                Text(
                    text = "Enter the OTP sent to",
                    fontSize = bodyTextSize,
                    lineHeight = (bodyTextSize.value * 1.2).sp,
                    letterSpacing = (-0.5).sp,
                    fontWeight = FontWeight(400)
                )
                Text(
                    text = "+9112345****1",
                    fontSize = bodyTextSize,
                    lineHeight = (bodyTextSize.value * 1.2).sp,
                    letterSpacing = (-0.5).sp,
                    fontWeight = FontWeight(700)
                )
                Spacer(Modifier.height(24.dp))

                // OTP Boxes
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // Using dynamic width/height for OTP Boxes
                    OTPBox( boxHeight = otpBoxHeight, fontSize = titleTextSize,modifier = Modifier.weight(1f))
                    OTPBox( boxHeight = otpBoxHeight, fontSize = titleTextSize,modifier = Modifier.weight(1f))
                    OTPBox( boxHeight = otpBoxHeight, fontSize = titleTextSize,modifier = Modifier.weight(1f))
                    OTPBox( boxHeight = otpBoxHeight, fontSize = titleTextSize,modifier = Modifier.weight(1f))
                }
                Spacer(Modifier.height(24.dp))

                // Timer Text
                BodyText(
                    text = "05:59",
                    fontSize = bodyTextSize,
                    fontWeight = FontWeight(600),
                    lineHeight = (bodyTextSize.value * 1.2).sp
                )
                Spacer(Modifier.height(28.dp))

                // Additional instructions
                BodyText(
                    text = "Didn't receive the code?",
                    fontSize = bodyTextSize
                )
                BodyText(
                    text = "Send again",
                    fontWeight = FontWeight(600),
                    fontSize = bodyTextSize
                )
                Spacer(Modifier.height(28.dp))


                // Verify Button
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent, // Make containerColor transparent
                        contentColor = Color.White // Set content color to white
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                                start = Offset(0f, 0f),
                                end = Offset(214f, 936f)
                            ),
                            shape = RoundedCornerShape(10.dp) // Apply the same shape to the background
                        )
                ) {
                    BodyText(
                        text = "Verify",
                        fontWeight = FontWeight(900),
                        fontSize = buttonTextSize,
                        fontColor = Color.White
                    )
                }
            }
        }

        Spacer(Modifier.weight(0.5f))

        // Dots and logo section
        Three_Dot(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 4.dp),
            selected = 1
        )
        Image(
            painter = painterResource(R.drawable.gigglzlogo),
            contentDescription = "Logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.weight(0.5f))
    }
}

/**
 * A composable for an individual OTP box,
 * now accepting custom width, height, and font size.
 */
@Composable
private fun OTPBox(
    boxHeight: Dp,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(boxHeight)
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(8.dp),
                color = colorResource(R.color.OTP_Border)
            )
            .clip(RoundedCornerShape(8.dp))
            .background(color = colorResource(R.color.OtpBoxBackground))
    ) {
        BodyText(
            modifier = Modifier.align(Alignment.Center),
            text = "1", // Sample OTP digit
            fontSize = fontSize,
            fontColor = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}