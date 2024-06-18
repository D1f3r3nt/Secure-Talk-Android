package com.diferent.securetalk.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diferent.securetalk.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldLabel(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            color = colorResource(R.color.dark_blue)
        )
        
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = colorResource(R.color.white),
                cursorColor = colorResource(R.color.dark_blue),
                unfocusedBorderColor = colorResource(R.color.light_blue),
                focusedBorderColor = colorResource(R.color.light_blue),
                focusedTrailingIconColor = colorResource(R.color.light_blue),
                unfocusedTrailingIconColor = colorResource(R.color.light_blue),
                focusedLeadingIconColor = colorResource(R.color.light_blue),
                unfocusedLeadingIconColor = colorResource(R.color.light_blue),
            ),
            textStyle = TextStyle(
                color = colorResource(R.color.dark_blue),
            ),
            maxLines = 1,
            singleLine = true,
            visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TextFieldLabel_Preview() {
    TextFieldLabel(
        label = "Email",
        value = "",
        onValueChange = {}
    )
}