package com.test.dogapiapp.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.test.dogapiapp.ui.view.MainScreens.HOME_SCREEN
import com.test.dogapiapp.ui.view.MainScreens.LIKED_SCREEN
import com.test.dogapiapp.ui.view.home.Home
import com.test.dogapiapp.ui.view.liked.Liked

object MainScreens{
    const val HOME_SCREEN = "Home_screen"
    const val BREED_SCREEN = "Breed_screen"
    const val LIKED_SCREEN = "Liked_screen"
}
@Composable
fun MainGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_SCREEN,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary)
    ) {
        composable(HOME_SCREEN) {
            Home()
        }
        composable(LIKED_SCREEN){
            Liked()
        }
    }
}