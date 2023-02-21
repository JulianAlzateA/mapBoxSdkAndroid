package com.coder.decimetrixandroidtest.domain.model

import com.coder.decimetrixandroidtest.data.model.locationModelResponse.FeatureDto

data class Feature(
    val geometry: Geometry?,
    val domainLocation: DomainLocation?,
    val type: String?
)

fun FeatureDto.toDomain() : Feature = Feature(
    this.geometry?.toDomain(),
    this.propertiesDto?.toDomain(),
    this.type
)
