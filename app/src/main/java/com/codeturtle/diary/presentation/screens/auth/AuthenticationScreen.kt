package com.codeturtle.diary.presentation.screens.auth

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.codeturtle.diary.naviagtion.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AuthenticationScreen(
    loadingState: Boolean,
    onButtonClicked: () -> Unit
) {
    Scaffold(
        content = {
            AuthenticationContent(
                loadingState = loadingState,
                onButtonClicked = onButtonClicked
            )
        }
    )
    
}