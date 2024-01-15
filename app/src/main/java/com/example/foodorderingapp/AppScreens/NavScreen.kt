package com.example.foodorderingapp.AppScreens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@RequiresApi(Build.VERSION_CODES.M)
@Composable
fun NavScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "First"){
        composable("First"){
            Splash(navController)
        }
        composable("Second"){
            Signupscreen(navController)
        }
        composable("third"){
            SignIn(navController)
        }
    }
}