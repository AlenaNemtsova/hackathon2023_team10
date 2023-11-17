package kz.itgirls.backApp.repository;

import kz.itgirls.backApp.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SolutionRepository extends JpaRepository<Solution, Long>,
        JpaSpecificationExecutor<Solution> {
}
