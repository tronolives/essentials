package com.essentials.tasklistserver.controller;

import com.essentials.tasklistserver.model.Task;
import com.essentials.tasklistserver.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping("/add")
    public void addTask(@RequestBody Task task) {
        taskRepository.save(task);
    }

    @GetMapping("/all")
    public List<Task> getAllTasks(){
        return (List<Task>) taskRepository.findAll();
    }
}
