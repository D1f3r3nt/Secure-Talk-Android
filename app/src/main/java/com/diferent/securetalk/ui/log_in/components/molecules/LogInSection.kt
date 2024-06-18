package com.diferent.securetalk.ui.log_in.components.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.diferent.securetalk.ui.components.CustomButton
import com.diferent.securetalk.ui.components.TextFieldLabel
import com.diferent.securetalk.ui.log_in.components.atoms.LabelButton

@Composable
fun LogInSection(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        TextFieldLabel(
            label = "Email",
            value = "",
            onValueChange = {}
        )

        TextFieldLabel(
            label = "Password",
            value = "",
            onValueChange = {}
        )

        CustomButton(
            label = "Log in",
            onClick = { /*TODO*/ }
        )

        LabelButton(label = "Forgot password?", onClick = { /*TODO*/ })
    }
}