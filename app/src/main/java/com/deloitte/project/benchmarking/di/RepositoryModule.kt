package com.deloitte.project.benchmarking.di

import com.deloitte.project.benchmarking.data.api.ApiHelper
import com.deloitte.project.benchmarking.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideBlogRepo(apiHelper: ApiHelper) : MainRepository
            = MainRepository(apiHelper)
}