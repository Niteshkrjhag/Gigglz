package com.example.gigglz.components

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.R
import com.example.gigglz.Screens.HomeScreen
import java.text.DecimalFormat
import java.util.Locale


@Composable
fun ResponsiveImage(
    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    Image(
        painter = painterResource(R.drawable.gigglzlogo),
        contentDescription = "App Logo",
        modifier = modifier
            .size(width = screenWidth * 0.4f, height = screenHeight * 0.08f) // 40% of width, 8% of height
            .offset(y = 5.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun TopAppBarr(
    navController: NavHostController= rememberNavController()
) {
    var isDrawerOpen by remember { mutableStateOf(false) }
    Box(Modifier.fillMaxSize()) {
        Scaffold(
            modifier =
            Modifier,
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
                        .padding(
                            top = max(
                                0.dp,
                                WindowInsets.statusBars.asPaddingValues()
                                    .calculateTopPadding() - 12.dp
                            ) // Reduce space by 8.dp
                            // max(0.dp, value) ensures that the value never goes negative (prevents layout issues).
                            , start = 8.dp, end = 8.dp
                        )
                ) {
                    IconButton(
                        onClick = { isDrawerOpen = !isDrawerOpen },
                        modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.Bottom)
                            .offset(y = 6.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.outline_menu_24_svg),
                            contentDescription = "Menu",
                            tint = Color.White,
                            modifier = Modifier
                                .size(32.dp)

                        )
                    }

                    ResponsiveImage(
                        modifier = Modifier.weight(1f)
                    )
                    Icon(
                        painter = painterResource(R.drawable.outline_notifications_24_svg),
                        contentDescription = "Notification",
                        modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.Bottom)
                            .padding(bottom = 6.dp)
                            .size(24.dp),
                        tint = Color.White
                    )
                }
            },
            bottomBar = {
                BottomNavigationBar(navController)
            }
        ) { innerPadding ->
            Box(
                modifier = Modifier.padding(innerPadding)
            ) {
                NavigationGraph(navController = navController) // Place navigation inside content area

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
                AnimatedVisibility(
                    visible = isDrawerOpen,
                    enter = slideInHorizontally { -it },
                    exit = slideOutHorizontally { -it }
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(if(LocalConfiguration.current.screenWidthDp.dp <= 360.dp) 250.dp else 300.dp)
                            .background(Color.White, shape = RoundedCornerShape(0.dp))
                            // .zIndex(1f) // Make sure drawer is on top
                            .clickable(
                                indication = null, // Disable ripple effect
                                interactionSource = remember { MutableInteractionSource() } // Prevent interaction state tracking
                            ) {
                                // Handle click
                            }
                    ) {
                        ProfileCard()
                    }
                }
            }
        }
