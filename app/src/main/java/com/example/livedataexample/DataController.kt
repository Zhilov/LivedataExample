package com.example.livedataexample

import androidx.lifecycle.LiveData

import androidx.lifecycle.MutableLiveData

class DataController {
     private val liveData = MutableLiveData<String>()

    fun getData(): MutableLiveData<String>? {
        return liveData
    }
}