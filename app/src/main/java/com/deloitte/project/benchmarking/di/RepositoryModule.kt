package com.deloitte.project.benchmarking.di

import com.deloitte.project.benchmarking.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}