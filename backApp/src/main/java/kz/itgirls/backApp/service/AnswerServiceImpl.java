package kz.itgirls.backApp.service;

import kz.itgirls.backApp.dto.AnswerDto;
import kz.itgirls.backApp.model.Answer;
import kz.itgirls.backApp.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService{

    private final AnswerRepository answerRepository;

    @Override
    public List<AnswerDto> getAnswerIsCorrect() {
        List<Answer> answerList = answerRepository.findByCorrectTrue();
        return answerList.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private AnswerDto convertToDto(Answer answer) {
        return AnswerDto.builder()
                .name(answer.getName())
                .build();
    }
}
