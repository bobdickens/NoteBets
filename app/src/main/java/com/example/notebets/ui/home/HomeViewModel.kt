package com.example.notebets.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notebets.database.Room.AppRoomDatabase
import com.example.notebets.database.Room.AppRoomRepository
import com.example.notebets.utilits.REPOSITORY
import com.example.notebets.utilits.TYPE_ROOM

class HomeViewModel (application: Application): AndroidViewModel(application) {

    private val mContext = application

    fun initDataBase(type:String, onSuccess:() -> Unit){

        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }

    }
}