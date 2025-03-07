package com.example.gigglz.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Preview(showSystemUi = true)
//@Composable
//fun HomeNavigationDrawer(
//    isDrawerOpen:Boolean = false
//){
//// Drawer overlay
//    AnimatedVisibility(
//        visible = isDrawerOpen,
//        enter = slideInHorizontally { -it },
//        exit = slideOutHorizontally { -it }
//    ) {
//        Box(
//            modifier = Modifier
//                .width(250.dp)
//                .fillMaxHeight()
//                .background(Color.Gray, shape = RoundedCornerShape(0.dp))
//        ) {
//            Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
//                Text(
//                    text = "Home",
//                    fontSize = 20.sp,
//                    color = Color.White,
//                    modifier = Modifier.clickable {
//                        isDrawerOpen = false
//                    }
//                )
//                Spacer(modifier = Modifier.height(16.dp))
//                Text(
//                    text = "Profile",
//                    fontSize = 20.sp,
//                    color = Color.White,
//                    modifier = Modifier.clickable { isDrawerOpen = false }
//                )
//                Spacer(modifier = Modifier.height(16.dp))
//                Text(
//                    text = "Settings",
//                    fontSize = 20.sp,
//                    color = Color.White,
//                    modifier = Modifier.clickable { isDrawerOpen = false }
//                )
//            }
//        }
//    }
//
//    // Dimmed background when drawer is open
//    if (isDrawerOpen) {
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Black.copy(alpha = 0.3f))
//                .clickable { isDrawerOpen = false }
//        )
//    }
//}