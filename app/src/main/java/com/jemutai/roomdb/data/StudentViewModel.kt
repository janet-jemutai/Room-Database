package com.jemutai.roomdb.data


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class StudentViewModel(private val repository: StudentRepository) : ViewModel() {

    fun addStudent(student: Student) {
        viewModelScope.launch {
            repository.addStudent(student)
        }
    }

    fun updateStudent(student: Student) {
        viewModelScope.launch {
            repository.updateStudent(student)
        }
    }

    fun deleteStudent(student: Student) {
        viewModelScope.launch {
            repository.deleteStudent(student)
        }
    }

    fun getAllStudents(): Flow<List<Student>> {
        return repository.getAllStudents()
    }

    fun getStudentById(id: Int): Flow<Student> {
        return repository.getGetStudentById(id)
    }
}


//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.setValue
//import androidx.lifecycle.ViewModel
//import java.util.concurrent.Flow
//
//class StudentViewModel(private  val studentRepository: StudentRepository):ViewModel() {
//
//    var studentNameState by mutableStateOf("")
//    var studentAgeState by mutableStateOf("")
//    var studentGenderState by mutableStateOf("")
//    var  studentSchoolState by mutableStateOf("")
//
//
//    fun  onStudentNameChanged(newString:String){
//        studentNameState = newString
//    }
//    fun  onStudentAgeChanged(newString: String){
//        studentAgeState = newString
//    }
//
//    fun  onStudentGenderChanged(newString: String){
//        studentGenderState = newString
//    }
//
//    fun  onStudentSchoolChanged(newString: String){
//        studentSchoolState = newString
//    }
//
//   // var  getAllStudents:Flow<List<Student>>
//
//}