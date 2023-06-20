package com.eimtest.sds.di

import com.eimtest.sds.data.remote.ApiService
import com.eimtest.sds.data.repo.Repository
import com.eimtest.sds.domain.repo.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRepository(): Repository {
        return RepositoryImpl()
    }
}