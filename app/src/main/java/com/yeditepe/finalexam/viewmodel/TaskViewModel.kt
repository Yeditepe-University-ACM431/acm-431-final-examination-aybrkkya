package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    val taskList = mutableStateListOf(
        Task(id = 0, title = "Submit Final Project", isCompleted = false),
        Task(id = 1, title = "Prepare Presentation", isCompleted = false)
    )


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = taskList.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = taskList[index]
            taskList[index] = task.copy(isCompleted = !task.isCompleted)
        }

    }
}
