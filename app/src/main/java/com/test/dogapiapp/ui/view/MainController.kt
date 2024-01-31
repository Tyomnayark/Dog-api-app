package com.test.dogapiapp.ui.view

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.test.dogapiapp.ui.view.bottombar.BottomNavigation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainController() {
    val navHostController = rememberNavController()

    Scaffold(
        topBar = {
        },
        bottomBar = {
            BottomNavigation(
                navHostController = navHostController,
            )
        },
    ) {
        MainGraph(
            navHostController = navHostController,
        )
    }
}