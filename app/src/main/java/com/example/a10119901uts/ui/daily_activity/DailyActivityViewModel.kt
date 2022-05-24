package com.example.a10119901uts.ui.daily_activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DailyActivityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is daily activity Fragment"
    }
    val text: LiveData<String> = _text
}