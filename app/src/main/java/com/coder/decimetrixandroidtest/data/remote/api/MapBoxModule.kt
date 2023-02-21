package com.coder.decimetrixandroidtest.data.remote.api

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MapBoxModule {

//    @Singleton
//    @Provides
//    fun provideMaps(@ApplicationContext context: Context) : Mapbox {
//        return Mapbox.getInstance(context, context.getString(R.string.mapbox_access_token))
//    }

//    @Singleton
//    @Provides
//    fun mapsInterface(mapBox : MapboxNavigationApp) : MapInterface =
//        mapBox.setup(MapInterface::class.java)
}