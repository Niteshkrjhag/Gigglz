@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.gigglz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gigglz.R
import com.example.gigglz.ui.theme.Primary
import androidx.compose.material3.Text as Text1


@Composable
fun skip(value: String) {
    Box(
        modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
    ) {
        Text1(
            text = "Skip",
            color = Color(0xfff4f4f4),
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(Alignment.TopStart) // Correct usage of align in a Box
                .offset(
                    x = 351.dp,
                    y = 37.dp
                )
        )
    }


}


@Composable
fun backimage() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
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
        }

    }
}
@Composable
fun profileicon() {
    Box(
        modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
    ) {
        Image(
            painter = painterResource(id = R.drawable.profileicon),
            contentDescription = "Profile",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 151.dp)
                .requiredSize(size = 100.dp))

    }

}

@Composable
fun HeadingText(value: String) {
    Box(
        modifier = Modifier.fillMaxSize() // Ensures the Box fills the available space
    ) {
        Text1(
            text =  value,
            color = Color(0xfff4f4f4),
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 41.dp,
                    y = 172.dp))



    }



    }


@Composable
fun applogo() {
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
}
  @Preview
  @Composable
  fun Otp() {
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
  }

/*
  @Composable
fun Otp() {
      var otpFields = remember { mutableStateListOf("", "", "", "" , "") }
      Row(
          horizontalArrangement = Arrangement.spacedBy(8.dp),
          modifier = Modifier.fillMaxWidth()
            .padding(start=66.dp, top=300.dp ,end=66.dp)
            //  .offset(x=66.dp, y=300.dp)

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
                    //  fontSize = 40.sp,

                    //  textAlign = TextAlign.Center
                 ),

                  modifier = Modifier
                      .requiredWidth(width = 37.dp)
                      .requiredHeight(height = 47.dp)
                      .clip(shape = RoundedCornerShape(5.dp))
                      .background(color = Color(0xffb5b7b9) )

              )
          }
      }
}
*/
@Composable
fun otptime() {

    Text1(
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
}

@Composable
fun ResendAndVerifyButton() {

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