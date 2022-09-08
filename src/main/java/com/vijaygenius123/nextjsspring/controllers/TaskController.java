package com.vijaygenius123.nextjsspring.controllers;

import com.vijaygenius123.nextjsspring.models.Task;
import com.vijaygenius123.nextjsspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {


    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        System.out.println(taskRepository.findAll());
        return taskRepository.findAll();
    }

}
