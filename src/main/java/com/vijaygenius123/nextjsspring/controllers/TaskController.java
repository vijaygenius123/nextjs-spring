package com.vijaygenius123.nextjsspring.controllers;

import com.vijaygenius123.nextjsspring.models.Task;
import com.vijaygenius123.nextjsspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {


    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getTasks(Principal principal) {
        return taskRepository.findAllByUid(principal.getName());
    }
    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task, Principal principal){
        task.setUid(principal.getName());
        task.setCompleted(false);
        return taskRepository.save(task);
    }
}
