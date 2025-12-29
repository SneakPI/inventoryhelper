package com.sneakpi.inventurhelper.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sneakpi.inventurhelper.ui.screens.admin.AdminScreen
import com.sneakpi.inventurhelper.ui.screens.login.LoginScreen
import com.sneakpi.inventurhelper.ui.screens.main.MainScreen
import com.sneakpi.inventurhelper.ui.screens.scanner.ScannerScreen
import com.sneakpi.inventurhelper.ui.screens.settings.SettingsScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AppRoute.Login.route
    ) {
        composable(route = AppRoute.Login.route) {
            LoginScreen(navController)
        }
        composable(route = AppRoute.Main.route) {
            MainScreen(navController)
        }
        composable(route = AppRoute.Scanner.route) {
            ScannerScreen(navController)
        }
        composable(route = AppRoute.Settings.route) {
            SettingsScreen(navController)
        }
        composable(route = AppRoute.Admin.route) {
            AdminScreen(navController)
        }
    }
}
