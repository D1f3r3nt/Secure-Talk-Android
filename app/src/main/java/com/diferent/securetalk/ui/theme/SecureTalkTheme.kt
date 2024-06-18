package com.diferent.securetalk.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun SecureTalkTheme(
    content: @Composable () -> Unit,
) {
    
    MaterialTheme(
        typography = SecureTalkTypographic,
        content = content,
    )
}