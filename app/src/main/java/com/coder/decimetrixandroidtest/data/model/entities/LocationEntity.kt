package com.coder.decimetrixandroidtest.data.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.coder.decimetrixandroidtest.domain.model.DomainLocation

@Entity(tableName = "locations_table")
data class LocationEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "location") val location: String?,
    @ColumnInfo(name = "latitude") val latitud: Double?,
    @ColumnInfo(name = "longitude") val longitud: Double?,
    @ColumnInfo(name = "favorite") val favorite: Boolean?
    )

fun DomainLocation.toDatabae() = LocationEntity(
    location = this.name,
    latitud = this.latitude,
    longitud = this.longitude,
    favorite = this.favorite
)