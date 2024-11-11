package com.example.learnjetpackcomposewithme.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.learnjetpackcomposewithme.presentation.navigation.navroute.HomeScreens
import com.example.learnjetpackcomposewithme.presentation.navigation.navroute.SchemesScreens
import com.example.learnjetpackcomposewithme.presentation.navigation.navroute.ServicesScreens
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomScreens<T>(val name: String, @Contextual val icon: ImageVector, val route: T) {
    @Serializable
    data object Home : BottomScreens<HomeScreens>(
        name = "Home",
        icon = Icons.Filled.Home,
        route = HomeScreens
    )


    @Serializable
    data object Scheme : BottomScreens<SchemesScreens>(
        name = "Scheme",
        icon = Icons.Filled.ShoppingCart,
        route = SchemesScreens
    )

    @Serializable
    data object Service : BottomScreens<ServicesScreens>(
        name = "Service",
        icon = Icons.Filled.Person,
        route = ServicesScreens
    )
}