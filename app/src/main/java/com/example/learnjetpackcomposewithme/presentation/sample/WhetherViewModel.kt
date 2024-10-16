package com.example.learnjetpackcomposewithme.presentation.sample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learnjetpackcomposewithme.domain.usecase.WhetherUseCase
import com.example.learnjetpackcomposewithme.utils.ApiResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WhetherViewModel @Inject constructor(
    private val whetherUseCase: WhetherUseCase
) : ViewModel() {
    private val _state: MutableStateFlow<WhetherState> = MutableStateFlow(WhetherState())
    val state: StateFlow<WhetherState>
        get() = _state.asStateFlow()

    private val _whetherChannel = Channel<WhetherEvents>()
    val whetherChannel = _whetherChannel.receiveAsFlow()
    fun onAction(actions: WhetherActions) {
        when (actions) {
            is WhetherActions.Details -> {

                viewModelScope.launch {
                    whetherUseCase.getWhetherDetails().collectLatest {
                        when (it) {
                            is ApiResult.Success -> {

                            }

                            is ApiResult.Loading -> {

                            }

                            is ApiResult.Error -> {

                            }
                        }
                    }
                }
            }
        }
    }
}