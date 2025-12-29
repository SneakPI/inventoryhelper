package com.sneakpi.inventurhelper

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.sneakpi.inventurhelper.ui.navigation.AppNavHost
import com.sneakpi.inventurhelper.ui.theme.InventurHelperTheme

@Composable
fun InventurHelperApp() {
    InventurHelperTheme {
        val navController = rememberNavController()
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AppNavHost(navController = navController)
        }
    }
}
