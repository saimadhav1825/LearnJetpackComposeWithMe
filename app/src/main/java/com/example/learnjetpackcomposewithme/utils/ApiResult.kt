package com.example.learnjetpackcomposewithme.utils

sealed class ApiResult<out T> {
    data class Success<out T>(val data: T) : ApiResult<T>()
    data class Error(val errorMessage: String) : ApiResult<Nothing>()
    data object Loading : ApiResult<Nothing>()
}