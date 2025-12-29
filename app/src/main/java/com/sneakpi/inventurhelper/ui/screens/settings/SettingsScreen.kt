package com.sneakpi.inventurhelper.ui.screens.settings

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SettingsScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Text("Settings Screen")
    }
}
