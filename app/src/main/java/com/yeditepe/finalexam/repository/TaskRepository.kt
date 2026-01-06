package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val dtoList = api.getTasks()

        // TODO 2: Convert TaskDto list to Task list

        return TODO("return dtoList.map { dto ->\n" +
                "    Task(\n" +
                "        title = dto.title,\n" +
                "        isCompleted = dto.isCompleted\n" +
                "    )\n" +
                "}\n")
    }
}
