package kz.itgirls.backApp.service;

import kz.itgirls.backApp.dto.SolutionDto;
import kz.itgirls.backApp.dto.TaskDto;
import kz.itgirls.backApp.model.Solution;
import kz.itgirls.backApp.model.Task;
import kz.itgirls.backApp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<TaskDto> getAllTask() {
        List<Task> tasks = taskRepository.findAll();
        return tasks.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private TaskDto convertToDto(Task task) {
        List<SolutionDto> taskDtoList = new ArrayList<>();
        for(Solution solution : task.getSolutionList()) {
            SolutionDto solution1 = new SolutionDto();
            solution1.setDescription(solution.getDescription());
            taskDtoList.add(solution1);
        }
        return TaskDto.builder()
                .name(task.getName())
                .description(task.getDescription())
//                .solutionDtoList(taskDtoList)
                .build();
    }

}
