package com.vt.kotlinexamples.listeners

import java.io.Serializable

interface MyListener : Serializable {
    fun onEventOccurred(data: String)
}