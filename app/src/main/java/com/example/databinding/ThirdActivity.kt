package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityThirdBinding
import com.example.databinding.viewmodel.MainActivityViewModel
import com.example.databinding.viewmodel.MainActivityViewModelFactory

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding:ActivityThirdBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_third)


        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainActivityViewModel::class.java]



    }
}