package kz.itgirls.backApp.controller;

import kz.itgirls.backApp.dto.AnswerDto;
import kz.itgirls.backApp.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @GetMapping("/correct")
    List<AnswerDto> getAnswerIsCorrect() {
        return answerService.getAnswerIsCorrect();
    }
}
