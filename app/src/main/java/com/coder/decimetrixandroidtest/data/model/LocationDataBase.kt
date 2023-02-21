package com.coder.decimetrixandroidtest.data.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.coder.decimetrixandroidtest.data.model.dao.LocationDao
import com.coder.decimetrixandroidtest.data.model.entities.LocationEntity

@Database(entities = [LocationEntity::class], version = 1)
abstract class LocationDataBase: RoomDatabase(){

    abstract fun getLocationDao() : LocationDao

}