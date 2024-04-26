package com.jemutai.roomdb.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Student::class],
    version = 1,
    exportSchema = false
)
abstract class StudentDatabase:RoomDatabase() {

    abstract  fun  studentDao():StudentDao


}