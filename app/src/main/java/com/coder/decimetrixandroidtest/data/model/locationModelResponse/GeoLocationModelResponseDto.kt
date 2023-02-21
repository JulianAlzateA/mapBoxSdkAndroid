package com.coder.decimetrixandroidtest.data.model.locationModelResponse


import com.google.gson.annotations.SerializedName

data class GeoLocationModelResponseDto(
    @SerializedName("features")
    val featureDto: List<FeatureDto?>?,
    @SerializedName("type")
    val type: String?
)