@Composable
fun HomeScreenItem() {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    Log.i("Scr12","Screen size is ${screenWidth}")
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    val isCompact = screenWidth <= 360.dp
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(if (isCompact) 140.dp else 166.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(12.dp),
                ambientColor = Color.LightGray,
                spotColor = Color.DarkGray
            )

            .border(
                width = 0.33552.dp,
               color = Color(0xFFE9EBED), // ✅ Adds a light border for better distinction
                shape = RoundedCornerShape(12.dp),
            )
            .clip(RoundedCornerShape(12.dp)) // Clip corners to match shadow shape
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)) // Background color of the Box
    ) {

        Favorite(
            modifier = Modifier
                .offset(x = 15.dp, y = 15.dp)
                .zIndex(1f) // Ensures this is above other components
        )

        // Card containing the image and content
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp)) // Rounds the corners of the Card
                .border(
                    width = 0.5.dp,
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
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 9.dp, top = 10.dp, bottom = 10.dp)
                        .width(if (isCompact) 100.dp else 132.dp)
                        .height(if (isCompact) 120.dp else 146.dp)
                        .clip(RoundedCornerShape(16.dp))
                )

                // Column for content (text and icons)
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            start = 4.dp,
                            top = 12.dp,
                            bottom = 1.dp
                        )
                ) {
                    // Title and timestamp
                    Row {
                        BodyText(
                            text = "Restaurant | Gig",
                            fontSize = if (isCompact) 10.sp else 12.sp,
                            fontColor = Color(0xFF858C95),
                            fontWeight = FontWeight(300),
                            lineHeight = 12.sp
                        )
                        Spacer(Modifier.weight(1f))
                        BodyText(
                            text = "3d ago",
                            fontSize = if (isCompact) 8.sp else 10.sp,
                            fontColor = Color.Black,
                            fontWeight = FontWeight(300),
                            lineHeight = 10.sp,
                            modifier = Modifier
                                .padding(end = 10.dp)
                        )
                    }

                    // Title text
                    BodyText(
                        modifier = Modifier.padding(top = 2.dp),
                        text = "BLUE HOTEL",
                        fontSize = if (isCompact) 16.sp else 20.sp,
                        fontWeight = FontWeight(600),
                        lineHeight = 8.sp,
                        fontColor = Color.Black
                    )

                    // Location row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.vector),
                            contentDescription = "Location Icon",
                            modifier = Modifier.size(if (isCompact) 14.dp else 16.dp)
                        )
                        BodyText(
                            text = "Mandi Bazar Tirwa ganj",
                            fontSize = if (isCompact) 14.sp else 16.sp,
                            fontColor = Color.Gray,
                            fontWeight = FontWeight(300),
                            lineHeight = 6.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
//                    Spacer(Modifier.height(if (isCompact) 8.dp else 12.dp))
                    Spacer(Modifier.weight(0.75f))
                    // Date row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.calendar2),
                            contentDescription = "Calendar Icon",
                            modifier = Modifier.size(if (isCompact) 14.dp else 16.dp)
                        )
                        BodyText(
                            text = "09 - 16 Dec 2025",
                            fontSize = if (isCompact) 10.sp else 12.sp,
                            fontWeight = FontWeight(400),
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(start = 4.dp),
                            fontColor = Color(0xFF292F32)
                        )
                    }
                    Spacer(Modifier.weight(0.5f))
                    // Time row
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                          //  .offset(y = if (LocalConfiguration.current.screenWidthDp <= 360) 4.dp else 8.dp)
                    ){
                        Icon(
                            painter = painterResource(R.drawable.clock),
                            contentDescription = "Clock Icon",
                            modifier = Modifier.size(if (LocalConfiguration.current.screenWidthDp <= 360) 12.dp else 16.dp)
                        )
                        BodyText(
                            text = "9:30 AM - 4:30 PM",
                            fontSize = if (LocalConfiguration.current.screenWidthDp <= 360) 10.sp else 12.sp,
                            fontWeight = FontWeight(400),
                            lineHeight = if (LocalConfiguration.current.screenWidthDp <= 360) 10.sp else 12.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                    // Price row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Start) // Center horizontally,
                        ,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val formattedDefault = removeCommaFromCurrency(formatCurrency(2000))
                        ItemTag(
//                            modifier = Modifier.weight(0.5f),
                            text = "Service"
                        )
                        Spacer(Modifier.width(if (LocalConfiguration.current.screenWidthDp <= 360) 3.dp else 5.dp))
                        ItemTag(
//                            modifier = Modifier.weight(0.5f),
                            text = "Waiter")
                        Spacer(Modifier.width(if (LocalConfiguration.current.screenWidthDp <= 360) 3.dp else 5.dp))
                        BodyText(
                            modifier = Modifier,
                            text = "+2",
                            fontSize = if (LocalConfiguration.current.screenWidthDp <= 360) 8.sp else 10.sp,
                            lineHeight = if (LocalConfiguration.current.screenWidthDp <= 360) 10.sp else 12.sp,
                            fontWeight = FontWeight(500),
                            fontColor = colorResource(R.color.ItemTagBorder)
                        )
                        Spacer(Modifier.weight(1f))
                        Column(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(end = if (LocalConfiguration.current.screenWidthDp <= 360) 6.dp else 10.dp)
                                .offset(y = if (LocalConfiguration.current.screenWidthDp <= 360) -3.dp else -5.dp)
                        ) {
                            BodyText(
                                text = formattedDefault,
                                fontSize = if (LocalConfiguration.current.screenWidthDp <= 360) 16.sp else 20.sp,
                                fontWeight = FontWeight(600),
                                lineHeight = if (LocalConfiguration.current.screenWidthDp <= 360) 4.sp else 5.sp,
                                modifier = Modifier,
                                fontColor = colorResource(R.color.GreenC),
                                letterSpacing = if (LocalConfiguration.current.screenWidthDp <= 360) 0.2.sp else 0.4.sp
                            )
                            BodyText(
                                text = "200/day",
                                fontSize = if (LocalConfiguration.current.screenWidthDp <= 360) 10.sp else 12.sp,
                                fontWeight = FontWeight(600),
                                lineHeight = if (LocalConfiguration.current.screenWidthDp <= 360) (0.8).sp else (1).sp,
                                modifier = Modifier
                                    .padding(start = if (LocalConfiguration.current.screenWidthDp <= 360) 4.dp else 6.dp)
                                    .align(Alignment.Start),
                                fontColor = colorResource(R.color.GreenC)
                            )
                        }
                    }
                    Spacer(Modifier.weight(0.20f))
                }
            }
        }
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("calender") {
            CalendarScreen()
        }
        composable("search") { SearchScreen() }
        composable("amount") { AmountScreen() }
        composable("home"){
            HomeScreen()
        }
    }
}

