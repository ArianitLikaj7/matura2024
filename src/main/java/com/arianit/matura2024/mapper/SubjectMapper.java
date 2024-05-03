package com.arianit.matura2024.mapper;

import com.arianit.matura2024.dto.SubjectDto;
import com.arianit.matura2024.dto.request.SubjectRequest;
import com.arianit.matura2024.dto.request.UpdateSubjectRequest;
import com.arianit.matura2024.entity.Subject;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubjectMapper implements GenericMapper
        <Subject, SubjectDto, SubjectRequest, UpdateSubjectRequest> {

    private final ModelMapper modelMapper;

    @Override
    public SubjectDto toDto(Subject entity) {
        return modelMapper.map(entity, SubjectDto.class);
    }

    @Override
    public Subject toEntity(SubjectRequest request) {
        return modelMapper.map(request, Subject.class);
    }

    @Override
    public void toEntity(UpdateSubjectRequest updateRequest, Subject entity) {
      modelMapper.map(updateRequest, entity);
    }
}
