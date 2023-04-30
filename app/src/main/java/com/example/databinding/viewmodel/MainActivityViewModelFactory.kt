package com.example.databinding.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class MainActivityViewModelFactory(private val startingTotal : Int) :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(startingTotal) as T
        }
         throw IllegalAccessException("Unknown View Model Class")
    }
}