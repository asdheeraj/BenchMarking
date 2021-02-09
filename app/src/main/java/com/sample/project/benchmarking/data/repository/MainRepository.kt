package com.sample.project.benchmarking.data.repository

import com.sample.project.benchmarking.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getBlogs() = apiHelper.getBlogs()
}