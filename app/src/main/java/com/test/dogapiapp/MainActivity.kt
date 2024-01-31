package com.test.dogapiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.test.dogapiapp.ui.theme.DogApiAppTheme
import com.test.dogapiapp.ui.view.MainController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DogApiAppTheme {
              MainController()
            }
        }
    }
}
