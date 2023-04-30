package com.example.databinding.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal:Int):ViewModel() {
    private var total = 0;
    private var count = 0
    private var sum = 0
    init {
        sum = startingTotal
    }
    fun getCurrentCount():Int{
        return count
    }
    fun getUpdatedCount():Int{
        return ++count
    }

    fun updateSum(addNumber:Int){
        sum+=addNumber
    }
    fun setTotal():Int{
        return  sum;
    }


}