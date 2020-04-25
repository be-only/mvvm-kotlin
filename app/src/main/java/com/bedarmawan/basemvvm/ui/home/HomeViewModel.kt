package com.bedarmawan.basemvvm.ui.home

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.bedarmawan.basemvvm.base.BaseViewModel
import com.bumptech.glide.Glide

class HomeViewModel(val context: Activity): BaseViewModel() {

    val sampleText = MutableLiveData<String>()
    var imageUrl: String

    init {
        sampleText.value = "Sample text from mutable live data\nClick for show toast"
        imageUrl = "https://f0.pngfuel.com/png/647/588/yellow-duck-illustration-png-clip-art.png"
    }

    fun showToast(context: Context){
        Toast.makeText(context, "Sample onclick", LENGTH_SHORT).show()
    }

    companion object {
        @JvmStatic
        @BindingAdapter("bind:loadImage")
        fun loadImage(imageView: ImageView, imageUrl: String){
            Glide.with(imageView.context).load(imageUrl).into(imageView)
        }
    }
}