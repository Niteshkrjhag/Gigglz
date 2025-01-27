package com.example.gigglz.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.components.HomeScreenItem
import com.example.gigglz.components.SortingItemTag
import com.example.gigglz.components.TopAppBarr

@Preview(showSystemUi = true)
@Composable
fun HomeScreen(){
    val navController = rememberNavController()
TopAppBarr(
    navController = navController,
    content = {content()}
)
}

@Preview(showBackground = true)
@Composable
private fun content() {
    Column(
        modifier = Modifier.fillMaxHeight()
            .padding(horizontal = 15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 20.dp, bottom = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SortingItemTag(
                text = "Sort",
                iconImg = R.drawable.sort_descending,
                contentDescription = "Sort"
            )
            SortingItemTag(
                text = "Filter",
                iconImg = R.drawable.filter_search,
                contentDescription = "Filter"
            )
            SortingItemTag(
                text = "Location",
                iconImg = R.drawable.location_on,
                contentDescription = "Location"
            )
        }
        Column(
            modifier = Modifier.fillMaxHeight()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            repeat(5){
                HomeScreenItem()
            }
        }
    }
}