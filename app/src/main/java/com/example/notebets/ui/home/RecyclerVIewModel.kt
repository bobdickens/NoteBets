package com.example.notebets.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notebets.utilits.REPOSITORY

class RecyclerVIewModel(application: Application): AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
}