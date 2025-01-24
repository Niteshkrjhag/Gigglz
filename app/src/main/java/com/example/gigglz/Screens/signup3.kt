package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.applogo
import com.example.gigglz.components.backimage
import com.example.gigglz.components.skip

@Composable
fun signup3(modifier: Modifier , navController: NavController) {
    Box(
        modifier = modifier
            .requiredWidth(width = 428.dp)
            .requiredHeight(height = 936.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(brush = Brush.linearGradient(
                0f to Color(0xff0a0a53),
                1f to Color(0xff050533),
                start = Offset(22f, 17.5f),
                end = Offset(214f, 936f)))
    ) {
       backimage()
        skip("Skip")
      //  NEXT3()



//
       applogo()

        Text(
            text = "Set up of your Profile",
            color = Color.White,
            style = TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 54.dp,
                    y = 140.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 224.dp)
                .requiredWidth(width = 396.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Let’s Finish Setup by Adding\nYour Profile Photo.",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    lineHeight = 1.25.em,
                    style = MaterialTheme.typography.headlineSmall)
            }
            Box(
                modifier = Modifier
                    .requiredSize(size = 176.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 176.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffecf4fc)))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 17.dp,
                            y = 17.dp)
                        .requiredSize(size = 142.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(0xffd3e7ff)))
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Iconsax/Bold/profile",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 50.dp,
                            y = 54.dp)
                        .requiredSize(size = 77.dp))
            }
            MobileButton()
            MobileButton2()

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
                    navController.navigate("signup4")
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



@Composable
fun MobileButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        shape = RoundedCornerShape(128.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        contentPadding = PaddingValues(horizontal = 28.dp, vertical = 12.dp),
        modifier = modifier
            .requiredWidth(width = 167.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .requiredWidth(width = 167.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera Ic")
            Text(
                text = "Camera",
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 1.4.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically))
        }
    }
}











/*
@Composable
fun NEXT3(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 36.dp,
                end = 316.dp,
                top = 710.dp,
                bottom = 207.dp)
    ) {
        Text(
            text = "PREVIOUS",
            color = Color(0xfff4bb10),
            textAlign = TextAlign.End,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .fillMaxSize())
    }
}
  */
@Composable
fun MobileButton2(modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        shape = RoundedCornerShape(128.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        contentPadding = PaddingValues(horizontal = 28.dp, vertical = 12.dp),
        modifier = modifier
            .requiredWidth(width = 286.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .requiredWidth(width = 286.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Gallary Ic"
            )
            Text(
                text = "Choose From Gallary",
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 1.4.em,
                style = TextStyle(
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}










@Preview(widthDp = 428, heightDp = 936)
@Composable
private fun signup3Preview() {
    val navController = rememberNavController()


    signup3( modifier = Modifier,
        navController = navController)


}
