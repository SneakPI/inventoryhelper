package com.sneakpi.inventurhelper.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sneakpi.inventurhelper.ui.navigation.AppRoute

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Main Screen")

            Button(
                onClick = { navController.navigate(AppRoute.Scanner.route) },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Scanner")
            }

            Button(
                onClick = { navController.navigate(AppRoute.Settings.route) },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Settings")
            }

            Button(
                onClick = { navController.navigate(AppRoute.Admin.route) },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Admin")
            }
        }
    }
}
