package com.example.composeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composeapp.MainViewModel
import com.example.composeapp.screens.MainScreen
import com.example.composeapp.screens.SplashScreen
import com.example.composeapp.utils.Constants


sealed class Screens(val router: String) {
    object Splash : Screens(router = Constants.Screens.SPLASH_SCREEN)
    object Main : Screens(router = Constants.Screens.MAIN_SCREEN)
    object Details : Screens(router = Constants.Screens.DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.router
    ) {

        composable(route = Screens.Splash.router) {
            SplashScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.Main.router) {
            MainScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.Details.router) {

        }
    }
}