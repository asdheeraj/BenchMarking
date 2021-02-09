package com.sample.project.benchmarking.data.api

import com.sample.project.benchmarking.data.model.Blog
import retrofit2.http.GET

interface ApiService {

    @GET("blogs")
    suspend fun getBlogs(): List<Blog>

}