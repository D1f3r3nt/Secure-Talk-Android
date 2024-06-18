package com.diferent.securetalk.ui.log_in

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diferent.securetalk.R
import com.diferent.securetalk.ui.components.TextAdvice
import com.diferent.securetalk.ui.log_in.components.molecules.LogInSection
import com.diferent.securetalk.ui.log_in.components.molecules.SignUpSection

@Composable
fun LogInScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.white))
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(vertical = 25.dp),
            contentScale = ContentScale.Crop,
        )

        LogInSection()

        Divider(
            color = colorResource(R.color.dark_blue)
        )

        SignUpSection()
        
        TextAdvice(text = "By continuing, you agree to our terms of service to learn how we collect, use and share your data")
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LogInScreen_Preview() {
    LogInScreen()
}