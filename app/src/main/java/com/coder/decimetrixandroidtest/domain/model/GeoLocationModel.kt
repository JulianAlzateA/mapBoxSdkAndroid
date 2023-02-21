package com.coder.decimetrixandroidtest.domain.model

import com.coder.decimetrixandroidtest.data.model.entities.LocationEntity
import com.coder.decimetrixandroidtest.data.model.locationModelResponse.GeoLocationModelResponseDto

data class GeoLocationModel (
    val features: List<Feature?>?,
    val type: String?
    )

fun GeoLocationModelResponseDto.toDomain() : GeoLocationModel = GeoLocationModel(
    features = this.featureDto?.map { it?.toDomain() },
    type = this.type
)
