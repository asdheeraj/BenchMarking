package com.deloitte.project.benchmarking.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getBlogs() = apiService.getBlogs()
}