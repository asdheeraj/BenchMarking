package com.deloitte.project.benchmarking.data.api

import javax.inject.Inject

class ApiHelper
@Inject constructor(private val apiService: ApiService) {

    suspend fun getBlogs() = apiService.getBlogs()
}