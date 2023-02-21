package com.coder.decimetrixandroidtest.data.remote.api

import com.coder.decimetrixandroidtest.data.model.locationModelResponse.GeoLocationModelResponseDto
import com.coder.decimetrixandroidtest.data.remote.services.GeoLocations
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GeoLocationApi @Inject constructor(private val servicio : GeoLocations) {

    suspend fun getLocations(): GeoLocationModelResponseDto? {
        return withContext(Dispatchers.IO) {
            val response = servicio.getGeoLocations()
            response.body()
        }
    }
}