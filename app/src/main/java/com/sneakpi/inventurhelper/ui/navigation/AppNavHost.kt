package com.sneakpi.inventurhelper.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Login.route
    ) {
        composable(route = AppRoute.Login.route) {
            // Login screen placeholder
            // TODO: Implement Login screen
        }
        composable(route = AppRoute.Main.route) {
            // Main screen placeholder
            // TODO: Implement Main screen
        }
        composable(route = AppRoute.Scanner.route) {
            // Scanner screen placeholder
            // TODO: Implement Scanner screen
        }
        composable(route = AppRoute.Settings.route) {
            // Settings screen placeholder
            // TODO: Implement Settings screen
        }
        composable(route = AppRoute.Admin.route) {
            // Admin screen placeholder
            // TODO: Implement Admin screen
        }
    }
}
