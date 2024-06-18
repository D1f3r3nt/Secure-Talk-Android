package com.diferent.securetalk.ui.root

import androidx.lifecycle.ViewModel
import com.diferent.securetalk.model.enums.NonAuthorized
import com.diferent.securetalk.model.enums.RootState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RootViewModel @Inject constructor(
    
): ViewModel() {
    
    private val _rootState = MutableStateFlow<RootState>(NonAuthorized())
    
    val rootState: StateFlow<RootState> = _rootState
}