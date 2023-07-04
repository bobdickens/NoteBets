package com.example.notebets.database.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notebets.models.AppNote

@Database(entities = [AppNote::class], version = 2)
abstract class AppRoomDatabase: RoomDatabase() {
    abstract fun getAppRoomDao(): AppRoomDao

    companion object {

        private var database: AppRoomDatabase? = null

        @Synchronized
        fun getInstance (context: Context) : AppRoomDatabase {
            return if (database == null) {
                database = Room.databaseBuilder(
                    context,
                    AppRoomDatabase::class.java,
                    name = "databse"
                ).build()
                database as AppRoomDatabase

            } else database as AppRoomDatabase
        }
    }
}