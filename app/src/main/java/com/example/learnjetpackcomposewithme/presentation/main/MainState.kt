package com.example.learnjetpackcomposewithme.presentation.main

import com.example.learnjetpackcomposewithme.presentation.navigation.BottomScreens


data class MainState(val bottomList: List<BottomScreens<out Any>> = emptyList())