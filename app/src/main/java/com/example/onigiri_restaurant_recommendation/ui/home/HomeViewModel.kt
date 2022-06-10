package com.example.onigiri_restaurant_recommendation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.onigiri_restaurant_recommendation.model.Location

class HomeViewModel : ViewModel() {
    private val _location = MutableLiveData<Location>()
    val location: LiveData<Location> = _location

    fun setLocation(lat: Double, long: Double) {
        _location.postValue(Location(lat, long))
    }
}