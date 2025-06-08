package com.INNER_CIRCLE_ICD4.innerCircle.DTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionResponseDto {
    private Long id;
    private String name;
    private String description;
    private String type;
    private boolean required;
    private List<String> options;
}
