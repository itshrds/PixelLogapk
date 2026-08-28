package com.pixellog.app.ui.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SearchScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("البحث عن الألعاب", color = Color.White)
    }
}
