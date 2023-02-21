package com.coder.decimetrixandroidtest.domain.model

import com.coder.decimetrixandroidtest.data.model.locationModelResponse.GeometryDto

data class Geometry(
    val coordinates: List<Double?>?,
    val type: String?
)

fun GeometryDto.toDomain() : Geometry = Geometry(this.coordinates, this.type)