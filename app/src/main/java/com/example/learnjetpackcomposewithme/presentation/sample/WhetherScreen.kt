package com.example.learnjetpackcomposewithme.presentation.sample

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun WhetherScreen(
    whetherViewModel: WhetherViewModel = hiltViewModel()
) {
    val uiState by whetherViewModel.state.collectAsStateWithLifecycle()
}