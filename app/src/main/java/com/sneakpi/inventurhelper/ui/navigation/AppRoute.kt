package com.sneakpi.inventurhelper.ui.navigation

sealed interface AppRoute {
    val route: String

    data object Login : AppRoute { override val route = "login" }
    data object Main : AppRoute { override val route = "main" }
    data object Scanner : AppRoute { override val route = "scanner" }
    data object Settings : AppRoute { override val route = "settings" }
    data object Admin : AppRoute { override val route = "admin" }
}
