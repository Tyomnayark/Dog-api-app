package com.test.dogapiapp.ui.view.bottombar

sealed class BottomNavigationItem (
    val descriptionId: Int,
    val iconId: Int,
    val screen: String,
)