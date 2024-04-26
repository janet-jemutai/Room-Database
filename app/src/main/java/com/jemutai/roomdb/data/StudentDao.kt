package com.jemutai.roomdb.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract  class StudentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract  suspend fun insertStudent(student: Student)

    @Update
    abstract suspend  fun  updateStudent(student: Student)

    @Delete
    abstract suspend  fun deleteStudent (student: Student)

    @Query("SELECT * FROM STUDENT")
    abstract  fun  fetchAllStudents():Flow <List<Student>>

    @Query("SELECT * FROM STUDENT where id =:id")
    abstract  fun  fetchStudentById(id:Int):Flow <Student>
}