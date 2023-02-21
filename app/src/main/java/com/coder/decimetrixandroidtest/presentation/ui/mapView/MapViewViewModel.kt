package com.coder.decimetrixandroidtest.presentation.ui.mapView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coder.decimetrixandroidtest.domain.model.DomainLocation
import com.coder.decimetrixandroidtest.domain.usecases.GetGeoLocationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapViewViewModel @Inject constructor(
    private val getGeoLocationsUseCase: GetGeoLocationsUseCase
) : ViewModel() {

    val locationModel = MutableLiveData<DomainLocation>()

    fun setLocations(){
        //val currentLocation : DomainLocation = mLocationProvider.getLocations
        //locationModel.postValue(currentLocation)
    }
}