package kz.itgirls.backApp.controller;

import kz.itgirls.backApp.dto.SolutionDto;
import kz.itgirls.backApp.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SolutionController {

    private final SolutionService solutionService;

    @GetMapping("/solution")
    List<SolutionDto> getAllSolution() {
        return solutionService.getAllSolution();
    }
}
