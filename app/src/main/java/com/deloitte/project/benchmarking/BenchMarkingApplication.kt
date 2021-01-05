package com.deloitte.project.benchmarking

import android.app.Application
import com.deloitte.project.benchmarking.di.networkModule
import com.deloitte.project.benchmarking.di.repoModule
import com.deloitte.project.benchmarking.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class BenchMarkingApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(networkModule, repoModule, viewModelModule))
        }
    }
}