package com.example.gigglz.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun BodyText(
    text:String = "",
    fontSize:TextUnit = 20.sp,
    lineHeight:TextUnit = 24.sp,
    letterSpacing:TextUnit = (0.5).sp,
    fontWeight: FontWeight = FontWeight(400),
    modifier: Modifier = Modifier,
    fontColor: Color = Color.Black
){
    Text(
        modifier = modifier,
        text = text,
        fontSize = fontSize,
        lineHeight = lineHeight,
        letterSpacing = letterSpacing,
        fontWeight = fontWeight,
        color = fontColor
    )
}