package com.diferent.securetalk.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.diferent.securetalk.R

val PublicSansFontFamily = FontFamily(
    Font(R.font.public_sans_regular, FontWeight.Normal),
    Font(R.font.public_sans_bold, FontWeight.Bold)
)

val SecureTalkTypographic = Typography(
    bodyLarge = TextStyle(
        fontFamily = PublicSansFontFamily,
        fontWeight = FontWeight.Normal
    )
)