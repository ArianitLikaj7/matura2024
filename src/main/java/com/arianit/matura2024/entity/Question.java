package com.arianit.matura2024.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
    private String id;
    private String question;
    private String answer;

    @DBRef
    private Subject subject;
}
