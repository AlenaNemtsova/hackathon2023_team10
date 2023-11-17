package kz.itgirls.backApp.service;

import kz.itgirls.backApp.dto.AnswerDto;
import kz.itgirls.backApp.dto.QuestionDto;
import kz.itgirls.backApp.model.Answer;
import kz.itgirls.backApp.model.Question;
import kz.itgirls.backApp.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;

    @Override
    public List<QuestionDto> getAllQuestion() {
        List<Question> questions = questionRepository.findAll();
        return questions.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public QuestionDto convertToDto(Question question) {
        List<AnswerDto> answerDtoList = new ArrayList<>();

        for (Answer answer : question.getAnswerList()) {
            AnswerDto answerDto = new AnswerDto();
            answerDto.setName(answer.getName());
            answerDtoList.add(answerDto);
        }
        return QuestionDto.builder()
                .name(question.getName())
                .answerDtoList(answerDtoList)
                .build();
    }
}
