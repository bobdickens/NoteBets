package com.example.notebets.models

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Keep
@Entity(tableName = "notes_tables")
data class AppNote (
        @PrimaryKey(autoGenerate = true) val id: Int = 0,

        @ColumnInfo val name: String = "",
        @ColumnInfo val date: String = "",
        @ColumnInfo val amount: String = "",
        @ColumnInfo val odds: String = "",
        @ColumnInfo val score: String = "",
        @ColumnInfo val status: String = "",
        @ColumnInfo val description: String = ""

        ): Serializable