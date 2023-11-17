package kz.itgirls.backApp.service;

import kz.itgirls.backApp.dto.SolutionDto;
import kz.itgirls.backApp.model.Solution;
import kz.itgirls.backApp.repository.SolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SolutionServiceImpl implements SolutionService{

    private final SolutionRepository solutionRepository;

    @Override
    public List<SolutionDto> getAllSolution() {
        List<Solution> solutions = solutionRepository.findAll();
        return solutions.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private SolutionDto convertToDto(Solution solution) {
        return SolutionDto.builder()
                .description(solution.getDescription())
                .build();
    }
}
