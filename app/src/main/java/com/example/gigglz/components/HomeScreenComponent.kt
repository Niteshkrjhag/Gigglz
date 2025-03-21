package com.example.gigglz.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gigglz.R


@Composable
fun ProfileCard(
    modifier: Modifier = Modifier,
    name: String = "Sophia Rose",
    email: String = "sophiar123@gmail.com",
    navController: NavController
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(if (screenWidth <= 360.dp) 180.dp else 200.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF0D0456)),
            shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
        ) {
            Column(
                modifier = Modifier.padding(start = if (screenWidth <= 360.dp) 16.dp else 24.dp)
            ) {
                Spacer(Modifier.weight(if (screenWidth <= 360.dp)0.80f else 0.75f))
                Image(
                    painter = painterResource(R.drawable.unsplash_bqe0j0b26rq),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(if (screenWidth <= 360.dp) 50.dp else 60.dp)
                        .clip(RoundedCornerShape(80.dp))
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = name,
                    style = TextStyle(
                        fontSize = if (screenWidth <= 360.dp) 14.sp else 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF4F4F4)
                    )
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = email,
                    style = TextStyle(
                        fontSize = if (screenWidth <= 360.dp) 12.sp else 14.sp,
                        color = Color.White
                    )
                )
                Spacer(Modifier.weight(0.30f))
            }
        }

        Column(
            modifier = Modifier.padding(start = if (screenWidth <= 360.dp) 16.dp else 24.dp),
            verticalArrangement = Arrangement.spacedBy(if (screenHeight < 600.dp) 16.dp else 28.dp)
        ) {
            Spacer(Modifier.height(if (screenHeight <= 600.dp) 16.dp else 24.dp))
                IconAndText(
                    id = R.drawable.user,
                    onClick = {
                        navController.navigate("profile")
                        // Ensure that it doesn't keep stacking multiple ProfileScreens
                    }
                )
                IconAndText(
                    text = "Settings",
                    id = R.drawable.image_38
                )
                IconAndText(
                    text = "Training and Certification",
                    id = R.drawable.image_41
                )
                IconAndText(
                    text = "Blogs",
                    id = R.drawable.comments
                )
                IconAndText(
                    text ="FAQs",
                    id = R.drawable.image_37
                )
                IconAndText(
                    text = "KYC",
                    id = R.drawable.image_50
                )
                IconAndText(
                    text = "Support",
                    id = R.drawable.image_39
                )
            Spacer(Modifier.weight(0.25f))
            HorizontalDivider(modifier = Modifier.padding(end = 24.dp))
            IconAndText(
                text = "Logout",
                id = R.drawable.log_out,
                size = if (screenWidth <= 360.dp) 24.dp else 32.dp,
                textSize = if (screenWidth <= 360.dp) 16.sp else 20.sp,
                iconColor = Color(0xFFBE2D2D),
                textColor = Color(0xFFBE2D2D)
            )
            Spacer(Modifier.weight(0.75f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IconAndText(
    text: String = "Profile",
    @DrawableRes id: Int = R.drawable.profile,
    size: Dp = if (LocalConfiguration.current.screenWidthDp <= 360) 22.dp else 26.dp,
    textSize: TextUnit = if (LocalConfiguration.current.screenWidthDp <= 360) 14.sp else 18.sp,
    textColor: Color = Color(0xFF0F0F0F),
    iconColor: Color = colorResource(R.color.IconColor),
    onClick: () -> Unit = {} // 🔥 Function to handle clicks
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .clickable { onClick() },
        // 🔥 Added onClick,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            if (LocalConfiguration.current.screenWidthDp <= 360) 12.dp else 20.dp
        )
    ) {
        Icon(
            painter = painterResource(id),
            contentDescription = text,
            modifier = Modifier.size(size),
            tint = iconColor
        )
        Text(
            text = text,
            style = TextStyle(
                fontSize = textSize,
                fontWeight = if (LocalConfiguration.current.screenWidthDp <= 360)FontWeight(300) else FontWeight(500),
                color = textColor
            )
        )
    }
}
