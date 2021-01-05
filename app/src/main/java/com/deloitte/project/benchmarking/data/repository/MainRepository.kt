package com.deloitte.project.benchmarking.data.repository

import com.deloitte.project.benchmarking.data.api.ApiHelper
import javax.inject.Inject

class MainRepository
@Inject constructor(
    private val apiHelper: ApiHelper
) {

    suspend fun getBlogs() = apiHelper.getBlogs()
}