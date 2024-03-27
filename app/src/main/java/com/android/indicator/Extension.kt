package com.android.indicator

import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun View.setBgColor(@ColorRes id:Int){
    this.setBackgroundColor(ContextCompat.getColor(this.context, id))
}