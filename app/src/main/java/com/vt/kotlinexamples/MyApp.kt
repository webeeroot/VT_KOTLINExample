package com.vt.kotlinexamples

import android.app.Application
import com.vt.kotlinexamples.listeners.MyListener

class MyApp : Application() {

    var myListener: MyListener? = null
}