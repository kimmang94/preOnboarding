package com.INNER_CIRCLE_ICD4.innerCircle.repository;


import com.INNER_CIRCLE_ICD4.innerCircle.example.survey.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}

