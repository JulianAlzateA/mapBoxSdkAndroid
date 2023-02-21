package com.coder.decimetrixandroidtest.data.model.locationModelResponse


import com.google.gson.annotations.SerializedName

data class FeatureDto(
    @SerializedName("geometry")
    val geometry: GeometryDto?,
    @SerializedName("properties")
    val propertiesDto: PropertiesDto?,
    @SerializedName("type")
    val type: String?
)