package com.coder.decimetrixandroidtest.data.di

import android.content.Context
import androidx.room.Room
import com.coder.decimetrixandroidtest.data.model.LocationDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

import com.coder.decimetrixandroidtest.common.AppConstants.LOCATION_DATABASE

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, LocationDataBase::class.java, LOCATION_DATABASE).build()

    @Singleton
    @Provides
    fun provideLocationDao(database: LocationDataBase) =
        database.getLocationDao()

}