package com.example.test.tracker.demo.Controller;

import com.example.test.tracker.demo.Model.Task;
import com.example.test.tracker.demo.Service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test-tracker")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/getTask")
    public List<Task> getTask () {
        return taskService.getAllTask();
    }

    @DeleteMapping("/deleteTask")
    public void deleteTask (@RequestParam Integer taskId) {
        taskService.deleteTaskById(Long.valueOf(taskId));
    }
}
