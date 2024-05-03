package com.arianit.matura2024.dto;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionDto {
    private String id;
    private String question;
    private String answer;
    private SubjectDto subjectDto;
}
