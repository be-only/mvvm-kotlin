package com.bedarmawan.basemvvm.injection.component

import dagger.Component
import com.bedarmawan.basemvvm.injection.module.NetworkModule
import com.bedarmawan.basemvvm.ui.home.HomeViewModel
import com.bedarmawan.basemvvm.ui.splash.SplashViewModel
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(viewModel: SplashViewModel)
    fun inject(viewModel: HomeViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}