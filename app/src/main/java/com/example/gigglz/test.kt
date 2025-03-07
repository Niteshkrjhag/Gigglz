package com.example.gigglz

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OverlayNavigationDrawer() {
    var isDrawerOpen by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My App") },
                navigationIcon = {
                    IconButton(onClick = { isDrawerOpen = !isDrawerOpen }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // Main content
            Box(
                modifier = Modifier.fillMaxSize().background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text("Main Content is hello")
            }

            // Drawer overlay
            AnimatedVisibility(
                visible = isDrawerOpen,
                enter = slideInHorizontally { -it },
                exit = slideOutHorizontally { -it }
            ) {
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .fillMaxHeight()
                        .background(Color.Gray, shape = RoundedCornerShape(0.dp))
                ) {
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                        Text(
                            text = "Home",
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.clickable { isDrawerOpen = false }
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Profile",
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.clickable { isDrawerOpen = false }
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Settings",
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.clickable { isDrawerOpen = false }
                        )
                    }
                }
            }

            // Dimmed background when drawer is open
            if (isDrawerOpen) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.2f))
                        .clickable { isDrawerOpen = false }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOverlayDrawer() {
    OverlayNavigationDrawer()
}
