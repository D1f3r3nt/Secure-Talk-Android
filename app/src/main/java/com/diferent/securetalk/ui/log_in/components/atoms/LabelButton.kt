package com.diferent.securetalk.ui.log_in.components.atoms

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.diferent.securetalk.R

@Composable
fun LabelButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = colorResource(R.color.dark_blue),
            fontWeight = FontWeight.Bold,
            modifier = modifier.clickable(onClick = onClick)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LabelButton_Preview() {
    LabelButton(
        label = "Hola",
        onClick = {},
    )
}