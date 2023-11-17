package kz.itgirls.backApp.repository;

import kz.itgirls.backApp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>,
        JpaSpecificationExecutor<Answer> {
    List<Answer> findByCorrectTrue();
}
