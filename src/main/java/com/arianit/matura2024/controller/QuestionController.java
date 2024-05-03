package com.arianit.matura2024.controller;

import com.arianit.matura2024.dto.QuestionDto;
import com.arianit.matura2024.dto.request.QuestionRequest;
import com.arianit.matura2024.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;


    @PostMapping
    public ResponseEntity<QuestionDto> create(@RequestBody QuestionRequest request) {
        QuestionDto questionDto = questionService.create(request);
        return new ResponseEntity<>(questionDto, HttpStatus.CREATED);
    }
}
