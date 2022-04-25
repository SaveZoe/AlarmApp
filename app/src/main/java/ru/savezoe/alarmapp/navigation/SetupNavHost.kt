package ru.savezoe.alarmapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.savezoe.alarmapp.screens.MainScreen

object MainDestination {
    const val MAIN_SCREEN = "main_screen"
}

@Composable
fun SetupNavHost() {
    NavHost(
        navController = rememberNavController(),
        startDestination = MainDestination.MAIN_SCREEN
    ) {
        composable(route = MainDestination.MAIN_SCREEN) { MainScreen() }
    }
}