package com.example.notebets.ui.Fragment_Bet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notebets.models.AppNote
import com.example.notebets.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BetViewModel(application: Application): AndroidViewModel(application) {
    fun delete (note: AppNote, onSuccess:() -> Unit) =
        viewModelScope.launch(Dispatchers.Main){
            REPOSITORY.delete(note){
                onSuccess()
            }
        }
}