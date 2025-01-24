package com.example.gigglz

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth


import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.navigation.NavController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gigglz.Screens.kyc1
import com.example.gigglz.Screens.kycf
import com.example.gigglz.Screens.merchant


import com.example.gigglz.Screens.signup1
import com.example.gigglz.Screens.signup2
import com.example.gigglz.Screens.signup3
import com.example.gigglz.Screens.signup4

import com.example.gigglz.Screens.splashscreen
import com.example.gigglz.Screens.splashscreen1


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



          //  com.example.gigglz.Screens.merchant(modifier = Modifier)
 //  APP()
                    



                }
            }
        }






@Composable
fun APP() {
    var navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splashscreen1"
    ) {
        composable(route = "splashscreen1") {
            splashscreen(
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
        }
        composable(route = "signup1") {
            signup1(
                modifier = Modifier.fillMaxSize(),
                navController = navController
            )
        }
        composable(route = "signup2") {
            signup2(
                modifier = Modifier.fillMaxSize(),
                navController = navController

            )
        }
            composable(route = "signup3") {
                signup3(
                    modifier = Modifier.fillMaxSize(),
                    navController = navController
                )


            }

        composable(route = "signup4") {
            signup4(
                modifier = Modifier.fillMaxSize())



        }


    }

        }








