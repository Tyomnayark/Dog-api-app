package com.test.dogapiapp.ui.view.bottombar

import com.test.dogapiapp.R

class BottomItems {
    object Home : BottomNavigationItem(
        descriptionId = R.string.bottom_home_name,
        iconId = R.drawable.dog_paw,
        screen = "Home_screen"
    )

    object Liked : BottomNavigationItem(
        descriptionId = R.string.bottom_liked_name,
        iconId = R.drawable.heart_fill,
        screen = "Liked_screen"
    )
}