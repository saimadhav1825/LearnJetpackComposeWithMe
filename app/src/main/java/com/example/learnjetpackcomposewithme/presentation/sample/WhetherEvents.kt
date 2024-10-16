package com.example.learnjetpackcomposewithme.presentation.sample

sealed class WhetherEvents {
    data class Success(val message:String): WhetherEvents()
    data class Error(val error:String): WhetherEvents()
}