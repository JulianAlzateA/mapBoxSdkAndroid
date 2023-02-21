package com.coder.decimetrixandroidtest.data.remote.services

import com.coder.decimetrixandroidtest.data.model.locationModelResponse.GeoLocationModelResponseDto
import retrofit2.Response
import retrofit2.http.GET

interface GeoLocations {

    @GET("naturalearth-3.3.0/ne_50m_populated_places_simple.geojson")
    suspend fun getGeoLocations(): Response<GeoLocationModelResponseDto>
}