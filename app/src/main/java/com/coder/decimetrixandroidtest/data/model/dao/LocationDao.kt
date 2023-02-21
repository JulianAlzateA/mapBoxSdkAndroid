package com.coder.decimetrixandroidtest.data.model.dao

import androidx.room.*
import com.coder.decimetrixandroidtest.data.model.entities.LocationEntity

@Dao
interface LocationDao {

    @Query("SELECT * FROM locations_table")
    suspend fun getAllLocations(): List<LocationEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(locations : List<LocationEntity>)

    @Query("DELETE FROM locations_table")
    suspend fun deleteAllLocations(): List<LocationEntity>? = null
}