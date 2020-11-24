package com.deloitte.project.benchmarking.data.repository

import com.deloitte.project.benchmarking.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getBlogs() = apiHelper.getBlogs()
}