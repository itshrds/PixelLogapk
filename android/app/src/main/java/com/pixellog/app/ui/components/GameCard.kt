package com.pixellog.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pixellog.app.ui.theme.Neutral900

@Composable
fun GameCard(name: String, imageUrl: String, rating: String) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .height(240.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Neutral900)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = imageUrl,
                contentDescription = name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
                    .background(Color.Black.copy(alpha = 0.6f))
                    .padding(8.dp)
            ) {
                Column {
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = "★ $rating", color = Color(0xFFEAB308), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
