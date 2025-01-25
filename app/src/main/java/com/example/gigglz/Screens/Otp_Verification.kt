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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .navigationBarsPadding()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                    start = Offset(0f, 0f),
                    end = Offset(214f, 936f)
                )
            )
    ) {
        BodyText(
            text = "OTP\nVerification",
            fontColor = Color.White,
            modifier = Modifier.offset(
                y = 150.dp,
                x = 30.dp
            ),
            fontWeight = FontWeight(700),
            fontSize = 28.sp,
            lineHeight = 34.sp
        )
        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(top = 170.dp)
                .align(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(30.dp)),
            colors = CardDefaults.cardColors(containerColor =
            Color.Black)
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text(
                    text = "Enter the OTP sent to",
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    letterSpacing = (-0.5).sp,
                    fontWeight = FontWeight(400),
                    color = Color.White
                )
                Text(
                    text = "+9112345****1",
                    fontSize = 20.sp,
                    lineHeight = 24.sp,
                    letterSpacing = (-0.5).sp,
                    fontWeight = FontWeight(700),
                    color = Color.White
                )
                Spacer(Modifier.height(24.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    OTPBox()
                    OTPBox()
                    OTPBox()
                    OTPBox()
                }
                Spacer(Modifier.height(24.dp))
                BodyText(
                    text = "05:59",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    lineHeight = 18.sp,
                    fontColor = colorResource(R.color.OTP_Border),

                )
                Spacer(Modifier.height(28.dp))
                BodyText(
                        text = "Didn't receive the code?",
                    fontColor = Color.White
                        )
                BodyText(
                    text = "Send again",
                    fontWeight = FontWeight(600),
                    fontColor = Color.White
                )
                Spacer(Modifier.height(28.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    BodyText(
                        text = "Verify",
                        fontWeight = FontWeight(900),
                        fontSize = 16.sp
                    )
                }
            }
        }
        Spacer(Modifier.weight(1f))

        Three_Dot(
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 4.dp),
            selected = 1
        )
        Image(
            painter = painterResource(R.drawable.gigglzlogo),
            contentDescription = "Logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(Modifier.height(28.dp))
    }
}

@Composable
private fun OTPBox(){
Box(
    modifier = Modifier.size(60.dp)
        .border(width = 1.dp, shape = RoundedCornerShape(8.dp), color = colorResource(R.color.OTP_Border))
        .clip(RoundedCornerShape(8.dp))
){
    BodyText(
        modifier = Modifier.align(Alignment.Center),
        text = "1",
        fontSize = 30.sp,
        fontColor = colorResource(R.color.OTP_Border)
    )
}
}


