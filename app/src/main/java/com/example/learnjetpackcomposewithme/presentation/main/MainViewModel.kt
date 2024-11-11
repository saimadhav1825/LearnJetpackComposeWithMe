package com.example.learnjetpackcomposewithme.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnjetpackcomposewithme.presentation.navigation.BottomScreens
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    //isLoading state with initial value true
    private val _isLoading = MutableStateFlow(true);
    val isLoading = _isLoading.asStateFlow();
    private val _mainState=MutableStateFlow(MainState())
    val mainState:StateFlow<MainState> =_mainState.asStateFlow()

    init {
        _mainState.update {
            it.copy(bottomList = listOf(
                BottomScreens.Home,
                BottomScreens.Scheme,
                BottomScreens.Service
            ))
        }
        viewModelScope.launch {
            //Delay to simulate some background processsing like fetching data
            delay(1000)
            //After task is done set isLoading to false to hide splash screen
            _isLoading.value = false
        }
    }
}