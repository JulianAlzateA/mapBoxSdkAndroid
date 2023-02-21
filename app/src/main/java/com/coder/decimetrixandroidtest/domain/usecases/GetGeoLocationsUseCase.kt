package com.coder.decimetrixandroidtest.domain.usecases

import com.coder.decimetrixandroidtest.common.util.isNull
import com.coder.decimetrixandroidtest.data.model.entities.toDatabae
import com.coder.decimetrixandroidtest.data.remote.api.GeoLocationApi
import com.coder.decimetrixandroidtest.data.remote.repositories.GeoLocationsRepository
import com.coder.decimetrixandroidtest.domain.model.DomainLocation
import com.coder.decimetrixandroidtest.domain.model.GeoLocationModel
import com.coder.decimetrixandroidtest.domain.model.toDomain
import javax.inject.Inject

class GetGeoLocationsUseCase @Inject constructor(
    private val repository : GeoLocationsRepository,
    private val api : GeoLocationApi
){
    suspend operator fun invoke() : List<DomainLocation>{
        val geolocationResponse = api.getLocations()

        return if (!geolocationResponse.isNull()){
            repository.clearLocations()
            val localGeoLocation : GeoLocationModel? = geolocationResponse?.toDomain()
            repository.insertLocations(localGeoLocation!!.features?.map { it!!.domainLocation }!!.map { it!!.toDatabae() })
            repository.getLocationsFromDatabase()
        }else{
            repository.getLocationsFromDatabase()
        }
    }
}
