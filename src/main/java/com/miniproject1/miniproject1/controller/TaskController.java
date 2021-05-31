package com.miniproject1.miniproject1.controller;

import com.miniproject1.miniproject1.model.Task;
import com.miniproject1.miniproject1.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskRepo taskRepo;

    @PostMapping("/saveTask")
    public String saveTask(@RequestBody Task task){
        taskRepo.save(task);
        return "Task Added";
    }
}
