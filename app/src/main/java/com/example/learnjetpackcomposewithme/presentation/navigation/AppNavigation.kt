package com.example.learnjetpackcomposewithme.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnjetpackcomposewithme.presentation.home.HomeScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomScreens.Home) {
        composable<BottomScreens.Home> {
            HomeScreen()
        }
        composable<BottomScreens.Scheme> {
            HomeScreen()
        }
        composable<BottomScreens.Service> {
            HomeScreen()
        }
    }

}