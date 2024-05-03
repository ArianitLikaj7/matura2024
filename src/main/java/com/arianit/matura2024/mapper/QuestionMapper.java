package com.arianit.matura2024.mapper;

import com.arianit.matura2024.dto.QuestionDto;
import com.arianit.matura2024.dto.request.QuestionRequest;
import com.arianit.matura2024.dto.request.UpdateQuestionRequest;
import com.arianit.matura2024.entity.Question;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class QuestionMapper implements GenericMapper
        <Question, QuestionDto, QuestionRequest, UpdateQuestionRequest> {

    private final ModelMapper modelMapper;


    @Override
    public QuestionDto toDto(Question entity) {
        return modelMapper.map(entity, QuestionDto.class);
    }

    @Override
    public Question toEntity(QuestionRequest request) {
        return modelMapper.map(request, Question.class);
    }

    @Override
    public void toEntity(UpdateQuestionRequest updateRequest, Question entity) {
      modelMapper.map(updateRequest, entity);
    }
}
