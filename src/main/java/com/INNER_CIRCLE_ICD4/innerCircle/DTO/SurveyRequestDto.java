package com.INNER_CIRCLE_ICD4.innerCircle.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SurveyRequestDto {
    private String title;
    private String description;
    private List<QuestionRequestDto> questions;
}
