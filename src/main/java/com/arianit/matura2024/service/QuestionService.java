package com.arianit.matura2024.service;

import com.arianit.matura2024.dao.QuestionRepository;
import com.arianit.matura2024.dto.QuestionDto;
import com.arianit.matura2024.dto.request.QuestionRequest;
import com.arianit.matura2024.entity.Question;
import com.arianit.matura2024.mapper.QuestionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper mapper;

    public QuestionDto create(QuestionRequest request){
        Question question = mapper.toEntity(request);
        return mapper.toDto(questionRepository.insert(question));
    }

}
