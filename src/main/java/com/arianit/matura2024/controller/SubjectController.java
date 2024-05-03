package com.arianit.matura2024.controller;

import com.arianit.matura2024.dto.SubjectDto;
import com.arianit.matura2024.dto.request.SubjectRequest;
import com.arianit.matura2024.entity.Subject;
import com.arianit.matura2024.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping
    public ResponseEntity<SubjectDto> createSubject(@RequestBody SubjectRequest request) {
        SubjectDto subjectDto = subjectService.create(request);
        return new ResponseEntity<>(subjectDto, HttpStatus.CREATED);
    }
}
