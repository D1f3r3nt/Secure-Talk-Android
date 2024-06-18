package com.diferent.securetalk.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diferent.securetalk.R

@Composable
fun CustomButton(
    label: String,
    onClick: () -> Unit,
    isPrimary: Boolean = true,
    modifier: Modifier = Modifier,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = colorResource(if (isPrimary) R.color.blue else R.color.white_grey)
        ),
        shape = RoundedCornerShape(12.dp),
        onClick = onClick
    ) {
        Text(
            text = label,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(if (isPrimary) R.color.white else R.color.dark_blue )
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CustomButton_Preview() {
    CustomButton(
        label = "Log in",
        onClick = {},
    )
}