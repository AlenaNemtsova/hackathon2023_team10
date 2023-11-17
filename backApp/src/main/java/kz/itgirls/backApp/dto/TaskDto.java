package kz.itgirls.backApp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskDto {

    private String name;
    private String description;
//    private List<SolutionDto> solutionDtoList;
}
