package com.example.gigglz.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.HomeScreenItem
import com.example.gigglz.components.SortingItemTag

@Preview(showSystemUi = true)
@Composable
fun HomeScreen(){
    val navController = rememberNavController()
    content()
}

@Preview(showBackground = true)
@Composable
private fun content() {
    val items = remember { List(30) { "Item $it" } } // Example items
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Color(0xFFF2F2F2))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(45.dp)
                .background(color = colorResource(R.color.sorting_Background))
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SortingItemTag(
                text = "Sort",
                iconImg = R.drawable.outline_sort_24_svg,
                contentDescription = "Sort"
            )
            SortingItemTag(
                text = "Filter",
                iconImg = R.drawable.outline_filter_alt_24_svg,
                contentDescription = "Filter"
            )
            SortingItemTag(
                text = "Location",
                iconImg = R.drawable.outline_location_on_24_svg,
                contentDescription = "Location"
            )
        }
//        Spacer(Modifier.height(12.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color(0xFFF2F2F2))
                .padding(horizontal = 10.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(items){
                index,item->
                AnimatedVisibility(
                    visible = true,
                    enter = scaleIn(
                        initialScale = 0.5f, // Start smaller
                        animationSpec = tween(durationMillis = 500)
                    ) + fadeIn(
                        initialAlpha = 0.3f,
                        animationSpec = tween(durationMillis = 500)
                    ),
                    exit = scaleOut(
                        targetScale = 0.5f, // End smaller
                        animationSpec = tween(durationMillis = 500)
                    ) + fadeOut(
                        animationSpec = tween(durationMillis = 500)
                    )
                )  {
                    HomeScreenItem()
            }
            }
        }
    }
}

@Composable
fun BottomShadowBox(
    modifier: Modifier = Modifier,
    shadowColor: Color = Color.LightGray,
    shadowRadius: Dp = 12.dp,
    cornerRadius: Dp = 12.dp,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .drawBehind {
                val shadowRadiusPx = shadowRadius.toPx()
                val cornerRadiusPx = cornerRadius.toPx()
                val transparentColor = Color.Transparent.toArgb()
                val shadowColorArgb = shadowColor.toArgb()

                drawIntoCanvas { canvas ->
                    val paint = android.graphics.Paint().apply {
                        style = android.graphics.Paint.Style.FILL
                        shader = android.graphics.LinearGradient(
                            0f,
                            size.height - shadowRadiusPx,
                            0f,
                            size.height + shadowRadiusPx,
                            intArrayOf(shadowColorArgb, transparentColor),
                            null,
                            android.graphics.Shader.TileMode.CLAMP
                        )
                    }

                    val left = 0f
                    val top = size.height - shadowRadiusPx
                    val right = size.width
                    val bottom = size.height + shadowRadiusPx

                    canvas.nativeCanvas.drawRoundRect(
                        left,
                        top,
                        right,
                        bottom,
                        cornerRadiusPx,
                        cornerRadiusPx,
                        paint
                    )
                }
            }
            .clip(RoundedCornerShape(cornerRadius))
            .background(Color.White)
    ) {
        content()
    }
}