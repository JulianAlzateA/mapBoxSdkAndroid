package com.coder.decimetrixandroidtest.presentation.ui.favoritesLocations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coder.decimetrixandroidtest.databinding.FavoritesLocationsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoritesLocations : AppCompatActivity(){

    private lateinit var binding : FavoritesLocationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FavoritesLocationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}