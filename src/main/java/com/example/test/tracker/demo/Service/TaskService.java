package com.example.test.tracker.demo.Service;

import com.example.test.tracker.demo.Model.Task;
import com.example.test.tracker.demo.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTask () {
        return taskRepository.findAll();
    }

    public void deleteTaskById (Long id) {
        taskRepository.deleteById(id);
    }

}
