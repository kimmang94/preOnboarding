package com.INNER_CIRCLE_ICD4.innerCircle.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionRequestDto {
    private String name;
    private String description;
    private String type; // SHORT, LONG, SINGLE_SELECT, MULTI_SELECT
    private boolean required;
    private List<String> options; // 단/복수 선택일 때만 값이 존재
}
