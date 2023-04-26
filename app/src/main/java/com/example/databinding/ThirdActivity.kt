package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityThirdBinding
import com.example.databinding.viewmodel.MainActivityViewModel

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding:ActivityThirdBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_third)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener {
            binding.textView.text = viewModel.getUpdatedCount( ).toString()
        }
    }
}