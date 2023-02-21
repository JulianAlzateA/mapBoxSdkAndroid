package com.coder.decimetrixandroidtest.data.model.locationModelResponse


import com.google.gson.annotations.SerializedName

data class GeometryDto(
    @SerializedName("coordinates")
    val coordinates: List<Double?>?,
    @SerializedName("type")
    val type: String?
)