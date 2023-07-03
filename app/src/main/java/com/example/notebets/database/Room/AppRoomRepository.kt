package com.example.notebets.database.Room

import androidx.lifecycle.LiveData
import com.example.notebets.database.DatabaseRepository
import com.example.notebets.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao): DatabaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.delete(note)
    }
}