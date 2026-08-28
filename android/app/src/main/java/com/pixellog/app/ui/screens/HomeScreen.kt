package com.pixellog.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pixellog.app.ui.components.GameCard
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "الألعاب الشائعة", 
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            items(5) {
                GameCard(
                    name = "Elden Ring",
                    imageUrl = "https://images.unsplash.com/photo-1605901309584-818e25960b8f?q=80&w=600&auto=format&fit=crop",
                    rating = "4.8"
                )
            }
        }
    }
}
