package com.jemutai.roomdb.data

import kotlinx.coroutines.flow.Flow

abstract class StudentRepository ( private val   studentDao: StudentDao){

   suspend fun  addStudent(nstudent:Student){
    studentDao.insertStudent(nstudent)
   }

  suspend fun  updateStudent (nstudent: Student){
   studentDao.updateStudent(nstudent)
  }
  suspend fun  deleteStudent (nstudent: Student){
   studentDao.deleteStudent(nstudent)
  }

  fun  getAllStudents():Flow<List<Student>> = studentDao.fetchAllStudents()

 fun  getGetStudentById(id:Int):Flow<Student>{
  return  studentDao.fetchStudentById(id)
 }
}