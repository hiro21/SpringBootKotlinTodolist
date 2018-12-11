package com.example.todolist

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tasks")
class TaskController {
    @GetMapping("")
    fun index(): String {
        val tasks = listOf(
                Task(1, "test1", false),
                Task(2, "test2", true)
        )
        return tasks.toString()
    }
}