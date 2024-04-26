package com.jemutai.roomdb.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
class Student (
    @PrimaryKey(autoGenerate = true)
     val id : Int,
    @ColumnInfo(name = "name")
    val  name :String,
    @ColumnInfo(name = "gender")
    val gender : String,
    @ColumnInfo(name = "age")
    val age : Int,
    @ColumnInfo(name = "school")
    val school : String

    )

