package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yeditepe.finalexam.viewmodel.TaskViewModel

private val Nothing?.title: Any
    get() {
        TODO()
    }
private val TaskViewModel.taskList: Any
    get() {
        TODO()
    }

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
    val taskList = viewModel.taskList


    Column {
        // TODO 4: Display task titles and completion status
        taskList.forEach {
            val navController = null
            val it = null
            TaskRow(
                task = it,
                navController = navController
            )
        }

        // Use a simple Column or LazyColumn
    }
}

private fun Any.forEach(function: Any) {
    TODO("Not yet implemented")
}

@Composable
fun TaskRow(task: Nothing?, navController: Nothing?) {

    Text(
        text = task.title as AnnotatedString, modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title
            navController.navigate("taskDetail/${task.title}")


        },
        color = TODO(),
        fontSize = TODO(),
        fontStyle = TODO(),
        fontWeight = TODO(),
        fontFamily = TODO(),
        letterSpacing = TODO(),
        textDecoration = TODO(),
        textAlign = TODO(),
        lineHeight = TODO(),
        overflow = TODO(),
        softWrap = TODO(),
        maxLines = TODO(),
        minLines = TODO(),
        inlineContent = TODO(),
        onTextLayout = TODO(),
        style = TODO()
    )
}

private fun Nothing?.navigate(string: String) {
    TODO("Not yet implemented")
}
