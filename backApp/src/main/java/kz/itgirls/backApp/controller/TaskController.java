package kz.itgirls.backApp.controller;

import kz.itgirls.backApp.dto.TaskDto;
import kz.itgirls.backApp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/task")
    List<TaskDto> getAllTask() {
        return taskService.getAllTask();
    }
}
