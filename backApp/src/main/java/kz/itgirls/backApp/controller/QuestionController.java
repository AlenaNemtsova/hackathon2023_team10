package kz.itgirls.backApp.controller;

import kz.itgirls.backApp.dto.QuestionDto;
import kz.itgirls.backApp.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/question")
    List<QuestionDto> getAllQuestion() {
        return questionService.getAllQuestion();
    }
}
