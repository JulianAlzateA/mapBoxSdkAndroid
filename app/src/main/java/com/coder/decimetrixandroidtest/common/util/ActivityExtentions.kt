package com.coder.decimetrixandroidtest.common.util

import android.app.Activity
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun Activity.color(@ColorRes color : Int) = ContextCompat.getColor(this, color)

fun Any?.isNull() = this == null

fun Activity.toast(text : String, length : Int = Toast.LENGTH_SHORT) = Toast.makeText(this, text, length).show()