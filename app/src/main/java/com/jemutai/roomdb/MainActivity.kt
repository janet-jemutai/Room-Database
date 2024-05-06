package com.jemutai.roomdb
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material.*
//import androidx.compose.material3.Card
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.*
//import androidx.compose.runtime.snapshots.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.ViewModelProvider
//import com.jemutai.roomdb.data.Student
//import com.jemutai.roomdb.data.StudentViewModel
//import kotlinx.coroutines.flow.collect
//
//class MainActivity : ComponentActivity() {
//
//    private val viewModel: StudentViewModel by lazy {
//        ViewModelProvider(this).get(StudentViewModel::class.java)
//    }
//
//    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text("Student List") }
//                    )
//                },
//                content = {
//                    StudentList(viewModel)
//                }
//            )
//        }
//    }
//}
//
//@Composable
//fun StudentList(viewModel: StudentViewModel) {
//    val students by remember {
//        viewModel.getAllStudents().collectAsStateFlow(initial = emptyList())
//    }
//
//    LazyColumn {
//        items(students) { student ->
//            StudentItem(student = student)
//        }
//    }
//}
//
//@Composable
//fun StudentItem(student: Student) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
////        elevation = 4.dp
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(text = "Name: ${student.name}")
//            Text(text = "Gender: ${student.gender}")
//            Text(text = "Age: ${student.age}")
//            Text(text = "School: ${student.school}")
//        }
//    }
//}



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.jemutai.roomdb.ui.theme.RoomDBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomDBTheme {

            }
        }
    }
}

