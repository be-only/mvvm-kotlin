package com.bedarmawan.basemvvm.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Handler
import androidx.lifecycle.MutableLiveData
import com.bedarmawan.basemvvm.base.BaseViewModel
import com.bedarmawan.basemvvm.model.Splash
import com.bedarmawan.basemvvm.ui.home.HomeActivity

class SplashViewModel:BaseViewModel() {
    val versionName = MutableLiveData<String>()
    private lateinit var context: Activity

    fun bind(context: Activity, data: Splash){
        this.context = context
        versionName.value = data.versionName
        launchHome()
    }

    private fun launchHome(){
        val intent = Intent(context, HomeActivity::class.java)
        Handler().postDelayed({
            context.startActivity(intent)
            context.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            context.finish()
        }, 2000)
    }
}