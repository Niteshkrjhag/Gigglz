package com.example.gigglz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import java.text.DecimalFormat
import java.util.Locale




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarr(
    navController: NavHostController= rememberNavController(),
    content: @Composable () -> Unit ={}
) {

    Scaffold(
        modifier =Modifier
            .navigationBarsPadding(),
        containerColor = Color.White,
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xff0a0a53), Color(0xff050533)),
                            start = Offset(0f, 0f),
                            end = Offset(214f, 936f)
                        )
                    )
            ) {
                Spacer(Modifier.width(1.dp))
                Icon(
                    painter = painterResource(R.drawable.menu),
                    contentDescription = "Menu",
                    tint = Color.White,
                    modifier = Modifier
                        .size(36.dp) // Increased icon size
                        .align(Alignment.Bottom)
                        .weight(0.25f)
                )

                Image(
                    painter = painterResource(R.drawable.gigglzlogo),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .offset(y = 5.dp)
                        .size(width = 143.dp, height = 73.dp)
                        .weight(1f)
                )
                Icon(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .padding(bottom = 6.dp)
                        .weight(0.15f)
                        .size(24.dp),
                    tint = Color.White
                )
                Spacer(Modifier.width(15.dp))
                Icon(
                    painter = painterResource(R.drawable.notification),
                    contentDescription = "Notification",
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .padding(bottom = 6.dp)
                        .weight(0.15f)
                        .size(24.dp),
                    tint = Color.White
                )
                Spacer(Modifier.width(5.dp))
            }
        },
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
               content()
        }
