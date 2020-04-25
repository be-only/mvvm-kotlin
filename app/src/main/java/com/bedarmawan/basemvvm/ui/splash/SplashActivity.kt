package com.bedarmawan.basemvvm.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bedarmawan.basemvvm.BuildConfig
import com.bedarmawan.basemvvm.R
import com.bedarmawan.basemvvm.databinding.ActivitySplashBinding
import com.bedarmawan.basemvvm.model.Splash

class SplashActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        viewModel = SplashViewModel()
        viewModel.bind(this, Splash("Version " + BuildConfig.VERSION_NAME))
        binding.viewModel = viewModel
    }
}