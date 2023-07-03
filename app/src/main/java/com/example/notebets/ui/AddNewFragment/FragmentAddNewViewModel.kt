package com.example.notebets.ui.AddNewFragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notebets.models.AppNote
import com.example.notebets.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FragmentAddNewViewModel (application: Application): AndroidViewModel(application) {
    fun insert (note: AppNote, onSuccess:()-> Unit) =
        viewModelScope.launch(Dispatchers.Main){
            REPOSITORY.insert(note){
                onSuccess()
            }
        }
}