package com.pixellog.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MainAppScreen() {
    val navController = rememberNavController()
    
    Scaffold(
        topBar = { TopBar() }
    ) { padding ->
        NavHost(
            navController = navController, 
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {
            composable("home") { HomeScreen(navController) }
            composable("search") { SearchScreen(navController) }
            composable("profile") { ProfileScreen(navController) }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text("PixelLog", color = com.pixellog.app.ui.theme.Indigo500) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = com.pixellog.app.ui.theme.Neutral950
        )
    )
}
