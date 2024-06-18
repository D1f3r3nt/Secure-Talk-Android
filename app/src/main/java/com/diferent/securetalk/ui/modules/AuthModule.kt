package com.diferent.securetalk.ui.modules

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diferent.securetalk.ui.log_in.LogInScreen
import com.diferent.securetalk.ui.navigation.Navigation
import com.diferent.securetalk.ui.navigation.NavigationController

@Composable
fun AuthModule() {
    val authNavController = rememberNavController()
    NavigationController.init(authNavController)
    
    NavHost(authNavController, startDestination =  Navigation.LOG_IN_ROUTE) {
        
        composable(Navigation.LOG_IN_ROUTE) {
            LogInScreen()
        }
    }
}