@Composable
fun AmountScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Amount Screen"
        )
    }
}

@Composable
fun SearchScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Search Screen"
        )
    }
}

@Composable
fun CalendarScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calendar Screen"
        )
    }
}

fun formatCurrency(amount: Int, locale: Locale = Locale.getDefault()): String {
    val currencyInstance = DecimalFormat.getCurrencyInstance(locale) as DecimalFormat
    val symbols = currencyInstance.decimalFormatSymbols.apply {
        currencySymbol = currencySymbol + "" // Add a space after the symbol
        groupingSeparator = '\u0000' // Remove grouping separator
    }
    currencyInstance.decimalFormatSymbols = symbols
    currencyInstance.maximumFractionDigits = 0 // Remove decimals
    return currencyInstance.format(amount)
}
fun removeCommaFromCurrency(currencyString: String): String {
    return currencyString.replace(",", "").trim()
}

@Composable
fun ItemTag(
    text: String = "Service",
    modifier: Modifier = Modifier
) {
    val screenWidthDp = LocalConfiguration.current.screenWidthDp

    val tagWidth = when {
        screenWidthDp <= 360 -> 48.dp
        screenWidthDp < 430 -> 58.dp
        else -> 68.dp
    }

    val tagHeight = when {
        screenWidthDp <= 360 -> 18.dp
        screenWidthDp < 430 -> 20.dp
        else -> 24.dp
    }

    val fontSize = when {
        screenWidthDp <= 360 -> 10.sp
        screenWidthDp < 430 -> 12.sp
        else -> 14.sp
    }

    val paddingSize = when {
        screenWidthDp <= 360 -> 2.dp
        screenWidthDp < 430 -> 4.dp
        else -> 6.dp
    }

    val cornerRadius =10.dp

    Box(
        modifier = modifier
            .size(
                width = tagWidth,
                height = tagHeight
            )
            .border(
                width = 0.5.dp,
                shape = RoundedCornerShape(cornerRadius),
                color = colorResource(R.color.ItemTagBorder)
            )
            .clip(RoundedCornerShape(cornerRadius))
            .background(color = colorResource(R.color.ItemBox))
    ) {
        BodyText(
            modifier = Modifier.align(Alignment.Center),
            text = text,
            fontSize = fontSize,
            lineHeight = fontSize,
            fontWeight = FontWeight(400),
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
            .size(25.dp) // Size of the Box
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
                .padding(3.dp)
                .size(30.dp) // Icon size
                .align(Alignment.Center), // Center alignment
            tint = Color.DarkGray // Set icon color to black for contrast
        )
    }
}


@Composable
fun SortingItemTag(
    text:String = "Sort",
    modifier: Modifier = Modifier,
    iconImg:Int = R.drawable.locationicon,
    contentDescription:String = ""
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val fontSizeSp = (screenWidth.value * 0.03).sp // Convert to sp
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(screenWidth * 0.01f) // Responsive spacing
    ){
        Icon(
            painter = painterResource(iconImg),
            contentDescription = contentDescription,
            modifier = Modifier
                .size(screenWidth * 0.05f), // Icon size responsive
            tint = colorResource(R.color.SortingItem)
        )
        Box(
            modifier = Modifier
                .size(width = screenWidth * 0.21f, height = screenWidth * 0.06f) // Responsive Box size
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
                fontSize = fontSizeSp, // Responsive text size
                lineHeight = fontSizeSp*1.2f,
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
        modifier = Modifier
            .padding(bottom = 5.dp)
        .fillMaxWidth()
        .fillMaxHeight(0.121f), // Responsive height (8% of screen height)
        containerColor = Color.White
    ) {

        val configuration = LocalConfiguration.current
        val screenWidth = configuration.screenWidthDp.dp
        val iconSize = screenWidth * 0.08f // Icon size = 8% of screen width

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                modifier = Modifier
                    .weight(1f), // Ensures equal spacing
                icon = { Icon(
                    painterResource(id = item.icon),
                    contentDescription = item.title,
                    modifier = Modifier.size(iconSize))},
           //      label = { Text(text = item.title) },
                selected = currentRoute == item.screen_route,
                colors = NavigationBarItemDefaults.colors( // Apply custom colors
                    selectedIconColor = Color.Black, // Set selected icon color
                    unselectedIconColor = Color.Gray, // Set unselected icon color
                    indicatorColor = Color.White // Set indicator color to white
                ),
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
    object Calender : BottomNavItem("Calender", R.drawable.outline_calendar_svg, "calender")
    object Search : BottomNavItem("Search", R.drawable.outline_search_svg, "search")
    object Amount : BottomNavItem("Amount", R.drawable.outline_currency_rupee_svg, "amount")
}