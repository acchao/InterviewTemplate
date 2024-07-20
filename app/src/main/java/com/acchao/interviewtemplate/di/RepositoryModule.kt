package com.acchao.interviewtemplate.di

import android.content.Context
import com.acchao.interviewtemplate.data.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideMainRepository(@ApplicationContext appContext: Context): MainRepository {
        // Leaving out appContext for now.
        return MainRepository()
    }
}