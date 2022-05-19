package com.cs.daggerhiltphilip.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

// ActivityComponent only active as long as our activity active
//singleton cant work with ActivityComponent so use ActivityScoped
@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("String3")
    fun provideTestString3() = "This is String we will inject"


}