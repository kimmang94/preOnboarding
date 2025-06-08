package com.INNER_CIRCLE_ICD4.innerCircle.repository;


import com.INNER_CIRCLE_ICD4.innerCircle.example.survey.domain.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}

