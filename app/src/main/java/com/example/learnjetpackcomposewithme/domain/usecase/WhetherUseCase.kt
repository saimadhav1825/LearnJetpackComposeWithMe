package com.example.learnjetpackcomposewithme.domain.usecase

import com.example.learnjetpackcomposewithme.data.remote.WhetherRepositoryImpl

class WhetherUseCase(private val whetherRepositoryImpl: WhetherRepositoryImpl) {
    suspend fun getWhetherDetails() =
        whetherRepositoryImpl.getWhetherList()
}