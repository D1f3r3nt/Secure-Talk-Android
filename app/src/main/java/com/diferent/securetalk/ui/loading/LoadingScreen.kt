package com.diferent.securetalk.ui.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diferent.securetalk.R
import com.diferent.securetalk.ui.components.GifImage

@Composable
fun LoadingScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white)),
        contentAlignment = Alignment.Center,
    ) {
        GifImage(
            resource = R.drawable.loader,
            modifier = Modifier
                .size(150.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LoadingScreen_Preview() {
    LoadingScreen()
}