package com.example.learnjetpackcomposewithme.data.remote

import com.example.learnjetpackcomposewithme.data.remote.dto.User
import com.example.learnjetpackcomposewithme.domain.repository.WhetherRepository
import com.example.learnjetpackcomposewithme.utils.ApiResult
import com.example.learnjetpackcomposewithme.utils.SafeApiRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WhetherRepositoryImpl(
    private val apiService: ApiService,
    private val safeApiRequest: SafeApiRequest
) : WhetherRepository {
    override suspend fun getWhetherList(): Flow<ApiResult<List<User>>> = flow {
       /* emit(
            safeApiRequest.safeApiCall {
               // apiService.getImages()
            }

        )*/
    }
}