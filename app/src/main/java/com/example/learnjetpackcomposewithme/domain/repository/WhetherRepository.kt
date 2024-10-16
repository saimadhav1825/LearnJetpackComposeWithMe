package com.example.learnjetpackcomposewithme.domain.repository

import com.example.learnjetpackcomposewithme.data.remote.dto.User
import com.example.learnjetpackcomposewithme.utils.ApiResult
import kotlinx.coroutines.flow.Flow

fun interface WhetherRepository {
    suspend fun getWhetherList(): Flow<ApiResult<List<User>>>
}