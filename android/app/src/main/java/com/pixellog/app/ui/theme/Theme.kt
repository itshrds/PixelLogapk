package com.pixellog.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    background = Neutral950,
    surface = Neutral900,
    primary = Indigo500,
    onPrimary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun PixelLogTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