//        NavigationGraph(navController = navController)  // uncomment it when you need navigation as now uncommenting with will not show preview
    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenItem() {

    val configuration = LocalConfiguration.current
    val fontSize = with(configuration) {
        when {
            fontScale > 1.2f -> 14.sp // Reduce font size for larger font scales
            screenWidthDp < 360 -> 12.sp // Reduce font size for smaller screens
            else -> 16.sp // Default font size
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
//            .padding(8.dp) // Add padding so the shadow doesn't get clipped
            .shadow(
                elevation = 10.dp, // Elevation for shadow
                shape = RoundedCornerShape(12.dp), // Rounded corners for shadow
                ambientColor = Color.Black.copy(alpha = 0.1f), // Subtle black tint
                spotColor = Color.Black.copy(alpha = 0.2f) // Slightly darker edge shadow
            )
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(12.dp),
                color = Color.White
            )
            .clip(RoundedCornerShape(12.dp)) // Clip corners to match shadow shape
            .background(Color.White) // Background color of the Box
    ) {
        // Favorite button with higher zIndex to appear above the Card
        Favorite(
            modifier = Modifier
                .offset(x = 5.dp, y = 5.dp)
                .zIndex(1f) // Ensures this is above other components
        )

        // Card containing the image and content
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp)) // Rounds the corners of the Card
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(12.dp),
                    color = Color.White
                )
        ) {
            Row(
                modifier = Modifier
                    .background(Color.White),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Image inside the Card
                Image(
                    painter = painterResource(R.drawable.intersect),
                    contentDescription = "",
                    modifier = Modifier.size(142.dp)
                )

                // Column for content (text and icons)
                Column(
                    modifier = Modifier
                        .heightIn(max = 142.dp) // Constrain height to image height
                        .padding(
                            start = 4.dp,
                            top = 4.dp,
                            bottom = 1.dp
                        )
                ) {
                    // Title and timestamp
                    Row {
                        BodyText(
                            text = "Restaurant | Gig",
                            fontSize = 10.sp,
                            fontColor = Color.Gray,
                            fontWeight = FontWeight(500),
                            lineHeight = 12.sp
                        )
                        Spacer(Modifier.weight(1f))
                        BodyText(
                            text = "3d ago",
                            fontSize = 10.sp,
                            fontColor = Color.Gray,
                            fontWeight = FontWeight(300),
                            lineHeight = 10.sp
                        )
                    }

                    // Title text
                    BodyText(
                        modifier = Modifier.padding(top = 2.dp),
                        text = "BLUE HOTEL",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        lineHeight = 20.sp
                    )

                    // Location row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.location_on),
                            contentDescription = "Location Icon",
                            modifier = Modifier.size(13.dp)
                        )
                        BodyText(
                            text = "Mandi Bazar Tirwa ganj, Kannauj",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(300),
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                    // Date row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 2.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.calendar2),
                            contentDescription = "Calendar Icon",
                            modifier = Modifier.size(13.dp)
                        )
                        BodyText(
                            text = "Mon, Dec 09",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(500),
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                    // Time row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 6.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.location_on),
                            contentDescription = "Clock Icon",
                            modifier = Modifier.size(13.dp)
                        )
                        BodyText(
                            text = "9:30 AM - 4:30 PM",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(500),
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                    // Price row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .wrapContentSize() // Wrap content
                            .align(Alignment.CenterHorizontally) // Center horizontally
                    ) {
                        val formattedDefault = formatCurrency(1000)
                        ItemTag(
                            text = "Service"
                        )
                        Spacer(Modifier.width(5.dp))
                        ItemTag(text = "Waiter")
                        Spacer(Modifier.width(5.dp))
                        BodyText(
                            modifier = Modifier,
                            text = "+2",
                            fontSize = 10.sp,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight(500),
                            fontColor = colorResource(R.color.ItemTagBorder)
                        )
                        Spacer(Modifier.weight(1f))
                        Column(
                            modifier = Modifier.wrapContentSize()
                        ) {
                            BodyText(
                                text = "${formattedDefault}",
                                fontSize = fontSize,
                                fontWeight = FontWeight(600),
                                lineHeight = 18.sp,
                                modifier = Modifier,
                                fontColor = colorResource(R.color.GreenC)
                            )
                            BodyText(
                                text = "200/day",
                                fontSize = 10.sp,
                                fontWeight = FontWeight(600),
                                lineHeight = 12.sp,
                                modifier = Modifier
                                    .padding(start = 4.dp)
                                    .align(Alignment.End),
                                fontColor = colorResource(R.color.GreenC)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "calender") {
        composable("calender") { CalendarScreen() }
        composable("search") { SearchScreen() }
        composable("amount") { AmountScreen() }
    }
}

@Composable
fun AmountScreen() {
    TODO("Not yet implemented")
}

@Composable
fun SearchScreen() {
    TODO("Not yet implemented")
}

@Composable
fun CalendarScreen() {
    TODO("Not yet implemented")
}

fun formatCurrency(amount: Int, locale: Locale = Locale.getDefault()): String {
    val currencyInstance = DecimalFormat.getCurrencyInstance(locale) as DecimalFormat
    val symbols = currencyInstance.decimalFormatSymbols.apply {
        currencySymbol = currencySymbol + " " // Add a space after the symbol
    }
    currencyInstance.decimalFormatSymbols = symbols
    currencyInstance.maximumFractionDigits = 0 // Remove decimals
    return currencyInstance.format(amount)
}

@Preview(showBackground = true)
@Composable
fun ItemTag(
    text:String = "Service",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(width = 50.dp, height = 18.dp)
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(8.dp),
                color = colorResource(R.color.ItemTagBorder)
            )
            .clip(RoundedCornerShape(8.dp))
            .background(color = colorResource(R.color.ItemBox))

    ) {
        BodyText(
            modifier = Modifier.align(Alignment.Center),
            text = text,
            fontSize = 10.sp,
            lineHeight = 12.sp,
            fontWeight = FontWeight(500),
            fontColor = colorResource(R.color.ItemTagBorder)
        )
    }
}

@Composable
fun Favorite(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(23.dp) // Size of the Box
            .clip(RoundedCornerShape(16.dp)) // Rounded corners
            .background(color = colorResource(R.color.blurry_gray)) // Blurry gray background
            .drawBehind {
                val inset = 0.5.dp.toPx() / 2 // Adjust to account for border width
                drawRoundRect(
                    color = Color.Black,
                    topLeft = Offset(inset, inset), // Shift the border inside
                    size = size.copy(
                        width = size.width - inset * 2,
                        height = size.height - inset * 2
                    ),
                    cornerRadius = CornerRadius(12.dp.toPx() - inset), // Adjust corner radius
                    style = Stroke(width = 0.5.dp.toPx()) // Thin border width
                )
            }
    ) {
        Icon(
            imageVector = Icons.Default.FavoriteBorder,
            contentDescription = "Favorite",
            modifier = Modifier
                .size(15.dp) // Icon size
                .align(Alignment.Center), // Center alignment
            tint = Color.Black // Set icon color to black for contrast
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SortingItemTag(
    text:String = "Sort",
    modifier: Modifier = Modifier,
    iconImg:Int = R.drawable.locationicon,
    contentDescription:String = ""
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Icon(
            painter = painterResource(iconImg),
            contentDescription = contentDescription,
            modifier = Modifier
                .size(20.dp),
            tint = colorResource(R.color.SortingItem)
        )
        Box(
            modifier = Modifier
                .size(width = 80.dp, height = 22.dp)
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(8.dp),
                    color = colorResource(R.color.SortingItem)
                )
                .clip(RoundedCornerShape(8.dp))
                .background(color = Color.White)

        ) {
            BodyText(
                modifier = Modifier.align(Alignment.Center),
                text = text,
                fontSize = 12.sp,
                lineHeight = 15.sp,
                fontWeight = FontWeight(500),
                fontColor = colorResource(R.color.SortingItem)
            )
        }
    }
}


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.Calender,
        BottomNavItem.Search,
        BottomNavItem.Amount
    )
    NavigationBar(
        modifier = Modifier,
        containerColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            NavigationBarItem(
                modifier = Modifier.background(Color.White),
                icon = { Icon(
                    painterResource(id = item.icon),
                    contentDescription = item.title,
                    modifier = Modifier.size(36.dp))},
                // label = { Text(text = item.title) },
                selected = currentRoute == item.screen_route,
//                colors = NavigationBarItemDefaults.colors( // Apply custom colors
//                    selectedIconColor = Color.Black, // Set selected icon color
//                    unselectedIconColor = Color.Gray, // Set unselected icon color
//                    indicatorColor = Color.White // Set indicator color to white
//                ),
                onClick = {
                    navController.navigate(item.screen_route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        // Avoid multiple copies of the same destination on the back stack
                        // if we're navigating to the selected item
                        launchSingleTop = true
                        // Restore state if the destination was popped off the back stack
                        restoreState = true
                    }
                }
            )
        }
    }
}

sealed class BottomNavItem(
    var title: String,
    var icon: Int,
    var screen_route: String
) {
    object Calender : BottomNavItem("Calender", R.drawable.calendar2, "calender")
    object Search : BottomNavItem("Search", R.drawable.search, "search")
    object Amount : BottomNavItem("Amount", R.drawable.image_29, "amount")
}