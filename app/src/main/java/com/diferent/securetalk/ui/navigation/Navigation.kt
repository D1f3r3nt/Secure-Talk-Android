package com.diferent.securetalk.ui.navigation

sealed class Navigation(val route: String) {
    companion object {
        const val LOG_IN_ROUTE = "home"
    }

    object HOME: Navigation(LOG_IN_ROUTE)
}
