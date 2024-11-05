package com.example.learnjetpackcomposewithme.utils

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SafeApiRequest @Inject constructor(

) {/*
    // repos to handle api errors.
    suspend fun <T> safeApiCall(apiToBeCalled: suspend () -> ApiResult<T>): ApiResult<T> {

        // Returning api response
        // wrapped in Resource class
        return withContext(Dispatchers.IO) {
            try {

                // Here we are calling api lambda
                // function that will return response
                // wrapped in Retrofit's Response class
                val response: ApiResult<T> = apiToBeCalled()

                if (response) {
                    // In case of success response we
                    // are returning Resource.Success object
                    // by passing our data in it.
                    ApiResult.Success(data = response.body()!!)
                } else {
                    // parsing api's own custom json error
                    // response in ExampleErrorResponse pojo
                    val errorResponse: ExampleErrorResponse? = convertErrorBody(response.errorBody())
                    // Simply returning api's own failure message
                    ApiResult.Error(errorMessage = errorResponse?.failureMessage ?: "Something went wrong")
                }

            } catch (e: HttpException) {
                // Returning HttpException's message
                // wrapped in Resource.Error
                ApiResult.Error(errorMessage = e.message ?: "Something went wrong")
            } catch (e: IOException) {
                // Returning no internet message
                // wrapped in Resource.Error
                ApiResult.Error("Please check your network connection")
            } catch (e: Exception) {
                // Returning 'Something went wrong' in case
                // of unknown error wrapped in Resource.Error
                ApiResult.Error(errorMessage = "Something went wrong")
            }
        }
    }
    */
}