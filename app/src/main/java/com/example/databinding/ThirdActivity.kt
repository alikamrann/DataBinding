package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
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
        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.button2.setOnClickListener {
            binding.textView.text = viewModel.getUpdatedCount( ).toString()
        }

        binding.button.setOnClickListener {
             viewModel.updateSum(binding.numberEd.text.toString().toInt())
            binding.textView.text  = viewModel.setTotal().toString()
        }


    }
}