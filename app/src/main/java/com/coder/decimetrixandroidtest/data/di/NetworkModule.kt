package com.coder.decimetrixandroidtest.data.di

import com.coder.decimetrixandroidtest.data.remote.services.GeoLocations
import com.coder.decimetrixandroidtest.data.remote.services.NetworkInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    @Named("NAME_BASE_URL")
    fun providesBaseUrl() = "Url"

    @Singleton
    @Provides
    fun provideRetrofit(@Named("NAME_BASE_URL") baseUrl : String): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
    }

    @Singleton
    @Provides
    fun networkInterface(retrofit : Retrofit): NetworkInterface =
        retrofit.create(NetworkInterface::class.java)


    @Singleton
    @Provides
    @Named("NAME_GEO_BASE_URL")
    fun providesBaseGeoUrl() = "https://d2ad6b4ur7yvpq.cloudfront.net/"



    @Singleton
    @Provides
    fun geoLocationsService(retrofit : Retrofit): GeoLocations =
        retrofit.create(GeoLocations::class.java)

}