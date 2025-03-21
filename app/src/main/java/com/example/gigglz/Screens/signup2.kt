package com.example.gigglz.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.HeadingText
import com.example.gigglz.components.applogo
import com.example.gigglz.components.backimage
import com.example.gigglz.components.profileicon


@Composable
fun signup2 (modifier: Modifier = Modifier, navController: NavController) {

    var phoneno by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var Age by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }




    Column(modifier = Modifier.fillMaxSize()) {
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

            backimage()

            HeadingText("User\nInformation")

            profileicon()


            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 36.dp, top = 271.dp)
                    .requiredWidth(356.dp)
                    .requiredHeight(439.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(Color.Black.copy(alpha = 0.4f))
            )
            {

                Text(
                    text = "Basic  Details",
                    color = Color(0xfff4f4f4),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .padding(start = 22.dp, top = 19.dp)
                )


                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)

                        .padding(
                            start = 22.dp,
                            top= 64.dp
                        )
                        .requiredWidth(width = 312.dp)
                        .requiredHeight(height = 62.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White)
                )
                {
                    TextField(
                        value = phoneno,
                        onValueChange = { phoneno = it },
                        label = { Text("Choose Work Type*") },
                        singleLine = true,

                        modifier = Modifier.fillMaxSize()

                    )


                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff006ce1)),
                        modifier = modifier
                            .align(Alignment.CenterEnd)
                            .requiredWidth(width = 79.dp)
                            .requiredHeight(height = 47.dp)
                            .padding(end = 10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 79.dp)
                                .requiredHeight(height = 47.dp)
                        ) {
                            Text(
                                text = "Category",
                                color = Color(0xfffffcf1),
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentHeight(align = Alignment.CenterVertically)
                            )
                        }
                    }


                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .padding(
                            start = 22.dp,
                            top = 143.dp
                        )
                        .requiredWidth(width = 312.dp)
                        .requiredHeight(height = 62.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White)
                ) {


                    TextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Full Name*") },
                        singleLine = true,

                        modifier = Modifier.fillMaxSize()

                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp, vertical = 258.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp) // Spacing between the two fields
                ) {
                    // Age Box
                    Box(
                        modifier = Modifier
                            .requiredWidth(147.dp)
                            .requiredHeight(62.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color.White)
                    ) {
                        TextField(
                            value = Age,
                            onValueChange = { Age = it },
                            label = { Text("Age*") },
                            singleLine = true,
                            modifier = Modifier.fillMaxSize()
                        )

                        Image(
                            painter = painterResource(id = R.drawable.personicon),
                            contentDescription = "Vector",
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp) // Adjust padding to position the icon
                                .size(width = 16.dp, height = 20.dp)
                        )
                    }

                    // Gender Box
                    Box(
                        modifier = Modifier
                            .requiredWidth(147.dp)
                            .requiredHeight(62.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color.White)
                    ) {
                        TextField(
                            value = gender,
                            onValueChange = { gender = it },
                            label = { Text("Gender*") },
                            singleLine = true,
                            modifier = Modifier.fillMaxSize()
                        )

                        Image(
                            painter = painterResource(id = R.drawable.gendericon),
                            contentDescription = "Vector",
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .padding(end = 12.dp) // Adjust padding to position the icon
                                .size(width = 16.dp, height = 20.dp)
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 22.dp,
                            y = 307.dp
                        )
                        .requiredWidth(width = 312.dp)
                        .requiredHeight(height = 62.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White)
                ) {
                    TextField(
                        value = location,
                        onValueChange = { location = it },
                        label = { Text("Location*") },
                        singleLine = true,

                        modifier = Modifier.fillMaxSize()

                    )

                    Box(
                        modifier = modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 47.dp)
                            .offset(x = 243.dp, y = 8.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                            .background(color = Color(0xffe18b00))

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.locationicon),
                            contentDescription = "icon",
                            modifier = Modifier
                                .requiredWidth(width = 54.dp)
                                .requiredHeight(height = 34.dp)

                        )

                    }


                }


            }






            applogo()
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
                        navController.navigate("signup3")
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





@Preview(widthDp = 428, heightDp = 936)
@Composable
private fun signup2Preview() {
    val navController = rememberNavController()


    signup2( modifier = Modifier,
        navController = navController)
}


