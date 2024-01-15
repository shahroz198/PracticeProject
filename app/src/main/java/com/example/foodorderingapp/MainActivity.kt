package com.example.foodorderingapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodorderingapp.AppScreens.DashBoard
import com.example.foodorderingapp.AppScreens.GridLazy
import com.example.foodorderingapp.AppScreens.NavScreen
import com.example.foodorderingapp.ClassRepo.DataRepo

import com.example.foodorderingapp.ui.theme.CustomRed
import com.example.foodorderingapp.ui.theme.FoodOrderingAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodOrderingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    val systemUiController = rememberSystemUiController()
                    val darkTheme = isSystemInDarkTheme()
                    SideEffect {
                        systemUiController.setStatusBarColor(
                            if (darkTheme)
                                CustomRed else CustomRed
                        )
                    }
//                    DashBoard()
                    val dataRepo=DataRepo()
                    val getAllData=dataRepo.listofData()
                    LazyColumn(contentPadding = PaddingValues(12.dp) ){
                        items(items = getAllData){burgerDetailClass->
                            GridLazy(burgerDetailClass = burgerDetailClass)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodOrderingAppTheme {
        Greeting("Android")
    }
}