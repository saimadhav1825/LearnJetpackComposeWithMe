package com.example.learnjetpackcomposewithme.domain.usecase

import com.example.learnjetpackcomposewithme.data.remote.WhetherRepositoryImpl
import javax.inject.Inject

class WhetherUseCase @Inject constructor(private val whetherRepositoryImpl: WhetherRepositoryImpl) {
    suspend fun getWhetherDetails() =
        whetherRepositoryImpl.getWhetherList()
}