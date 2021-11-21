package com.reactnativemytextedit

import android.graphics.Color
import android.view.View
import android.widget.EditText
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class MyTexteditViewManager : SimpleViewManager<View>() {
  override fun getName() = "MyTexteditView"

  override fun createViewInstance(reactContext: ThemedReactContext): View {
    return EditText(reactContext)
  }

  @ReactProp(name = "color")
  fun setColor(view: View, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
  }
}
