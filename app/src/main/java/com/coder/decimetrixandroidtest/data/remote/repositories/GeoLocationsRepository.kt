package com.coder.decimetrixandroidtest.data.remote.repositories

import com.coder.decimetrixandroidtest.data.model.dao.LocationDao
import com.coder.decimetrixandroidtest.data.model.entities.LocationEntity
import com.coder.decimetrixandroidtest.data.remote.api.GeoLocationApi
import com.coder.decimetrixandroidtest.domain.model.DomainLocation
import com.coder.decimetrixandroidtest.domain.model.GeoLocationModel
import com.coder.decimetrixandroidtest.domain.model.toDomain
import javax.inject.Inject

class GeoLocationsRepository @Inject constructor(
    private val locationDao: LocationDao
){

    suspend fun getLocationsFromDatabase() : List<DomainLocation>{
        val response = locationDao.getAllLocations()
        return response.map { it.toDomain() }
    }

    suspend fun insertLocations(locations : List<LocationEntity>){
        locationDao.insertAll(locations)
    }

    suspend fun clearLocations(){
        locationDao.deleteAllLocations()
    }

}