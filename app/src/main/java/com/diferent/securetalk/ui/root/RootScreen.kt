package com.diferent.securetalk.ui.root

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.diferent.securetalk.model.enums.Authorized
import com.diferent.securetalk.model.enums.Loading
import com.diferent.securetalk.model.enums.NonAuthorized
import com.diferent.securetalk.model.enums.RootState
import com.diferent.securetalk.ui.loading.LoadingScreen
import com.diferent.securetalk.ui.modules.AuthModule

@Composable
fun RootScreen(viewModel: RootViewModel = hiltViewModel()) {
    val state: RootState by viewModel.rootState.collectAsState()
    
    when (state) {
        is Loading -> LoadingScreen()
        is Authorized -> AuthModule()
        is NonAuthorized -> AuthModule()
    }
}

@Preview(showSystemUi = true)
@Composable
private fun RootScreen_Preview() {
    RootScreen()
}