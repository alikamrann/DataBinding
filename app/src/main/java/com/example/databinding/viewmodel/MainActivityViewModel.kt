package com.example.databinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal:Int):ViewModel() {
    private var count = 0
    private var sum =MutableLiveData<Int>()
    val totalData :LiveData<Int>
        get() = sum
    init {
        sum.value = startingTotal
    }
    fun getCurrentCount():Int{
        return count
    }
    fun getUpdatedCount():Int{
        return ++count
    }

    fun updateSum(addNumber:Int){
        (sum.value) = (sum.value)?.plus(addNumber)
    }
    fun setTotal(): Int? {
        return  sum.value ;
    }


}