package com.bedarmawan.basemvvm.base

import androidx.lifecycle.ViewModel
import com.bedarmawan.basemvvm.injection.component.DaggerViewModelInjector
import com.bedarmawan.basemvvm.injection.component.ViewModelInjector
import com.bedarmawan.basemvvm.injection.module.NetworkModule
import com.bedarmawan.basemvvm.ui.home.HomeViewModel
import com.bedarmawan.basemvvm.ui.splash.SplashViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is SplashViewModel -> injector.inject(this)
            is HomeViewModel -> injector.inject(this)
        }
    }
}