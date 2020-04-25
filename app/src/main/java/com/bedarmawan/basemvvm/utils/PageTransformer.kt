package com.bedarmawan.basemvvm.utils

import android.view.View
import androidx.viewpager.widget.ViewPager

class PageTransformer : ViewPager.PageTransformer {
    override fun transformPage(view: View, position: Float) {
        view.setTranslationX(-position * view.getWidth())
        view.setAlpha(1 - Math.abs(position))
    }
}