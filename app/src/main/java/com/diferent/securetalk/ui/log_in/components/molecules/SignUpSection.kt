package com.diferent.securetalk.ui.log_in.components.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.diferent.securetalk.ui.components.CustomButton

@Composable
fun SignUpSection(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        CustomButton(
            label = "Sing up",
            onClick = { /*TODO*/ },
            isPrimary = false
        )

        CustomButton(
            label = "Sing up with Google",
            onClick = { /*TODO*/ }
        )
    }
}