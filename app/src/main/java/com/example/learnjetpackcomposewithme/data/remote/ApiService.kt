package com.example.learnjetpackcomposewithme.data.remote

import com.example.learnjetpackcomposewithme.data.remote.dto.User

interface ApiService {

    suspend fun getImages(
    ): List<User>
}