package com.cs.daggerhiltphilip

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class TestViewModel @Inject constructor(
    @Named(value = "String1") testString1: String
): ViewModel() {
    init {
        Log.d("ViewModel", ": Test String from ViewModel : $testString1")
    }
}