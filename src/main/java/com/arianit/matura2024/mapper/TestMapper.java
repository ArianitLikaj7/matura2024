package com.arianit.matura2024.mapper;

import com.arianit.matura2024.dto.TestDto;
import com.arianit.matura2024.dto.request.TestRequest;
import com.arianit.matura2024.dto.request.UpdateTestRequest;
import com.arianit.matura2024.entity.Test;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestMapper implements GenericMapper
        <Test, TestDto, TestRequest, UpdateTestRequest> {

    private final ModelMapper modelMapper;

    @Override
    public TestDto toDto(Test entity) {
        return modelMapper.map(entity, TestDto.class);
    }

    @Override
    public Test toEntity(TestRequest request) {
        return modelMapper.map(request, Test.class);
    }

    @Override
    public void toEntity(UpdateTestRequest updateRequest, Test entity) {
        modelMapper.map(updateRequest, entity);
    }
}
