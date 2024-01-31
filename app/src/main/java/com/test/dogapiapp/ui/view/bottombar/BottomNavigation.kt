package com.test.dogapiapp.ui.view.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.test.dogapiapp.ui.view.modifiers.shadow

@Composable
fun BottomNavigation(
    navHostController: NavHostController
) {
    val listBottomNavigationItems = listOf(
        BottomItems.Home,
        BottomItems.Liked
    )
    val backStackEntry by navHostController.currentBackStackEntryAsState()
    val currentScreen = backStackEntry?.destination?.route

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 15.dp,
                end = 15.dp,
                bottom = 60.dp
            )
            .shadow(
                blurRadius = 50.dp,
                transparency = 0.30f,
                borderRadius = 30.dp,
                color = MaterialTheme.colorScheme.secondary
            )
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(30.dp)
            )

        ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            listBottomNavigationItems.forEach { bottomItem ->
                val isSelected = currentScreen == bottomItem.screen


                IconButton(onClick = {
                    navHostController.popBackStack(bottomItem.screen, inclusive = false)
                    navHostController.navigate(bottomItem.screen) {
                        navHostController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }) {
                    Icon(
                        painter = painterResource(id = bottomItem.iconId),
                        contentDescription = stringResource(id = bottomItem.descriptionId),
                        tint =
                        if (isSelected)
                            MaterialTheme.colorScheme.secondary
                        else
                            MaterialTheme.colorScheme.tertiary
                    )
                }
            }
        }
    }
}
